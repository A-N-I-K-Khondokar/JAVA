/*"Assume that a bank maintains two kinds of accounts for its customers,
one called savings account and the other current account.
The savings account provides compound interest and withdrawal facilities
but no cheque book facility. The current account provides cheque book
facility but no interest."

"Create a class Account that stores customer name,
account number, and type of account. From this,
derive the classes Curr-acct and Sav-acct to make them more
specific to their requirements. Include necessary
methods in order to achieve the following tasks:"

1️⃣ Accept a deposit from a customer and update the balance.
2️⃣ Compute and deposit interest.
3️⃣ Permit withdrawal and update balance.
 */
class Account {
    String name;
    int accountNumber;
    String accountType;
    double balance;

    Account(String name,int accountNumber,String accountType){
        this.name=name;
        this.accountNumber=accountNumber;
        this.accountType=accountType;
        this.balance=0.0;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public double getBalance(){
        return balance;
    }
}
class curr_acct extends Account{
     public curr_acct(String name,int accountNumber){
     super(name,accountNumber,"Current");
    }
    public void checkBook_facility(){
        System.out.println("Checkbook_facilities is available");
    }
}
class savv_acct extends Account{
    private double interestRate;
    public savv_acct(String name,int accountNumber,double interestRate){
        super(name,accountNumber,"Saving");
        this.interestRate=interestRate;
    }
    public void computeInterest() {
        double interest = balance * (interestRate / 100);
        deposit(interest);
    }

}
public class BankAccount {
    public static void main(String[] args) {
        savv_acct s= new savv_acct("anik",1234,5.0);
        s.deposit(1000);
        s.computeInterest();
        System.out.println(s.getBalance());
        s.withdraw(500);
        System.out.println(s.getBalance());

        curr_acct c = new curr_acct("Onik",545);
        c.deposit(5000);
        c.checkBook_facility();
        c.withdraw(1000);
        System.out.println(c.getBalance());
    }
}
