import java.util.Scanner;

public class AreaOfTheCircle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Area of the circle");

        double d= sc.nextDouble();
        double area = 22/7d*d*d;

        System.out.println("The area of the circle is "+ area);
        
    }


}
