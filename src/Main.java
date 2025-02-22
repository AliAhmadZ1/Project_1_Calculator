import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Project 1 Tuwaiq Academy Java BootCamp");
        System.out.println("Ali Ahmed Alshehri\n=====================");

        Scanner input = new Scanner(System.in);
        //----------------------------------------------------------------------

        System.out.println("Enter two numbers.");
        System.out.print("1st number: ");
        double firstNumber = input.nextInt();
        System.out.print("2nd number: ");
        double secondNumber = input.nextInt();
        ArrayList<String> history = new ArrayList();
        double result=0;
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

        System.out.println("Enter the operation 1-10 (0 to exit): ");
        int choice = input.nextInt();
        while(true) {
            switch (choice) {
                case 1 -> {
                    result=sum(firstNumber,secondNumber);
                    System.out.println("The sum is: "+result);
                    history.addFirst("The sum is: "+result);
                }
                case 2-> {
                    result=sub(firstNumber, secondNumber);
                    System.out.println("The subtraction is: "+result);
                    history.addFirst("The subtraction is: "+result);
                }
                case 3 -> {
                    result=multiplication(firstNumber,secondNumber);
                    System.out.println("The multiplication is: "+result);
                    history.addFirst("The multiplication is: "+result);
                }
                case 4 -> {
                    result=division(firstNumber,secondNumber);
                    System.out.println("The division is: "+result);
                    history.addFirst("The division is: "+result);
                }
                case 5 -> {
                    result=mod(firstNumber,secondNumber);
                    System.out.println("The modulus is: "+result);
                    history.addFirst("the modulus is"+result);
                }
                case 6 -> {
                    result=max(firstNumber,secondNumber);
                    System.out.println("The maximum number is: "+result);
                    history.addFirst("the maximum is"+result);
                }
                case 7 -> {
                    result= min(firstNumber,secondNumber);
                    System.out.println("The minimum number is: "+result);
                    history.addFirst("the minimum is"+result);
                }
                case 8 -> {
                    result=average(firstNumber,secondNumber);
                    System.out.println("The average is: "+result);
                    history.addFirst("the average is"+result);
                }
                case 9 -> {
                    result=sum(firstNumber,secondNumber);
                    System.out.println("The last operation is: "+result);
                    history.addFirst("the last enter is"+result);
                }
                case 10 -> {
                    result=sum(firstNumber,secondNumber);
                    System.out.println("The history is: "+history);
                }
                case 0 -> {
                    break;
                }
                default -> System.out.println("Wrong choice try again...");
            }
        }
    }

    public static double sum(double firstNumber,double secondNumber){
        return firstNumber + secondNumber;
    }

    public static double sub(double firstNumber,double secondNumber){
        return firstNumber - secondNumber;
    }

    public static double multiplication(double firstNumber,double secondNumber){
        return firstNumber * secondNumber;
    }

    public static double division(double firstNumber,double secondNumber){
        return firstNumber / secondNumber;
    }

    public static double mod(double firstNumber,double secondNumber){
        return firstNumber % secondNumber;
    }

    public static double max(double firstNumber,double secondNumber){
        return Math.max(firstNumber, secondNumber);
    }

    public static double min(double firstNumber,double secondNumber){
        return Math.min(firstNumber, secondNumber);
    }

    public static double average(double firstNumber,double secondNumber){
        return (firstNumber+secondNumber)/2;
    }


}