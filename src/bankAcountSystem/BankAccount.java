package bankAcountSystem;

public class BankAccount {
    private final String accountNumber;
    private double balance;

    // constructor
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //Getter
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    //setter with validation
    public void setBalance(double balance){
        if (balance >= 0){
            this.balance = balance;
        }else {
            throw new IllegalArgumentException("Balance cannot be negative!");
        }
    }
    //Deposit method
    public void deposit(double amount){
        if (amount > 0){
        balance += amount;
            System.out.println("Deposited:" + amount + " | New Balance: " + balance);
    }else{
            System.out.println("Deposit must be positive!");
        }
}
    //Withdrawal
    public void withdraw (double amount){
if (amount > 0 && amount <= balance){
    balance -= amount;
    System.out.println("Withdrew:" + amount + " | New Balance: " + balance);
}else {
    System.out.println("Invalid withdrawal attempt!");
}
    }
}
