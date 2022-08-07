package Calculator;

public class SubtractNumbers {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        long subtractResult = calculator.subtract(args);

        System.out.println(subtractResult);
    }
}
