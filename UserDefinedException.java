class NegativeBalanceException extends Exception {
    public NegativeBalanceException(String messString){
        super(messString);
    }
}
public class UserDefinedException {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount();

        try{
            account1.setamount(-78);
            System.out.println("Balance updated successfully>>>>");
        }
        catch(Exception e){
            System.out.println("<<<<<<<Balace failed to update successfully       "+e.getMessage());
        }
    }
    

}

class BankAccount{
        private String accountno;
        private String name;
        private String ifscno;
        private double amount;

    public void setamount(double amount)throws NegativeBalanceException,ArithmeticException{
        if(amount<0)
            throw new NegativeBalanceException("Negative balance amount can't be set.....");
        else
            throw new ArithmeticException();
    }
}
