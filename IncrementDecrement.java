public class IncrementDecrement {
    public static void main(String[] args) {
        
        int incrementvariable= 952;
        
        int decrementvariable= 2471;
       

        System.out.println("pre increment : "+ ++incrementvariable); // 953
        System.out.println("post increment : " + incrementvariable++); // 953
        System.out.println("pre decrement : " + --decrementvariable); //2470
        System.out.println("post decrement : "+ decrementvariable--); //2470

        int result = ++incrementvariable + decrementvariable--; //3423
        System.out.println(incrementvariable);
        System.out.println(decrementvariable);
        System.out.println("res"+ result);

    }

    
}
