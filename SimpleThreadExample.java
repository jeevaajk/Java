import java.util.Scanner;

class DivisibleBy5 extends Thread {
    int[] arr;
    DivisibleBy5(int[] arr) {
        this.arr = arr;
    }
    public void run() {
        System.out.println("Numbers divisible by 5:");
        for (int num : arr) {
            if (num % 5 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}

class Average extends Thread {
    int[] arr;
    Average(int[] arr) {
        this.arr = arr;
    }
    public void run() {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Average = " + (sum / (double)arr.length));
    }
}

public class SimpleThreadExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Start threads
        new DivisibleBy5(arr).start();
        new Average(arr).start();
    }
}