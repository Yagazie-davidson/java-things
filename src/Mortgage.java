import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args){
        //Make this code better!
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        while (true) {
            System.out.print("Principal (₦1K - ₦1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000){
                break;
            }else {
                System.out.println("Please enter a valid amount");
            }
        }
        double rate = 0.0;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            rate = scanner.nextDouble();
            if (rate > 0 && rate <= 30){
                break;
            }else {
                System.out.println("Please enter a valid Rate (0 - 30 %)");
            }
        }
        int years = 0;
        while (true) {
            System.out.print("Period (Years): ");
            years = scanner.nextInt();
            if (years > 0 && years <= 30){
                break;
            }else {
                System.out.println("Please enter a valid Time (1 - 30 YEAR(S))");
            }
        }
        int timeInMonths = years * MONTHS_IN_YEAR;

        double ratePerMonth = rate / PERCENT / MONTHS_IN_YEAR;

        double result = principal * ((Math.pow((1 + ratePerMonth), timeInMonths) * ratePerMonth) / (Math.pow((1 + ratePerMonth), timeInMonths) - 1));

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(result));
    }
}
