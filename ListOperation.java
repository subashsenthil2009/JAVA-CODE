import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOperation {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(5,15,25,35,45,55,65,67,75,85,95,10,20,30,40,50,60,70,80,90,100));

        List<Integer> even=new ArrayList();
        List<Integer> odd=new ArrayList<>();

        for(int i:list){
            if(i%2==1){
                odd.add(i);
            }
            else
                even.add(i);
        }
        System.out.println(odd);
        System.out.println(even);
        // for(int i:list){

            
        //     if(i>50)
        //         System.out.println(i);
        // }

        
    }
    
}
