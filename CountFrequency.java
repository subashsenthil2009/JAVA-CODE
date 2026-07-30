import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
       
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

        Map<Integer,Integer> map=new HashMap<>();

        for(int j=0;j<list.size();j++){
                //map.put(list.get(j), map.getOrDefault(list.get(j), 0)+10);0
            if(map.containsKey(list.get(j)))
                map.put(list.get(j), map.get(list.get(j))+1);
            else
                map.put(list.get(j), 1);
        }
       System.out.println(map);
    }

}
