import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number"); 
        int i=sc.nextInt();
        
        for(int j=1;j<=i;j++){
            
            if(i%j==0)
                System.out.println(j);
        }

    }
    
}
