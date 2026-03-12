import java.util.Arrays;

public class task14 {

    public static void cycleSwap(int[] array) {

        int last = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = last;
    }

    public static void cycleSwap(int[] array, int shift) {

        shift = shift % array.length;

        for (int i = 0; i < shift; i++) {
            cycleSwap(array);
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, 3, 2, 7, 4};

        cycleSwap(numbers, 3);

        System.out.println(Arrays.toString(numbers));
    }
}
