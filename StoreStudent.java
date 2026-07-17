public class StoreStudent {
    public static void main(String[] args) {
        
        Student student=new Student("subash");
        System.out.println(student.name);
        Student student2=new Student(10, "hello");
        System.out.println(student2.rollno);
        System.out.println(student2.name);
    }
    
}
