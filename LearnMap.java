import java.util.HashMap;
import java.util.Map;

class LearnMap{
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();

        //Put Keyword
        map.put(1, "Arun");
        map.put(2, "Babu");
        map.put(3, "Kannan");
        map.put(4, "Sabari");
        map.put(5, "Yuva");
        map.put(4, "Subash");
        System.out.println(map);

        //Get keyword
        System.out.println(map.get(4));
        System.out.println(map.get(123));

        //Remove keyword
        System.out.println(map.remove(2));
        System.out.println(map.remove(150));

        //keyset keyword
        System.out.println(map.keySet());

        //values keyword
        System.out.println(map.values());

        //General format to access the map in a loop
        for(Map.Entry<Integer,String> i:map.entrySet()){
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        }

        System.out.println("for loop using map.keyset()");

        for(Integer i:map.keySet()){
            System.out.println("key : "+i+" Value : "+map.get(i));
        }

        //Containskey keyword
        System.out.println(map.containsKey(123));
        System.out.println(map.containsKey(1));

        System.out.println("map.contains value ");

       //containsvalue keyword
        System.out.println(map.containsValue("Hello.."));
        System.out.println( map.containsValue("Subash"));

        //getOrDefault keyword
        String i=map.getOrDefault(40, "Dharaneesh");
        System.out.println(i);

        //size keyword
        System.out.println(map.size());

        //Clear keyword
        map.clear();
        System.out.println(map);

        //isEmpty keyword
        System.out.println(map.isEmpty());
    }
}