import java.util.Scanner;

public class Rulesif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The days name is :");
        String s=sc.next();
        
        switch (s){
            case "Sunday" -> System.out.println("The day is sunday");
            case "Monday" -> System.out.println("The day is monday");
            case "Tuesday" -> System.out.println("The day is tuesday");
            default -> System.out.println("The day is not in the switch statement");
        }
        

    }
}
