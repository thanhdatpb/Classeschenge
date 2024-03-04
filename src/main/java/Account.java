
    
public class Account {
    private String Number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account(){
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String email, String phone){
        System.out.println("Account constructor with parameters called");
        this.Number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }   

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("99999", 100.55, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("Deposit of $ " + depositAmount + " made. New balance is $" + this.balance);
    }

    public void withdrawFunds(double withdrawalAmount){
        if (balance - withdrawalAmount < 0){
            System.out.println("Insufficient Funds! You only have $" + balance + " in your account.");
        }
        else{
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + "processed, Remaining balance = $" + balance);
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
        return customerPhone;
    }

}
