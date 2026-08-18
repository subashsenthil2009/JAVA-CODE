public class ReverseInteger {
    public static void main(String[] args) {
        int i=7854;

        while(i>0){
            int mod=i%10;
            System.out.print(mod);
            i=i/10;
        }
    }
    
}
