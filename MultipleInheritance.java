public class MultipleInheritance {
    public static void main(String[] args) {
        Testclass obj=new Testclass();
        obj.showwelcomemessage();
        System.out.println(obj.paymentstatus());
        obj.showthanksmessage();
    }
    
}

interface Message{


    public void showwelcomemessage();
    public void showthanksmessage();

}

interface Payment{

    public boolean paymentstatus();
}

class Testclass implements Message,Payment{

    @Override
    public void showwelcomemessage(){
        System.out.println("Welcome......");
    }
    
    @Override
    public void showthanksmessage(){
        System.out.println("Thanks......");
    }

    @Override
    public boolean paymentstatus(){
        return true;
    }

   
}