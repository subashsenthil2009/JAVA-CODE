import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int i=sc.nextInt();

        if(i>=0)
            System.out.println("The  number is positive : "+ i);
        else
            System.out.println(i*-1);
        
            

    }

    public static int abs(int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abs'");
    }
}