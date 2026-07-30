import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondLargeAndSmallNum {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(50);
        list.add(90);
        list.add(100);
        list.add(40);
        list.add(10);

        Set<Integer> set=new HashSet<>(list);
        System.out.println(set);
        list.clear();
        for(int i:set){
            list.add(i);
        }
        
        Collections.sort(list);
        System.out.println("The Second smallest number : "+list.get(1));
        System.out.println("The Second largest number : "+list.get(list.size()-2));
        System.out.println(list);

    
    
    }
    
}
