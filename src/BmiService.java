public class BmiService {

    public int calculate(double heightM, int weightKg) {
        double result;
        if (weightKg > 0) {
            result = weightKg / (heightM * heightM);
        } else {
            result = 0;
        }
        return (int) result;
    }
}
