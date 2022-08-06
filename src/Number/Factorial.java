package Number;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number to calculate Number.factorial:");
        int number = scanner.nextInt();

        int factorial = getFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    static int getFactorial(int number) {
        if (number == 1) return 1;
        return number * getFactorial(number - 1);
    }
}
