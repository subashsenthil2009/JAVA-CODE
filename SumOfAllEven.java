import java.util.Scanner;

public class SumOfAllEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();

        int i=2;
        int sum=0;

        while(i<=n){
            sum=sum+i;
            i = i+2;
            System.out.println("Sum of the all even Numbers  : "+ sum);
        }
        sc.close();
    }
    
    
}

