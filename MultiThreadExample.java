class Task1 extends Thread {
public void run() {
for(int i=1;i<=3;i++)
System.out.println("Task 1 - Count " + i);
}
}
class Task2 extends Thread {
public void run() {
for(int i=1;i<=3;i++)
System.out.println("Task 2 - Count " + i);
}
}
public class MultiThreadExample {
public static void main(String[] args) {
Task1 t1 = new Task1();
Task2 t2 = new Task2();
t1.start(); // start fi rst thread
t2.start(); // start second thread
}
}
