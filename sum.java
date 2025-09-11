import java.util.Scanner;
class sum
{
    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a value for a : ");
        int a=x.nextInt();
        System.out.println("Enter a value for b : ");
        int b=x.nextInt();
        int sum=a+b;
        System.out.println("The Sum is "+sum);
        x.close();
    }
}