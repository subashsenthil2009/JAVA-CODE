public class LinearSearch {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,2343,54765,7534,97897,1};
        int target=1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element fount at index  : "+i);
                break;
            }
        }
    }
    
}
