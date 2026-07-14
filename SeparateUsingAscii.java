import java.util.Scanner;

public class SeparateUsingAscii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value");
        String s=sc.nextLine();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int n=c;
            if((n>=48)&&(n<=57))
                System.out.println("It is the number --> "+c);
            
            else if((n>=65)&&(n<=90))
                System.out.println("It is the Uppercase letter is --> "+c);

            else if((n>=97)&&(n<=122))
                System.out.println("It is the Lowercase letter is -->"+c);
            
            else
                System.out.println("It is others ");

            
        }
        
    }
    
}
