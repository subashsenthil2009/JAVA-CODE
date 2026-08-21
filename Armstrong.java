public class Armstrong {
    public static void main(String[] args) {
        
        int i=153;
        int copy=i;
        int sum=0;
         
        while(i>0){
            int mod=i%10;
            System.out.println(mod);
            i=i/10;

          int j=  mod*mod*mod;
              sum+=j;
          System.out.println(j);

        }
        System.out.println("Armstrong answer : "+sum);

        if(sum==copy)
            System.out.println("It is Armstrong ");
        else
            System.out.println("It is not an Armstrong ");
    }

    
}
