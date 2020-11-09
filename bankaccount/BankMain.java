package bankaccount;

public class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println();
        System.out.println("bankAccount.getName() = " + bankAccount.getName());
        System.out.println("bankAccount.getEmail() = " + bankAccount.getEmail());
        System.out.println("bankAccount.getPhoneNumber() = " + bankAccount.getPhoneNumber());
        System.out.println("bankAccount.getAccountNumber() = " + bankAccount.getAccountNumber());
        System.out.println("bankAccount.getBalance() = " + bankAccount.getBalance());

        System.out.println("this was before setting!");

        bankAccount.setName("Marian Kakkarekokko");
        bankAccount.setAccountNumber(20_4000_4000_0000_1234L);
        bankAccount.setEmail("marian.kakarekokko@klop.kl");
        bankAccount.setPhoneNumber(70072772);
        bankAccount.setBalance(0);

        System.out.println("after setting values to bankAccount");

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

        System.out.println();
        System.out.println("New account:");
        BankAccount karynaKakkarekokko = new BankAccount("Karyna Kakkarekokko","karyna.kakkarekokko@kupa.du", 70072772L, 20_2000_4000_5000L, 0);
        System.out.println("Welcome! " + karynaKakkarekokko.getName());
        System.out.println("Your phone number is " + karynaKakkarekokko.getPhoneNumber() + " and e-mail: " + karynaKakkarekokko.getEmail());
        System.out.println("Your bank account number is: " + karynaKakkarekokko.getAccountNumber());
        System.out.println();

        karynaKakkarekokko.withdrawFounds(-100);
        karynaKakkarekokko.depositFounds(69);
        karynaKakkarekokko.withdrawFounds(9);
        karynaKakkarekokko.withdrawFounds(60);
        karynaKakkarekokko.depositFounds(88);
        karynaKakkarekokko.withdrawFounds(44);
    }
}
