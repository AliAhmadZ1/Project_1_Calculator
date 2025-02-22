import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Project 1 Tuwaiq Academy Java BootCamp");
        System.out.println("Ali Ahmed Alshehri\n=====================");

        Scanner input = new Scanner(System.in);
        //----------------------------------------------------------------------

        try{ //try to handle any error

            System.out.println("Enter two numbers.");
            //inputs
            System.out.print("1st number: ");
            double firstNumber = input.nextInt();
            System.out.print("2nd number: ");
            double secondNumber = input.nextInt();
            //declare arrayList to save history
            ArrayList<String> history = new ArrayList();
            double result = 0;

            //Menue list
            System.out.println("\n" +
                    "- Enter 1 to addition the numbers  \n" +
                    "- Enter 2 to subtraction the numbers  \n" +
                    "- Enter 3 to multiplication the numbers  \n" +
                    "- Enter 4 to division the numbers  \n" +
                    "- Enter 5 to modulus the numbers  \n" +
                    "- Enter 6 to find minimum number  \n" +
                    "- Enter 7 to find maximum number  \n" +
                    "- Enter 8 to find the average of numbers  \n" +
                    "- Enter 9 to print the last result in calculator  \n" +
                    "- Enter 10 to print the list of all results in calculator");


            //first input
            int choice;
            System.out.println("Enter the operation 1-10 (0 to exit): ");
            choice = input.nextInt();
            while (choice != 0) {
                System.out.println("Enter the operation 1-10 (0 to exit): ");
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> {
                        result = sum(firstNumber, secondNumber);
                        System.out.println("The sum is: " + result);
                        history.addFirst("The sum is: " + result);
                        break;
                    }
                    case 2 -> {
                        result = sub(firstNumber, secondNumber);
                        System.out.println("The subtraction is: " + result);
                        history.addFirst("The subtraction is: " + result);
                    }
                    case 3 -> {
                        result = multiplication(firstNumber, secondNumber);
                        System.out.println("The multiplication is: " + result);
                        history.addFirst("The multiplication is: " + result);
                    }
                    case 4 -> {
                        result = division(firstNumber, secondNumber);
                        System.out.println("The division is: " + result);
                        history.addFirst("The division is: " + result);
                    }
                    case 5 -> {
                        result = mod(firstNumber, secondNumber);
                        System.out.println("The modulus is: " + result);
                        history.addFirst("the modulus is " + result);
                    }
                    case 6 -> {
                        result = max(firstNumber, secondNumber);
                        System.out.println("The maximum number is: " + result);
                        history.addFirst("the maximum is " + result);
                    }
                    case 7 -> {
                        result = min(firstNumber, secondNumber);
                        System.out.println("The minimum number is: " + result);
                        history.addFirst("the minimum is " + result);
                    }
                    case 8 -> {
                        result = average(firstNumber, secondNumber);
                        System.out.println("The average is: " + result);
                        history.addFirst("the average is " + result);
                    }
                    case 9 -> {
                        System.out.println("The last operation is: " + history.get(0));

                    }
                    case 10 -> {
                        System.out.println("The history is: ");
                        for (int i = 0; i < history.size(); i++)
                            System.out.println("- "+history.get(i));
                        System.out.println();
                    }
                    case 0 -> System.out.println("Thank you so much");
                    default -> System.out.println("Wrong choice try again...");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("ERROR enter numbers only!!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double sub(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double division(double firstNumber, double secondNumber) {
        divideByZero(secondNumber);
        return firstNumber / secondNumber;
    }

    public static double mod(double firstNumber, double secondNumber) {
        return firstNumber % secondNumber;
    }

    public static double max(double firstNumber, double secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }

    public static double min(double firstNumber, double secondNumber) {
        return Math.min(firstNumber, secondNumber);
    }

    public static double average(double firstNumber, double secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }

    public static void divideByZero(double secondNumber){
        try {
            if (secondNumber == 0)
                throw new ArithmeticException();
        }catch (ArithmeticException e){
            System.out.println("Can't divide by zero.");
        }
    }

}