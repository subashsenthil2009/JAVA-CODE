import java.util.InputMismatchException;
import java.util.Scanner;

public class DisplayAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try{
            System.out.println("Enter the total mark : ");
            int i=sc.nextInt();

            System.out.println("Total Number of subject : ");
            int j=sc.nextInt();

            float average=i/j;
            System.out.println("The average is : "+average);
        }
        catch(InputMismatchException i){
            System.out.println("Enter the correct input ");
        }
        catch(ArithmeticException a){
            System.out.println("Arithmetic Exception-- ");
        }
        catch(Exception b){
            System.out.println("Exception excecuted---");
        }
        finally{
            System.out.println("Programm ended successfully ...");
        }
    }
    
}
