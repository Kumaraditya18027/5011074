package Final_Forecasting;

public class FinancialForecastingRecursive {

    
    public static double calculateFutureValue(double currentValue, double growthRate, int periods) {
       
        if (periods == 0) {
            return currentValue;
        }

       
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double currentValue = 1000.0; 
        double growthRate = 0.05;     
        int periods = 10;              

        double futureValue = calculateFutureValue(currentValue, growthRate, periods);
        System.out.println("Future Value after " + periods + " periods: $" + futureValue);
    }
}
