package bankAcountSystem;

public class Customer {
    private String name;
    private BankAccount account;
    //constructor
    public Customer(String name , BankAccount account){
        this.name = name;
        this.account = account;
    }
    //Getter
    public String getName(){
        return name;
    }
    public BankAccount getAccount(){
        return account;
    }
    //show customers details
    public  void displayInfo(){
        System.out.println("Customer: " + name +
                "| Account: " + account.getAccountNumber() +
                "| Balance: " + account.getBalance());
    }
}
