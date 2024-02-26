import java.sql.SQLOutput;

public class Account {
    private String Number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String getCustomerPhone;

    public Account(){
        System.out.println("Empty constructor called");
    }

    public void desposiFunds(double deposiAmout){
        balance += deposiAmout;
        System.out.println("Deposit of $ " + deposiAmout + " made. New balance is $" + this.balance);
    }

    public void withdrawFunds(double withdrawwalAmout){
        if (balance - withdrawwalAmout < 0){
            System.out.println("Insufficient Funds! You only have $" + balance + " in your account.");
        }
        else {
            balance -= withdrawwalAmout;
            System.out.println("Withdrawal of $" + withdrawwalAmout + "processed, Remaining balance = $" + balance);
        }
    }

    public String getNumber() {
        return Number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getGetCustomerPhone() {
        return getCustomerPhone;
    }

}
