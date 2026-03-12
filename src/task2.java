import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int hours = n / 3600;
        int minutes = (n % 3600) / 60;
        int seconds = n % 60;

        System.out.printf("%d:%02d:%02d", hours, minutes, seconds);
    }

}
