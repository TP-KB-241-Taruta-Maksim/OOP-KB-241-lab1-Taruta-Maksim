import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        if (a >= h) {
            System.out.println(1);
            return;
        }

        if (a <= b) {
            System.out.println("Impossible");
            return;
        }

        int days = 1;
        int height = a;

        while (height < h) {
            height -= b;
            height += a;
            days++;
        }

        System.out.println(days);
    }
}
