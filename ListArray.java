import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();

        //Add keyword
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println(list);

        list.add(0,10);
        System.out.println(list);

        //Set keyword
        list.set(5,20);
        System.out.println(list);

        //Remove keyword
        list.remove(7);
        System.out.println(list);

        //Get keyword
        System.out.println(list.get(5));

        //Size keyword
        System.out.println(list.size());

        //Clear keyword
        list.clear();
        System.out.println(list);
    }
    
}
