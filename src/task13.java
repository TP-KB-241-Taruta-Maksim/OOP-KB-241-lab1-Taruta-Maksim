import java.util.ArrayList;

public class task13 {

    public static int[] removeLocalMaxima(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            boolean isLocalMax = false;

            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    isLocalMax = true;
                }
            }
            else if (i == arr.length - 1) {
                if (arr[i] > arr[i - 1]) {
                    isLocalMax = true;
                }
            }
            else {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    isLocalMax = true;
                }
            }

            if (!isLocalMax) {
                list.add(arr[i]);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] numbers = {18, 1, 3, 6, 7, -5};

        int[] result = removeLocalMaxima(numbers);

        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
