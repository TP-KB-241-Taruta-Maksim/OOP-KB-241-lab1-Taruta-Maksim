public class task10 {

    public static int max(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 9, 2, 4, 5};

        System.out.println(max(numbers));
    }
}
