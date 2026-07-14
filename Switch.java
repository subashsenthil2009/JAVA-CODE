import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("The Name is");

        int i= sc.nextInt();

        switch (i){
            case 01: 
                System.out.println("The name is subash");
                break;

            case 02:
                System.out.println("The name is absar");
                break;
        
            case 03:
                System.out.println("The name is sarvan");
                break;

            default:
                System.out.println("The name is not a person");
            }    
        }
    }