import java.util.Scanner;

public class MyJava
{

    public static int a;
    public static int b;


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the numbers");

        a = scan.nextInt();

        b = scan.nextInt();

       int sum =  InterOperabilityKt.add(a,b);

       System.out.println("The result is : " +sum);

    }

    public static int calculateArea(int l, int b)
    {
        int areaResult = l * b;

        return  areaResult;
    }


}
