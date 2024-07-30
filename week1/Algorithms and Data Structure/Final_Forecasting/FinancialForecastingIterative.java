package Final_Forecasting;

public class FinancialForecastingIterative {

    // Iterative method to calculate future value
    public static double calculateFutureValueIterative(double currentValue, double growthRate, int periods) {
        double futureValue = currentValue;

        for (int i = 0; i < periods; i++) {
            futureValue *= (1 + growthRate);
        }

        return futureValue;
    }

    public static void main(String[] args) {
        double currentValue = 1000.0;  // Current value in dollars
        double growthRate = 0.05;      // Growth rate of 5%
        int periods = 10;              // Number of periods (years)

        double futureValueRecursive = calculateFutureValue(currentValue, growthRate, periods);
        System.out.println("Future Value after " + periods + " periods (Recursive): $" + futureValueRecursive);

        double futureValueIterative = calculateFutureValueIterative(currentValue, growthRate, periods);
        System.out.println("Future Value after " + periods + " periods (Iterative): $" + futureValueIterative);
    }

    // Recursive method to calculate future value
    public static double calculateFutureValue(double currentValue, double growthRate, int periods) {
        // Base case: If no more periods, return the current value
        if (periods == 0) {
            return currentValue;
        }

        // Recursive case: Calculate future value for the next period
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, periods - 1);
    }
}
