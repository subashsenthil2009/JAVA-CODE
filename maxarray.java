import java.util.Scanner;

public class maxarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
                Scanner Sc=new Scanner(System.in);
                System.out.println("Enter the Value");
                int s=sc.nextInt(); 

                arr[i]=s;
               
            }
            for(int i=0;i<arr.length;i++){
                 System.out.println(arr[i]);
            }

        int max=arr[0];
        for(int i=0;i<arr.length;i++){

            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("max = "+max);
        System.out.println("The size is : "+n);
        
        
    }
    
}
