public class CalculatorInheritance {
    public static void main(String[] args) {
        ClassArray obj=new ClassArray();
        int arr[]={10,15,5,20,50};
        int x=obj.add(arr);
        System.out.println(x);
    }
    
}

class ClassTwo{
    public  int add(int x,int y){
        int sum=x+y;
        return sum;
}

    public  float add(int x,int y,int z){
        int sum=x+y+z;
        return sum;
}
}

class ClassThree extends ClassTwo{
    @Override
    public  int add(int x,int y){
    
        int sum=x+y;
        return sum;
}

}

class ClassArray extends ClassThree{
    public int add(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            
        }
        return sum;
    }
}