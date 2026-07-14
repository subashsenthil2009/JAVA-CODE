import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
             
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");

        int i=1;
        int n=sc.nextInt();

        while(i<=n){
            
            if((i%3==0)&&(i%5==0)) 
                System.out.println("fizzBuzz");

            else if (i%5==0)
                System.out.println("buzz");

            else if (i%3==0)
                System.out.println("Fizz");

            else
                System.out.println(i);
            i++;

        }



    
    

        /*
        1   1 
        2   2
        3   fizz    
        4   4
        5   buzz
        6   fizz
        7   7
        8   8
        9   fizz
        10  buzz
        */
    }
}
