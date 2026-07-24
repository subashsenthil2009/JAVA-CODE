import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class StudentArrayList {
    public static void main(String[] args) {
//         // ArrayList<String> list=new ArrayList<>();

//         // list.add("Anbu");
//         // list.add("Babu");
//         // list.add("Arun");
//         // list.add("Kumar");
//         // list.add("Kannan");
//         // list.add("Yuva");
//         // list.add("Guru");
//         // list.add("Vino");
//         // list.add("Poova");
//         // list.add("Kishore");

//         // for(String i:list){
//         //     System.out.println(i);
            
//         // }

//         // System.out.println("size : "+list.size());
        
        
//         ArrayList<Integer> newlist=new ArrayList();
        
      

//         for(int i=1;i<=20;i++){
//             newlist.add(i);

//         }

//         for(int i=0;i<newlist.size();i++){
//             int rem=newlist.get(i)%2;
//             if(rem==0)
//                 newlist.remove(i);
//         }

//         Collections.reverse(newlist);
//         System.out.println(newlist);

//         // for(int i=0;i<newlist.size();i++){
             
//         // int rem=newlist.get(i)%2;
//         // if(rem==0)
//         //     System.out.println("Even :"+newlist.get(i));
//         // }
            
//         // for(int i=0;i<newlist.size();i++){

//         //     int rem=newlist.get(i)%2;
//         //     if(rem==1)
//         //         System.out.println("Odd : "+newlist.get(i));
//         // }


        Scanner sc=new Scanner(System.in);
        
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=1;i<20;i++){
            list.add(i);

        }

        System.out.println("Enter the index");
        int i=sc.nextInt();

        System.out.println("Enter the element");
        int j=sc.nextInt();

        list.set(i, j);
        System.out.println(list);
    }
    
}
