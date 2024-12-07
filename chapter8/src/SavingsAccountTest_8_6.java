public class SavingsAccountTest_8_6 {
    public static void main(String[] args) {
        SavingsAccount_8_6 saver1 = new SavingsAccount_8_6(2000.00);
        SavingsAccount_8_6 saver2 = new SavingsAccount_8_6(3000.00);

        SavingsAccount_8_6.modifyInterestRate(0.04);

        for (int month = 1; month <= 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        System.out.println("Balances after 12 months at 4% annual interest:");
        System.out.printf("Saver 1 balance: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance: $%.2f%n", saver2.getSavingsBalance());

        SavingsAccount_8_6.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Balances after 1 more month at 5% annual interest:");
        System.out.printf("Saver 1 balance: $%.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver 2 balance: $%.2f%n", saver2.getSavingsBalance());
    }
}
