import java.util.Arrays;

public class LambdaSorting {
    public static void main(String[] args) {
             
        Data d1 = new Data("cse", "dharaneesh", 21);
        Data d2 = new Data("ece", "arun", 22);
        Data d3 = new Data("cse", "arun", 20);
        Data d4 = new Data("eee", "bala", 23);
        Data d5 = new Data("cse", "dharaneesh", 19);
        Data d6 = new Data("ece", "dharani", 21);
        Data d7 = new Data("cse", "arun", 25);
        Data d8 = new Data("eee", "arun", 20);
        Data d9 = new Data("ece", "arun", 19);
        Data d10 = new Data("cse", "bala", 22);

        Data arr[]={d1,d2,d3,d4,d5,d6,d7,d8,d9,d10};
        Arrays.sort(arr,(a,b)->{
            if(a.dept.equals(b.dept)){
                if(a.name.equals(b.name))
                    return a.age-b.age;
                else
                    return a.name.compareTo(b.name);
            }
            else
                return a.dept.compareTo(b.dept);
        });

        for(Data i:arr){
            System.out.println(i.dept+"   "+i.name+"  "+i.age);
        }
    }
}

class Data{
    String dept;
    String name;
    int age;
    public Data(String dept,String name,int age){
        this.dept=dept;
        this.name=name;
        this.age=age;
    }

}
  
    