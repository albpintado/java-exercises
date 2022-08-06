package Number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] baseArray = getBaseArray();
        System.out.println(Arrays.toString(baseArray));

        int[] reversedArray = getReversedArray(baseArray);
        System.out.println(Arrays.toString(reversedArray));
    }

    static int[] getBaseArray() {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type numbers to add to list\nType NaN chars to stop");

        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        int[] array = new int[list.size()];
        for(int i = 0; i < list.size(); i++) array[i] = list.get(i);

        return array;
    }

    static int[] getReversedArray(int[] baseArray) {
        for (int i = 0; i < baseArray.length / 2; i++) {
            int temp = baseArray[i];
            baseArray[i] = baseArray[baseArray.length - i - 1];
            baseArray[baseArray.length - i - 1] = temp;
        }

        return baseArray;
    }
}
