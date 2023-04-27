public class CreditCardInterest {
    public static void main(String[] args) {
        double balance = 5000.0; // set initial balance to $5000
        double interestRate = 0.17; // set interest rate to 17%

        // calculate interest and update balance for one month
        double interest1 = balance * interestRate / 12;
        balance += interest1;//These lines calculate the interest for one month and update the balance accordingly. The interest is calculated by multiplying the balance by the monthly interest rate, which is the annual interest rate divided by 12

        // output interest and updated balance after one month
        System.out.printf("Interest after 1 month: $%.2f\n", interest1);
        System.out.printf("New balance after 1 month: $%.2f\n", balance);//The "\n" character is used to insert a line break.

        // calculate interest and update balance for two months
        double interest2 = balance * interestRate / 12;
        balance += interest2;

        // output interest and updated balance after two months
        System.out.printf("Interest after 2 months: $%.2f\n", interest2);
        System.out.printf("New balance after 2 months: $%.2f\n", balance);//The "\n" character is used to insert a line break.
    }
}
