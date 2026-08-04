import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

class LearnPriorityQueue{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        pq.add(123);
        pq.add(45);
        pq.add(1245);
        pq.add(1);

        System.out.println(pq);
        System.out.println("size : "+pq.size());
        
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}