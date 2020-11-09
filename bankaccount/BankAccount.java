package bankaccount;

public class BankAccount {
    private String name;
    private String email;
    private long phoneNumber;
    private long accountNumber;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double depositFounds(double founds){
        System.out.println("you have now on account: " + (balance + founds) + "$");
        setBalance(balance + founds);
        return getBalance();
    }

    public double withdrawFounds(double withdraw){
        if(withdraw <= this.balance){
            setBalance(balance - withdraw);
            System.out.println("balance after withdrawing: " + withdraw + "$" + " is: " + balance + "$");
            return balance;
        }
        System.out.println("withdraw sum is too big! Your founds are: " + balance + "$ and you were trying to get: " + withdraw + "$");
        return balance;
    }
}
