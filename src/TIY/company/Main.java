package TIY.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        double operand1;
        double operand2;
        double sum;
        double difference;
        double division;
        double multiplication;
        double remainder;


        System.out.println("Please enter a new number");
        Scanner scanner =  new Scanner(System.in); // text scanner that parses primitive types and strings using regular expression
        operand1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter another number");
        Scanner scanner2 =  new Scanner(System.in);
        operand2 = Double.parseDouble(scanner2.nextLine());
        sum = operand1 + operand2;
        difference = operand1 - operand2;
        division = operand1  / operand2;
        multiplication = operand1 * operand2;
        remainder = operand1 % operand2;

        showResults(sum,difference,division,multiplication,remainder);



    }

    public static void showResults (double sum, double difference, double division, double multiplication, double remainder) {
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("the division is "+ division);
        System.out.println("The multiplication is " + multiplication);
        System.out.println("The remainder is " + remainder);;
    }
}
