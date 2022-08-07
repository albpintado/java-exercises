package Calculator;

public class MultiplyNumbers {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        long productResult = calculator.multiply(args);

        System.out.println(productResult);
    }
}
