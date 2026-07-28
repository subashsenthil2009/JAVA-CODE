import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
    public static void main(String[] args) {
    //     Set<Integer> set= new HashSet<>();
    //     //Add keyword
    //     set.add(10);
    //     set.add(20);
    //     set.add(30);
    //     set.add(10);
    //     set.add(20);
    //     set.add(450);
    //     set.add(550);
    //     set.add(100);
    //     set.add(500);
    //     set.add(900);

    //     System.out.println(set);

    //     //Size keyword
    //     System.out.println("The set of size is : "+set.size());

    //     //remove keyword
    //     System.out.println("Before remove : "+set);
      
    //     if( set.remove(550))
    //     System.out.println("The element is removed ");
    //     else
    //     System.out.println("The element is not removed ");

    //    System.out.println("After removre : "+set);

    //    //contain keyword
    //    if(set.contains(450))
    //     System.out.println("The element is found ");
    //    else 
    //     System.out.println("The element is not found ");

    //    //clear keyword
    //     set.clear();
    //     System.out.println(set);

    // Set<Integer> set= new LinkedHashSet<>();

    //     set.add(1);
    //     set.add(2);
    //     set.add(3);
    //     set.add(1);
    //     set.add(3);
    //     set.add(4);
    //     set.add(5);
    //     System.out.println(set);

        TreeSet<Integer> set=new TreeSet<>();

        //Add keyword
        set.add(10);
        set.add(100);
        set.add(560);
        set.add(8850);
        set.add(1);
        System.out.println(set);

        //First keyword
        System.out.println(set.first());

        //Last Keyword
        System.out.println(set.last());

        //Higher keyword
        System.out.println(set.higher(1));

        //Lower keyword
        System.out.println(set.lower(8850));

        //Ceiling keyword
        System.out.println(set.ceiling(561));

        //Floor keyword
        System.out.println(set.floor(8845));
    }
    
}
