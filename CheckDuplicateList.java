import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CheckDuplicateList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size=sc.nextInt();
        
        for(int i=0;i<size;i++){
        System.out.println("Enter the number");
        int n=sc.nextInt();
        list.add(n);
        }
        System.out.println(list);

        Set<Integer> set=new HashSet<>();
        
        for(int i:list){
            set.add(i);
           
    }
        if(list.size()==set.size())
            System.out.println("Duplicate value is not found ");
        else
            System.out.println("The Duplicate value is found ");
          
        System.out.println(set);
    
        System.out.println("Duplicate element or");
        for(int i:list){
            if(set.contains(i))
                set.remove(i);
            else
                System.out.println(i);
        }
        }
        
    
}
