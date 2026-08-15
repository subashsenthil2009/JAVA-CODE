import java.util.Arrays;
import java.util.Comparator;

class Sorting{
    public static void main(String[] args) {

        Numbers n1=new Numbers();
        n1.age=18;
        n1.name="Subash";
        Numbers n2=new Numbers();
        n2.age=22;
        n2.name="Dharaneesh";
        Numbers n3=new Numbers();
        n3.age=19;
        n3.name="Absar";

        Numbers arr[]=new Numbers[3];
        arr[0]=n1;
        arr[1]=n2;
        arr[2]=n3;
        Arrays.sort(arr);
        for(Numbers i:arr){
            System.out.println(i.age);
        }

        //Arrays.sort(arr,new ForwardSorting());
        Arrays.sort(arr,(a,b)->{
            if(a.age==b.age)
                return a.name.compareTo(b.name);
            return a.age-b.age;
        });
        System.out.println("After reverse sorting : ");
        for(Numbers i:arr){
            System.out.println(i.age+"    "+i.name);
        }
    }
}

class Numbers implements Comparable<Numbers>{

    int age;
    String name;
    @Override
    public int compareTo (Numbers n){
        return this.age-n.age;
        //return Integer.compare(this.age, n.age);

    }
}

class ForwardSorting implements Comparator<Numbers>{

    @Override
    public int compare(Numbers n1, Numbers n2){
        if(n1.age==n2.age)
            return n1.name.compareTo(n2.name);
        
        return n1.age-n2.age;
    }
}

class ReverseSorting implements Comparator<Numbers>{

    @Override
    public int compare(Numbers n1,Numbers n2){
        return n2.age-n1.age;
    }
}