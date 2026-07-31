import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

class LearnQueue{
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        //add keyword
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);

        System.out.println(queue);

        //size keyword
        System.out.println("queue size is. : "+queue.size());
        
        //peek keyword
        System.out.println(queue.peek());

        //poll keyword
        System.out.println(queue.poll());

        Queue<Integer> q=new ArrayBlockingQueue<>(4);

        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.add(60));

        //offer keyword
        System.out.println(q.offer(50));

        for(int i:queue){
            System.out.print(i);
        }
System.out.println();
        while(!queue.isEmpty()){
            System.out.print("  "+queue.poll());
        }
System.out.println();
        q.clear(); 
        System.out.println(q);
    }
}