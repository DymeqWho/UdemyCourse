package challenge34;

public class ComplexNumberMain {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.getReal() = " + one.getReal());
        System.out.println("one.getImaginary() = " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.getReal(number) = " + one.getReal());
        System.out.println("one.getImaginary(number) = " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.getReal() = " + number.getReal());
        System.out.println("number.getImaginary() = " + number.getImaginary());
    }
}
