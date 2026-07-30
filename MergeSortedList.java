import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(90);
        list.add(100);

        List<Integer> list2=new ArrayList<>();
        
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(9);
        list2.add(10);
        
        
        // List<Integer> mergelist=new ArrayList<>();

        // for(int i:list){
        //     mergelist.add(i);
        // }

        // for(int j:list2){
        //     mergelist.add(j);
        // }

        // Collections.sort(mergelist);
        // System.out.println(mergelist);

        List<Integer> mergeList=new ArrayList();
System.out.println("hii");
        int ind1=0,ind2=0;
        while(ind1<list.size() && ind2<list2.size()){

            if(list.get(ind1)<=list2.get(ind2)){
                mergeList.add(list.get(ind1));
                ind1++;
            }

            if(list2.get(ind2)<list.get(ind1)){
                mergeList.add(list2.get(ind2));
                ind2++;
            }
        }
System.out.println("hello");
        while(ind1<list.size()){
            mergeList.add(list.get(ind1++));
        }
        System.out.println("hdey");
        while (ind2<list2.size()) {
            mergeList.add(list2.get(ind2++));
        }
        System.out.println(mergeList);
    }
    
}
