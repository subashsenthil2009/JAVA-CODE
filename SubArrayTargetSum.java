public class SubArrayTargetSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=12;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];            
                }
                if(sum==target){
                        flag=true;
                        for(int l=i;l<=j;l++){
                            System.out.print(arr[l]+" ");
                        }
                        System.out.println();
                    }        
            }
        }
                    System.out.println(flag);

    }
    
}
