import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FirstRepeated {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(30);
        list.add(50);

        Set<Integer> set=new LinkedHashSet<>();

        for(int i:list){
            set.add(i);
        }
        for(int i:list){
            if(set.contains(i))
                set.remove(i);
                
            else{
                System.out.println(i);
                 break;
            }
        }
        
    }
    
}
