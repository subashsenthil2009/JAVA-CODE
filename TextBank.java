public class TextBank {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.deposit(5000000);
        System.out.println(b.getBalance());
        System.out.println(b.withdraw(580.04444));
        System.out.println(b.getBalance());
    }
    
}
