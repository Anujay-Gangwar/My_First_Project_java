import java.util.Scanner;

public class percOfStudent
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double num1,num2,num3,num4,num5;
        double percentage;
        System.out.print("Enter the marks of maths = ");
        num1 = sc.nextInt();
        System.out.print("Enter the marks of science = ");
        num2 = sc.nextInt();
        System.out.print("Enter the marks of social science = ");
        num3 = sc.nextInt();
        System.out.print("Enter the marks of hindi = ");
        num4 = sc.nextInt();
        System.out.print("Enter the marks of english = ");
        num5 = sc.nextInt();
        percentage= ((num1+num2+num3+num4+num5)/500)*100;
        System.out.print("Percentage of all subjects = "+percentage+"%");
    }
}
