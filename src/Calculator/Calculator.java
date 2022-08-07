package Calculator;

public class Calculator {
    public long sum(String[] args) {
        long result = Long.parseLong(args[0]);

        for (int i = 1; i < args.length; i++) {
            long number = Long.parseLong(args[i]);
            result += number;
        }
        return result;
    }

    public long subtract(String[] args) {
        long result = Long.parseLong(args[0]);

        for (int i = 1; i < args.length; i++) {
            long number = Long.parseLong(args[i]);
            result -= number;
        }
        return result;
    }

    public long multiply(String[] args) {
        long result = Long.parseLong(args[0]);

        for (int i = 1; i < args.length; i++) {
            long number = Long.parseLong(args[i]);
            result *= number;
        }
        return result;
    }

    public long divide(String[] args) {
        long result = Long.parseLong(args[0]);

        for (int i = 1; i < args.length; i++) {
            long number = Long.parseLong(args[i]);
            result /= number;
        }
        return result;
    }
}
