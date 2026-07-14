public class Data {
   public static void main(String[] args) {
    
   
    int i=100;
    float f=105242.1f;
    
    long l=14752512;
    double d=0.77d;
    boolean b=true;
    boolean a=false;
    char c='#';

    String s="subash";
   

    System.out.print(s);
   
    System.out.println(i+f);
    System.out.println(s+c);
    System.out.println(s+i);
    System.out.println(s+" "+i+" "+f);
    System.out.printf("%.6f", d);

    Sample r=new Sample();

    String  h=new String("hi");

    System.out.println();
    System.out.println(h);
    System.out.print(i+" "+b);
    System.out.print(i+" "+a);
}

}