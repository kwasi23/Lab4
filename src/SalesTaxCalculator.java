import java.util.Scanner;   // Import the Scanner class from the java.util package

public class SalesTaxCalculator{   // Define a public class named SalesTaxCalculator
    public static void main(String[] args) {   // Define a public static method named main that takes an array of strings as its argument
        Scanner input = new Scanner(System.in);   // Create a new Scanner object to read input from the console
        System.out.print("Enter the price of the purchase: ");   // Prompt the user to enter the price of the purchase
        double price = input.nextDouble();   // Read the next double value entered by the user and assign it to the variable price

        double salesTax = 0.05 * price;   // Compute the sales tax as 5% of the price and assign it to the variable salesTax

        System.out.printf("The price of the purchase is $%.2f.%n", price);   // Display the price of the purchase with 2 decimal places
        System.out.printf("The sales tax is $%.2f.%n", salesTax);   // Display the sales tax with 2 decimal places
    }
}
