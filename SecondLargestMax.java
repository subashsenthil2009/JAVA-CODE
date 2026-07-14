import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int i=sc.nextInt();

        int[] arr=new int[i];

        for(int n=0;n<arr.length;n++){
            Scanner Sc=new Scanner(System.in);
            System.out.println("Enter the Value");
            int s=Sc.nextInt();

            arr[n]=s;
            
        }
        for(int n=0;n<arr.length;n++){
            System.out.println(arr[n]);
        }

//         int max=Integer.MIN_VALUE, Secmax=Integer.MIN_VALUE;
//         System.out.println(Integer.MIN_VALUE
// );

//         for(int n=0;n<arr.length;n++){

//             if(max<arr[n]){
//                 max=arr[n];
//             }
//         }

//         for(int n=0;n<arr.length;n++){

//             if(Secmax<arr[n] && arr[n]!=max){
//                 Secmax=arr[n];
//             }
//         }
//         System.out.println("The Second Largest Number is : "+ Secmax);
        
        Arrays.sort(arr);
            System.out.println("The Second Largest Number is : "+arr[arr.length-2]);
        
        
        
        System.out.println("The size is : "+i);
    }
    
}
