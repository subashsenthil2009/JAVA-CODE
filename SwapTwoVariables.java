import java.util.Scanner;

public class SwapTwoVariables {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Variable a");
       int a=sc.nextInt();

       System.out.println("Enter the Variable b");
       int b=sc.nextInt();
        
        System.out.println("Before Swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("After Swap");
        
        // int temp=a;
        // a=b;
        // b=temp;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
    
}
