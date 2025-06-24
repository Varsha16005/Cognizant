import java.util.Scanner;
public class FinancialForecasting {

    public static double calculateFutureValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return calculateFutureValue(principal * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial amount (e.g., 10000): ");
        double principal = sc.nextDouble();

        System.out.print("Enter the annual growth rate (in %, e.g., 7): ");
        double ratePercent = sc.nextDouble();
        double rate = ratePercent / 100;  

        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();
        double futureValue = calculateFutureValue(principal, rate, years);
        System.out.printf("Future value after %d years: %.2f\n", years, futureValue);

        sc.close();
    }
}
