import java.util.Scanner;

public class targil20 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("hello");
        }
        System.out.println("enter a number");
        int f = scanner.nextInt();
        int y = 0;
        for (int i = 0; i < f; i++) {
            if (y != f) {
                y++;
                System.out.println(y);
            }
        }
    }
}


