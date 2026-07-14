import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Value");
         char c=sc.next().charAt(0);

         int asciivalue=c;
        System.out.println("The Ascii Value of  "+ c+" is "+ asciivalue);
    }
    
}
