import java.util.Scanner;//This line imports the Scanner class from the java.util package, which is used to read user input from the console.

public class HomeMaintenanceCosts {//public class called homemaintenacecosts
    public static void main(String[] args) {//main method. start of program
        // Input the maintenance costs for each season
        Scanner input = new Scanner(System.in);//This line creates a new Scanner object called input and initializes it with System.in, which represents the standard input stream. This will allow us to read user input from the console.
        System.out.print("Enter the maintenance cost for spring: ");
        double springCost = input.nextDouble();
        System.out.print("Enter the maintenance cost for summer: ");
        double summerCost = input.nextDouble();
        System.out.print("Enter the maintenance cost for fall: ");
        double fallCost = input.nextDouble();
        System.out.print("Enter the maintenance cost for winter: ");
        double winterCost = input.nextDouble();

        // Compute the total yearly maintenance cost
        double yearlyCost = springCost + summerCost + fallCost + winterCost;//This line computes the total yearly maintenance cost by adding up the costs for each season and stores it in the variable yearlyCost.

        // Display the seasonal costs and the total yearly cost
        System.out.printf("The maintenance cost for spring is $%.2f.%n", springCost);
        System.out.printf("The maintenance cost for summer is $%.2f.%n", summerCost);
        System.out.printf("The maintenance cost for fall is $%.2f.%n", fallCost);
        System.out.printf("The maintenance cost for winter is $%.2f.%n", winterCost);
        System.out.printf("The total yearly maintenance cost is $%.2f.%n", yearlyCost);//These five lines use the printf method of the System.out object to format and display the results to the console. The %f format specifier is used to format the double values with two decimal places, and the %n specifier is used to insert a newline character at the end of each line. The output will display the seasonal costs and the total yearly cost with a dollar sign and two decimal places.
    }
}
