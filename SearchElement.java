import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n=sc.nextInt();
        boolean found=false;
        int[]arr={15,20,55,10,8,9,55,06,19};

        for(int i:arr){

            if(i==n){
                System.out.println("The element is found : "+ n);
                found=true;
                break;
            }
            // if(i!=n){
            //     System.out.println("The element is not found : "+ n);
                
            // }
        }
        if(found==false)
            System.out.println("Element not found");

    }
    
}
