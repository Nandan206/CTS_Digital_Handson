public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }

        return calculateFutureValue(initialValue, growthRate, years - 1) * (1 + growthRate);
    }
}
