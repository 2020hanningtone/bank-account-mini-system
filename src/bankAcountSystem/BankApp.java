package bankAcountSystem;

public class BankApp {
    public static void main(String[] args) {
        //create accounts
BankAccount acc1 = new BankAccount("ABC1234", 5000);
BankAccount acc2 = new BankAccount("EFG1234", 10_000);

 //Create customers with Accounts
        Customer cust1 = new Customer("Hanningtone", acc1);
        Customer cust2 = new Customer("Naomi", acc2);

 // show initial details
 cust1.displayInfo();
 cust2.displayInfo();

        System.out.println("\n--- Transactions ---");
 //Transactions for Hanningtone
        System.out.println("Transactions for Hanningtone");
 acc1.deposit(5000);
 acc1.withdraw(2000);
        System.out.println();
 //Transactions for Naomi
        System.out.println("Transactions for Naomi");
        acc2.withdraw(12000);
        acc2.deposit(1050);
        System.out.println();
        System.out.println("\n--- Final Account details ---");
        cust1.displayInfo();
        cust2.displayInfo();

    }
}