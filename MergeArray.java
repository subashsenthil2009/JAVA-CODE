public class MergeArray {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr2[]={4,5,6};
        int res[]=new int[arr.length+arr2.length];
        int ind=0;
        for(ind=0;ind<arr.length;ind++){
            res[ind]=arr[ind];
        }
        //[1 2 3 4 5 6]
        // 0 1 2

        for(ind=arr.length;ind<res.length;ind++){
            res[ind]=arr2[ind-arr.length];
        }

        for(int i:res){
            System.out.println(i);
        }
    }   
}
