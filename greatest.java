import java.util.Scanner;
class greatest
{
    public  static void main(String[] args)
    {
       Scanner x=new Scanner(System.in);
       System.out.println("Enter a number 1 : ");
       int a=x.nextInt();
       System.out.println("Enter a number 2 : ");
       int b=x.nextInt();
       System.out.println("Enter a number 3 : ");
       int c=x.nextInt();
       if(a>b&&a>c)
       {
        System.out.println(a+" is the greatest");
       }
       else if(b>c)
       {
        System.out.println(b+" is the greatest");
       }
       else
       {
        System.out.println(c+" is the greatest");
       }
       x.close();
    }
}