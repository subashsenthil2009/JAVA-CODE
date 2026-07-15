import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the Number");

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int res=0;

        if(a<=b)
            res= a;

        else
            res= b;

        if(res<=c)
            res= res;
        else
            res = c;

        System.out.println("The smallest number is "+ res);


    }
   
    
}
