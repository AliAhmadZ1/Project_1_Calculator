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
        int firstNumber = input.nextInt();
        System.out.print("2nd number: ");
        int secondNumber = input.nextInt();
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

    }

    public static double sum(double firstNumber,double secondNumber){
        return firstNumber + secondNumber;
    }

    public static double sub(double firstNumber,double secondNumber){
        return firstNumber + secondNumber;
    }

}