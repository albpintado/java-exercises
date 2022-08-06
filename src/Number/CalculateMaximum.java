package Number;

import java.util.Arrays;
import java.util.Scanner;

public class CalculateMaximum {
    public static void main(String[] args) {
        int[] numbersList = getNumbersList();
        int maximumNumberFromList = getMaximumNumber(numbersList);
        System.out.println("Maximum number is: " + maximumNumberFromList);
    }

    static int[] getNumbersList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 10 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        int num7 = scanner.nextInt();
        int num8 = scanner.nextInt();
        int num9 = scanner.nextInt();
        int num10 = scanner.nextInt();

        int[] numbersList = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
        Arrays.sort(numbersList);

        return numbersList;
    }

    static int getMaximumNumber(int[] numbersList) {
        return numbersList[numbersList.length - 1];
    }
}
