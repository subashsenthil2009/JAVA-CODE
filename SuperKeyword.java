public class SuperKeyword {
    public static void main(String[] args) {
     B obj=new B();
     obj.hi();   
    }
    
}

class X{

    public void hi(){
        System.out.println("this is class X ");
    }
}

class A extends X{
    A(){
        System.out.println("this is X default constructor");
    }
    int x=100;
    @Override
    public void hi(){
        System.out.println("This is class A ");
    }
}

class B extends A{
    int x=3000;

    public B(){
        super();
    }
    @Override
    public void hi(){
        System.out.println(super.x);
        super.hi();
        System.out.println("this is class B");
    }
}