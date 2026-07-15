import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the number");

        /*int n=               scanner.nextInt();
        System.out.println("the number is n="+ n);

        float f= scanner.nextFloat();
        System.out.println("the number is f="+ f );

        long l= scanner.nextLong();
        System.out.println("l="+ l );

        boolean b=  scanner.nextBoolean();
        System.out.println("s="+b);*/

        //char c= scanner.nextChar();

        // String s= scanner.nextLine();
        // System.out.println("s="+ s);

        char ch=scanner.next().charAt(0);
        System.out.println("the char is : "+ch);

        scanner.close();
    }
}
