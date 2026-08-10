import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int i=sc.nextInt();
        int var=1;

        for(int j=1;j<=i;j++){
            var=var*j;
            
        }

        System.out.println("res  :  "+var);
    }
    
}
