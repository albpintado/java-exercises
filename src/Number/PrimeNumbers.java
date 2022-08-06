package Number;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your number?");

        int number = scanner.nextInt();
        boolean isPrimeNumber = isPrimeNumber(number);

        System.out.println(number + " is" + (isPrimeNumber ? " a prime number" : " not a prime number."));
    }

    static public boolean isPrimeNumber(int number) {
        boolean isPrimeNumber = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
            }
        }
        return isPrimeNumber;
    }
}
