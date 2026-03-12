public class task11 {

    public static int sum(int[] arr) {

        if (arr == null || arr.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println(sum(numbers));
    }
}
