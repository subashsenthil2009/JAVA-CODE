import java.util.Scanner;

public class MathProblem {
    public static void main(String[] args) {
       
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter the array size ");
    //     int size =sc.nextInt();
    //     size=Math.abs(size);
       

    //     int arr[]=new int[size];

    //     for(int i=0;i<arr.length;i++){
    //         arr[i]=sc.nextInt();
             
    //     }

    //     int min=Integer.MAX_VALUE;
    //     int max=Integer.MIN_VALUE;

    //     for(int i:arr){
    //         min=Math.min(min, i);
    //         max=Math.max(max, i);

    //     }
    //     System.out.println("The minimum Number is : "+ min);
    //     System.out.println("The Maximum Number is : "+ max);

            int sq=(int)Math.sqrt(25);
            System.out.println(sq);

            double power=Math.pow(3, 5);
            System.out.println(power);

            double OTP=Math.random();
            OTP=OTP*10000;

            int fl=(int)Math.floor(OTP);
            System.out.println(fl);
    }
    
}
