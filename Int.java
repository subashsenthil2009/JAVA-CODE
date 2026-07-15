import java.util.Scanner;

public class BiggestOfThreeNumbers{
    public static void main (String args[]) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Number");

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int max=0;

        if(a>=b)
            max=a;
        else
            max=b;

        if(max<=c)
            max=c;

        System.out.println("The Largest number is :"+ max );
    
    }
}