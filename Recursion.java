public class Recursion {
    public static void main(String[] args) {
        
        Recursion obj=new Recursion();
        System.out.println("Factorial :  "+obj.Factorial(6));
    
        System.out.println("Sum of Natural Numbers :  "+obj.sumofNaturalNumbers(20));

        System.out.println("Sum of Digits :  "+obj.sumofDigits(123456));

        int n=1233;
        int res=0;

        while(n>0){
            res=res+n%10;
            n=n/10;
        }
        System.out.println("Sum of digits using for Loop : "+res);

            obj.fibanocci(10);

        System.out.println("Fibanocci without recursion : ------------------------>");

        int n1=0,n2=1;
        
        for(int i=0;i<8;i++){
            System.out.println(n1);
            int temp=n2;
            n2=n1+n2;
            n1=temp;
        }
    }

    public int Factorial(int n ){
        
        if(n==1)
            
            return 1;
        
        return n*Factorial(n-1);
        
    }

    public int sumofNaturalNumbers(int n){
        if(n==1)
            return 1;
        return n+sumofNaturalNumbers(n-1);

    }

    public int sumofDigits(int n){
        if(n==0)
            return 0;
        return n%10+sumofDigits(n/10);
    }

    public void fibanocci(int len){

        Recursion rec=new Recursion();
        rec.helper(len,0,1);
    }

    int itr=0;
    public void helper(int len, int st, int st1){

        if(itr>=len){
            itr=0;
            return;

        }
        
        System.out.println(st);
        itr++;
        helper(len, st1, st+st1);
    }
}
