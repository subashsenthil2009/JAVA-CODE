import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("age caculation");

        int i= sc.nextInt();

        System.out.println("The enter number is "+i); 

        if(i>0)
        {
            System.out.println("It is a Positive number");
            if((i>0)&&(i<=10)){
                System.out.println("The person is child");
            }
            else if((i>10)&&(i<=21)){
                System.out.println("The person is student");
            }
            else if ((i>21)&&(i<=60)){
                System.out.println("The person is employe");
            }
            else if (i>60)
                System.out.println("The person is retirement");
        }
        else if(i<0){
            System.out.println("It is a Negative number");
        }
        else if(i==0){
            System.out.println("It is a zero");
        }

    }
}
