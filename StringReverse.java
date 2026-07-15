import java.util.Scanner;

class StringReverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        String s=sc.nextLine();
        
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println(sb.toString());

    }

}