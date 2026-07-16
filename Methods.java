public class Methods {
    public static void main(String[] args) {
    
        int arr[]=new int[10];
        System.out.println(arr[8]);
        // Methods opps=new Methods();
        
        // System.out.println(opps.sub(8,10));
        
        // System.out.println("Multiplication : "+opps.multi(10,10));

        Calculator cal=new Calculator();
        
        cal.add(3, 15);
        cal.multi(15, 2);
        int n=cal.temp;
        System.out.println(n);
        

    }

    public static int sub(int a,int b){
           
            int sum=a-b;
            return sum;
    }

    public int multi(int a, int b){
        
        System.out.println(sub(5, 10));

        int sum=a*b;
        return sum;

    }
    
}


