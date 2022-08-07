package Calculator;

public class SumNumbers {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        long sumResult = calculator.sum(args);

        System.out.println(sumResult);
    }
}
