public class OddAndEven {
    public static void main(String[] args) {
         int[] arr={1,45,20,9,10};
         int odd=0,  even=0;

         for(int i:arr){

            if(i%2==0){
                even=even+1;
            }

            if(i%2==1){
                odd++;
            }

         }
         System.out.println("Odd : "+odd);
         System.out.println("even : "+ even);
         
    }
    
}
