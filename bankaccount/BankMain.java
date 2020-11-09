package bankaccount;

public class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.setName("Marian Kakkarekokko");
        bankAccount.setAccountNumber(20_4000_4000_0000_1234L);
        bankAccount.setEmail("marian.kakarekokko@klop.kl");
        bankAccount.setPhoneNumber(70072772);
        bankAccount.setBalance(0);

        System.out.println("Welcome! " + bankAccount.getName());
        System.out.println("Your phone number is " + bankAccount.getPhoneNumber() + " and e-mail: " + bankAccount.getEmail());
        System.out.println("Your bank account number is: " + bankAccount.getAccountNumber());
        System.out.println();

        bankAccount.withdrawFounds(100);
        bankAccount.depositFounds(54);
        bankAccount.withdrawFounds(5);
        bankAccount.withdrawFounds(9);
        bankAccount.depositFounds(6);
        bankAccount.withdrawFounds(3);
    }
}
