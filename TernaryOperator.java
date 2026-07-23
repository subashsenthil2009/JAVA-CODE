public class TernaryOperator {
    public static void main(String[] args) {
        
        TernaryOperator obj=new TernaryOperator();
        System.out.println(obj.type(100, 200));
    
        int y=(false) ? 10:50;
        System.out.println(y);
    }

    public boolean type(int m,int n){

        return(m>n)? true : false ;
    }
    
}
