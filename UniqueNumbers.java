import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNumbers {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(30);
        list.add(50);


        Set<Integer> set=new TreeSet<>();
        
        for(int i:list){
            set.add(i);
        }
      
        System.out.println(set);

        list.clear();

        for(int i:set){
            list.add(i);
        }
        System.out.println(list);
        
    }
    
}
