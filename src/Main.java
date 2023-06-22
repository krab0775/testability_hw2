public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double heightM = 1.9;
        int weightKg = 87;
        int bmi = service.calculate(heightM, weightKg);
        System.out.println("Индекс массы тела: " + bmi);
    }
}
