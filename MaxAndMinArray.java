public class MaxAndMinArray {
    public static void main(String[] args) {
        int[] array={40,10,30,20,50};
        int max=array[0];
        int min=array[0];

        for(int i:array){

        if(i>max){
            max=i;
        }
        if(i<min){
            min=i;
        }
       
    }
        System.out.println("Max : "+ max);
        System.out.println("Min : "+ min);
                           


    }
    
}
