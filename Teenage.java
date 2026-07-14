import java.util.Scanner;

public class Teenage {
    public static void main(String[] args) {
        Scanner   scanner= new Scanner(System.in);
        System.out.println("teen age");

        int i=scanner.nextInt();

        if((i>=18)&&(i<=28))
        {
            System.out.println("i is teen agers");

        }

        else if((i>28)&&(i<100)) 

        {
            System.out.println("you are parent");

        }

        else if (i>=100)
        {
            System.out.println("invalid age");

        }
        else 
        {
            System.out.println("i is not teen agers");
        }
        
    }
}
