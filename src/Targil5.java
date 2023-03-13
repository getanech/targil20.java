import java.util.Scanner;

public class Targil5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int sum = 0;
        while (num!=0){
            System.out.println("enter a number");
            num = scanner.nextInt();
            sum+=num;
        }
        System.out.println("sum of all numbers is:"+sum);
    }
}
