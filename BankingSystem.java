// Very Simple Banking System

// Custom Exceptions
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

// Base Class
class Account {
    String accountNumber;
    double balance;

    public Account(String accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Balance = " + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Not enough balance!");
        }
        balance -= amount;
        System.out.println(amount + " withdrawn. Balance = " + balance);
    }
}

// SavingsAccount (minimum balance rule)
class SavingsAccount extends Account {
    final double MIN_BAL = 500;

    public SavingsAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (balance - amount < MIN_BAL) {
            throw new InsufficientBalanceException("Need to keep minimum balance " + MIN_BAL);
        }
        super.withdraw(amount);
    }
}

// CurrentAccount (overdraft allowed)
class CurrentAccount extends Account {
    public CurrentAccount(String accNo, double bal) {
        super(accNo, bal);
    }
}

// Interface
interface Transaction {
    void transfer(Account from, Account to, double amt) throws InsufficientBalanceException;
}

// Implementation
class TransactionImpl implements Transaction {
    public void transfer(Account from, Account to, double amt) throws InsufficientBalanceException {
        from.withdraw(amt);
        to.deposit(amt);
        System.out.println("Transferred " + amt + " from " + from.accountNumber + " to " + to.accountNumber);
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        try {
            SavingsAccount s = new SavingsAccount("SAV100", 1000);
            CurrentAccount c = new CurrentAccount("CUR200", 2000);

            s.deposit(500);
            s.withdraw(600);

            Transaction t = new TransactionImpl();
            t.transfer(s, c, 200);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
