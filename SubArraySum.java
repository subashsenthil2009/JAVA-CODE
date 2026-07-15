public class SubArraySum {
    public static void main(String[] args) {
        int [] arr={1,-67,2,-90,3,-6,-1,4,5};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");
                    
                }
                    max=Math.max(max, sum);  
                    min=Math.min(min,sum);

                    System.out.println("--> "+sum);
            }

        }
                    System.out.println("The Minimum Sum is : "+min);
                    System.out.println("The Maximum Sum is : "+max);
    }
    
}
