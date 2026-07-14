import java.util.Scanner;

public class AlgebraFormulae {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");

        
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        

        System.out.println("Enter the value is : "+(a*a+b*b+2*a*b));
    }
}
