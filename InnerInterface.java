 class Interface {
    public static void main(String[] args) {
        
        Payment payobj=new Gpay();
        payobj.showwelcome();
        Payment.showthanks();
    }
    
}

interface Payment{
   
   default public void showwelcome(){
    System.out.println("Welcome............");
   }

   public static void showthanks(){
    System.out.println(">>>>>>>>>Thanks<<<<<<<<");
   }

    public boolean pay();
}

class Gpay implements Payment {
    
    @Override
    public boolean pay(){
        return true;
    }
}

class Phonepay implements Payment{

    @Override
    public boolean pay(){
        return true;
    }
}