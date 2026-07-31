import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        
        Stack<Integer> stack= new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack);

        System.out.println("Stack size is : "+stack.size());
        System.out.println("peek : "+stack.peek());

        System.out.println("pop : "+stack.pop());
        System.out.println(stack);

        

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        stack.clear() ;
        
        System.out.println(stack.isEmpty());
        System.out.println(stack.empty());

       
    }
    
}
