public class EvenOdd {//This line starts the declaration of a new Java class called EvenOdd.
    public static void main(String[] args)//This line declares the main method of the EvenOdd class
    {
        int numToExamine = 2;
        if(numToExamine%2==0)
        {
            System.out.println(numToExamine + " is Even");
        }
        else
        {
            System.out.println(numToExamine + " is Odd");//This block of code uses the modulo operator (%) to determine if numToExamine is even or odd. If the remainder when numToExamine is divided by 2 is 0, then numToExamine is even, and the program prints a message indicating this. Otherwise, numToExamine is odd and the program prints a message indicating that instead. Note that the System.out.println() method is used to print the message to the console.
        }
    }

}//This line ends the declaration of the main method and the EvenOdd class.