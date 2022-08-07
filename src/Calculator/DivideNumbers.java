package Calculator;

public class DivideNumbers {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        long divideResult = calculator.divide(args);

        System.out.println(divideResult);
    }
}
