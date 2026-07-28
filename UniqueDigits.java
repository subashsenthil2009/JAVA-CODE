import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class UniqueDigits{
    public static void main(String[] args) {
        String name="dharaneesh";

        Set<Character> set=new LinkedHashSet<>();

        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            set.add(ch);
        }

        StringBuilder sb=new StringBuilder();

        for(Character i:set){
            sb.append(i); 
        }
        System.out.println(sb.toString());
    }
}