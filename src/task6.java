import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double bill = sc.nextDouble();
        int friends = sc.nextInt();

        if (bill < 0) {
            System.out.println("Error");
            return;
        }

        if (friends == 0) {
            System.out.println("Error");
            return;
        }

        double total = bill * 1.1;
        double part = total / friends;

        System.out.println((int)part);
    }
}
