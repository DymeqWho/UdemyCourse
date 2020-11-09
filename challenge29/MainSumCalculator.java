package challenge29;

public class MainSumCalculator {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        sumCalculator.setFirstNumber(5);
        sumCalculator.setSecondNumber(4);
        System.out.println("sumCalculator.getAdditionResult() = " + sumCalculator.getAdditionResult());
        System.out.println("sumCalculator.getSubstractionResult() = " + sumCalculator.getSubtractionResult());
        sumCalculator.setFirstNumber(5.25);
        sumCalculator.setSecondNumber(0);
        System.out.println("sumCalculator.getMultiplicationResult() = " + sumCalculator.getMultiplicationResult());
        System.out.println("sumCalculator.getDivisionResult() = " + sumCalculator.getDivisionResult());
    }
}
