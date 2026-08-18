import java.util.Arrays;

public class EmployeesData {
    public static void main(String[] args) {
        
        Data d1= new Data("Manager", 95000, "Arul");
        Data d2=new Data("Super visor", 80000, "Babu");
        Data d3=new Data("Employees", 25000, "Dhanish");
        Data d4=new Data("Visitor", 50000, "Farith");
        Data d5=new Data("Visitor", 80000, "Ganesh");
        Data d6=new Data("Owner", 700000, "Hari");

        Data arr[]={d1,d2,d3,d4,d5,d6};
        Arrays.sort(arr,(a,b)->{
            if(a.roll.equals(b.roll)){
                if(a.salary==b.salary)
                   return a.name.compareTo(b.name);            
                else
                   return b.salary-a.salary;
            }
            else
               return a.roll.compareTo(b.roll);
        });

        for(Data i:arr){
            System.out.println(i.roll+"     "+i.salary+"        "+i.name);
        }
    }
    
}

class Data{
    String roll;
    int salary;
    String name;

    public Data(String roll,int salary,String name){
        this.roll=roll;
        this.salary=salary;
        this.name=name;
    }
}
