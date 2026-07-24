import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();

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

        list.set(5,20);
        System.out.println(list);

        list.remove(7);
        System.out.println(list);

        System.out.println(list.get(5));

        System.out.println(list.size());

        list.clear();
        System.out.println(list);
    }
    
}
