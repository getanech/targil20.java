import java.util.Arrays;
import java.util.Scanner;

public class targil11 {
    public static void main(String[] args) {
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printEvenNumbers(num);

        String[] name = {"H", "A", "I", "M"};
        boolean b = ifArrayIsTriangular(name);
        System.out.println(b);

        int[] arr = arrays(3, 5);
        System.out.println(Arrays.toString(arr));

        int[] number = {90, 70, 100, 60, 50};
        double sum = calcAverage(number);
        System.out.println(sum);

        int max = arraysMax(number);
        System.out.println(max);

        int arrays[] = {1, 2, 3, 4, 5, 6};

        int numbers[] = new int[3];
        numbers[0] = 34;
        numbers[1] = 45;
        numbers[2] = 67;

        String fullname[] = {"haim", "Getanech", "sami"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        Scanner scanner = new Scanner(System.in);
        double list[] = new double[5];
        list[0] = 1.2;
        list[1] = 3.2;
        list[2] = 4.6;
        list[3] = 6.5;
        list[4] = 4.7;

        for (int i = 0; i < list.length; i++) {
            System.out.println("please enter a number");
            list[i] = scanner.nextDouble();
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
    public static void printEvenNumbers(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
        }
    }
    public static boolean ifArrayIsTriangular(String[] arr) {
        int size = arr.length;
        if (size % 3 == 0) {
            return true;
        }
        return false;
    }
    public static int[] arrays(int a, int b) {
        int arr[] = new int[b];
        for (int i = 0; i < b; i++) {
            arr[i] = a;
        }
        return arr;
    }
    public static double calcAverage(int[] arr) {
        double average = 0;
        for (int i = 0; i < 5; i++) {
            average += arr[i];
        }
        return average / 5;
    }
    public static int arraysMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}














