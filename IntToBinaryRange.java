public class IntToBinaryRange {
    public static void main(String[] args) {
        int i=8;
       

        for( i=0;i<8;i++){
            int n=i;
             String binary=" ";
            while(n>0){
                binary+=n%2;
                n=n/2;
            }
            StringBuilder sb =new StringBuilder();
            sb.append(binary);
            sb.reverse();
            binary=sb.toString();

            System.out.println(binary);
        }
        
    }
    
}
