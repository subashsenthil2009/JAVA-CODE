public class BinarySearch {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7,8,9,11,6754,67859,575900};
        int st=0;
        int end=arr.length-1;
        int target=575900;
        while(st<=end){
            int mid=(st+end)/2;//st+(end-st)/2

            if(arr[mid]==target){
                System.out.println("Element found at index  :  "+mid);
                break;
            }
            else if(arr[mid]<target){
                st=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
        }
    }
    
}
