import java.util.Scanner;

public class targil15 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scanner = new Scanner(System.in);
        double sum1 = 70;
        double sum2 = 80;
        double sum3 = 90;
        double number = sum1 + sum2 + sum3;
        System.out.println(number / 3);

        number(6);

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {7, 8, 9, 10};
        System.out.println(arrays(arr1,arr2));

        System.out.println(isSpacialString("haim"));

    }
    public static void number(int sum) {
        int power = sum;
        for (int i = 0; i < 5; i++) {
            System.out.print(sum);
            sum *= power;
        }
    }
    public static int arrays(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        if (sum1 > sum2) {
            return 1;
        }
        if (sum2 > sum1) {
            return 2;
        }
        if (sum1 == sum2) {
        }
        return 0;
    }
    public static boolean isSpacialString(String s){
        if(s.length()%2==0){
            return true;
        }else return false;
    }
}
