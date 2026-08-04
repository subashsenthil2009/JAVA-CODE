public class ExceptionHandling {
    public static void main(String[] args) {
        
        try{
            int arr[]={};
            arr[1]=4211;
            int x=34657/0;
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds ");
        }
        catch(ArithmeticException a){
            System.out.println("Arithmetic Exception ");
        }
        catch(Exception a){
            System.out.println("Exception error");
        }
        finally{
            System.out.println("End of bounds ");
        }

    }
    
}
