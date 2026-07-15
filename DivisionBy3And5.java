import java.util.Scanner;

public class DivisionBy3And5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int i=sc.nextInt();
        int reminder=i%3;
        int rem=i%5;

        if((reminder==0)&&(rem==0))
            System.out.println("It is divisible by 3 and 5");

        else
            System.out.println("It is not divisible by both 3 and 5");
    }
}
