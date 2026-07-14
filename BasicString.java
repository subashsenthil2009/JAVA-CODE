public class BasicString {
    public static void main(String[] args) {
        
        String s="SUBASH";
        String m= "Hello"+s;
        System.out.println(m);

        String ss= s.concat("The Boy");
        System.out.println(ss);

        String UpperCase=s.toUpperCase();
        String LowerCase=s.toLowerCase();

        System.out.println("UppeCase is used : "+UpperCase);
        System.out.println("LowerCase is used : "+ LowerCase);
        System.out.println(s);
    }
    
}
