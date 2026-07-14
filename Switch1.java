import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Result :");
        
        float num1= sc.nextFloat();
        float num2=sc.nextFloat();
        char symbol= sc.next().charAt(0);
        switch (symbol){
            case '+':
                System.out.println("result"+(num1+num2));
                break;
            
            case '-':
                System.out.println("result"+ (num1-num2));
                break;
            
            case '*':
                System.out.println("result"+ (num1*num2));
                break;

            case '/':
               if(num2==0){
                System.out.println("unable to divide");
               }

               else{
                System.out.println("result"+(num1/num2));
               }
               break;

            default: System.out.println("enter the value");
            
        }
    }
}
