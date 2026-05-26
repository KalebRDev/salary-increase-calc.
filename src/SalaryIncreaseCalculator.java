import java.util.Scanner;

public class SalaryIncreaseCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your monthly salary: ");

        float interest = 10f;
        float payment = input.nextFloat();

        float paymentInterest = payment * (interest / 100);
        float finalPayment = payment + paymentInterest;

        System.out.println("Your payment after the salary increase will be: " + finalPayment);

        input.close();
    }
}
