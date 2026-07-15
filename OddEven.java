import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int i=sc.nextInt();
      int reminder= i%2;
      if(reminder==1)
        System.out.println("It is Odd number");

      else
        System.out.println("It is even number");
    
    }    
}
