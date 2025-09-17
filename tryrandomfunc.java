import java.util.Random;

public class  tryrandomfunc {
    public static void main (String[] args) {
        Random rand = new Random();

        // Generate 10 random numbers between 1 and 100
        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(100) + 1; // random number from 1 to 100
            System.out.println("Random number " + i + ": " + num);

            // Check if number is even or odd
            if (num % 2 == 0) {
                System.out.println("  → It is even");
            } else {
                System.out.println("  → It is odd");
            }

            // Check if number is greater than 50
            if (num > 50) {
                System.out.println("  → Greater than 50");
            } else {
                System.out.println("  → Less than or equal to 50");
            }
        }
    }
}
