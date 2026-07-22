public class Abstraction {
    public static void main(String[] args) {
        sample s=new dummy2();
        s.byeee();
        s.hai();
        
        dummy d= new dummy2();
        d.text();
    }
}

abstract class sample {

    public void hai(){
        System.out.println("Hai.........");
    }

    abstract public void byeee();
}

abstract class dummy extends sample{
    @Override
    public void byeee(){
        System.out.println("Byeeeeeeeee...........");
    }
    
      abstract public void text();
}

class dummy2 extends dummy{

    @Override
    public void byeee(){
        System.out.println("Excuse me......");
    }

    public void text(){
        System.out.println("Avolothane!!!!!!!!!!!");
    }
}