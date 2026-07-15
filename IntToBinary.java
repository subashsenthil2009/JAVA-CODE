import java.util.Scanner;

public class IntToBinary {
    public static void main(String[] args) {
       int n=85;
       String binary=" ";

       while(n>0){
        binary+=n%2;
        n=n/2;
    }
        StringBuilder sb=new StringBuilder();
        sb.append(binary);
        sb.reverse();
        binary= sb.toString();
        System.out.println(binary);
        
    }
    
}
