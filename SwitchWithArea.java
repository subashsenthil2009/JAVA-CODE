import java.util.Scanner;

public class SwitchWithArea { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Area of the");
        String s= sc.next();
        
        switch(s){
            case "circle" -> {
                    
                    System.out.println("Enter the radius : ");
                    double r= sc.nextDouble();
                    System.out.println("The Area of the Circle :"+(3.14*r*r));
                    break;
            }

            case "rectangle" -> {
                    
                    System.out.println("enter the breath");
                    double b= sc.nextDouble();
                    System.out.println("enter the length");
                    double l= sc.nextDouble();
                    System.out.println("The Area of the Circle :"+(l*b));
                    break;
            }
            
            case "triangle" -> {
                    
                    System.out.println("enter the base");
                    double b=sc.nextDouble();
                    System.out.println("enter the height");
                    double h= sc.nextDouble();
                    System.out.println("The area of the triangle : "+(1/2d*b*h));
                    break;

            }

            case "square" -> {

                    System.out.println("Enter the area");
                    double a= sc.nextDouble();
                    System.out.println("The area of the square is :"+(a*a));
                    break;
            }
                    
        
            default -> System.out.println("Enter the shape");
        
                    
                   
        }
    }
    
}
