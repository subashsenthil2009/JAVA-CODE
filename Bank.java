public class Bank {
    private String accountno ;
    private String ifscno ;
    private String mobileno;
    private String name ;
    private double balance ;
    private String address ;
    private String dob ;

    public String getaccountno(){
        return accountno;
    }
    public  void setaccountno(String accountno){
        this.accountno=accountno;
    }
    
    public String getifscno(){
        return ifscno;
    }
    public  void setifscno(String ifscno){
        this.ifscno=ifscno;
    }

    public String getmobileno(){
        return mobileno;
    }
    public void setmobileno(String mobileno){
        this.mobileno=mobileno;
    }

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }

    public double getBalance(){
        return balance;
    }
    public boolean deposit(double amount){
        
        if(amount>0){
            this.balance+=amount;
            return true;
        }
            return false;

    }
    public boolean withdraw(double amount){
        if(amount<=balance){
           this.balance-=amount;
            return true;
        }
        return false;
        
    }

    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address=address;
    }

    public String getdob(){
        return dob;
    }
    public void setdob(String dob){
        this.dob=dob;
    }

    
}
