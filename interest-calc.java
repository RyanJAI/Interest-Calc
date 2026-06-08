import java.util.Scanner;

public class InterestCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter interest rate in decimal form (5% = 0.05):");
        double rate = scanner.nextDouble();

        System.out.println("Enter time in years:");
        double time = scanner.nextDouble();

        System.out.println("Compounding type (annually, quarterly, monthly):");
        String type = scanner.next();

        double n = 1; // default

        if (type.equals("annually")) {
            n = 1;
        } else if (type.equals("quarterly")) {
            n = 4;
        } else if (type.equals("monthly")) {
            n = 12;
        }

        double amount = principal * Math.pow((1 + rate / n), (n * time));

        System.out.println("Final amount: $" + amount);

        scanner.close();
    }
}