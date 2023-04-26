package PraticeDog;

import java.util.ArrayList;

public class Practice {

    public static void main(String[] args) {

    }
    public static int subtractTen(int number) {
        return number - 10;
    }

    public static int average(int number1, int number2) {
        return (number1 + number2) / 2;
    }

    public static int multiplyAll (int number1, int number2) {
        return number1 * number2;
    }
    public static ArrayList<Integer> multiplyAll(int factor, ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : nums) {
            result.add(num * factor);
        }
        return result;
    }

}
