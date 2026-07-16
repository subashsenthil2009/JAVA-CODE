public class Calculator{
    int  temp=1000;
    public  int sub(int a,int b){
          
     temp=100;      
 
        int sum=a-b;
        display(sum);
        return sum;
    }

    public int multi(int a, int b){
        
        
        int sum=a*b;
        display(sum);
        return sum;
    }

    public int add(int a, int b){

        int sum=a+b;
        display(sum);
        return sum;
    }

    public int div(int a,int b){

        int sum=a/b;
        display(sum);
        return sum;
    }

    void display(int sum){
        System.out.println("The answer is : "+sum);
    }
}