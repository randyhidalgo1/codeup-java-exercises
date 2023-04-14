package TestingGround;

public class Arrays {
    public static void main(String[] args) {

        int[] values = {3, 5, 23, 43, 66, 28, 97};
        System.out.println(values[2]);
        int []numbers = new int[5];
                numbers[0] = 10;
                numbers[1] = 20;
                numbers[2] = 30;
                numbers[3] = 40;
                numbers[4] = 50;

        for (int i = 0; i < values.length; i++) {
        System.out.println(values[i]);
        }

        for(int number : numbers) {
        System.out.println(numbers[2]);
        }
        for(int value : values) {
        System.out.println(values[5]);
        }

}
}