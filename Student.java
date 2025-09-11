public class Student {
    void details() {
        int age = 10;
        age += 5;
        System.out.println("Age is " + age);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.details();
    }
}
