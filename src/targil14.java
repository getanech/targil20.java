import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class targil14 {
    public static void main(String[] args) {
        isValidString("haim");
        strong(5);

        int arr1[] = {2, 3, 4, 8, 6, 7};
        int arr2[] = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(sumArray(arr1, arr2)));

        System.out.println(Arrays.toString(getRandoomArray(5)));

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != 13) {
            System.out.println("enter");
            number = scanner.nextInt();
        }
        int[] arr = {1, 2, 3, 3, 3, 5, 7, 8};

        System.out.println(hsdDuplicates(arr));

        int[] array1 = {10, 11, 12,};
        int[] array2 = {1, 2, 5};
        System.out.println(arrays(arr1, arr2));
    }

    public static boolean isValidString(String s) {//מחרוזת שאורך התו שלה זוגי
        if (s.length() % 2 == 0) {
            return true;
        } else return false;
    }

    public static void strong(int num) {//חזקה של המספר שבחרת
        int power = num;
        for (int i = 0; i < 5; i++) {
            System.out.print(num + ",");
            num *= power;
        }
    }

    public static int[] sumArray(int arr1[], int arr2[]) {//לוקח את המספר של המערך הראשון ואת המספר של המערך שני ומחבר אותם
        int arr3[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            int sum = arr1[i] + arr2[i];
            arr3[i] = sum;
        }
        return arr3;
    }

    public static int[] getRandoomArray(int sum) {//מספרים רנדומלייים
        int[] array = new int[sum];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static boolean hsdDuplicates(int[] arr) {//בודקת שאין כפילויות במספרים
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int arrays(int[] array1, int[] array2) {//בודקת איזה סכום יותר גדול המערך הראשון או המערך השני
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }
        if (sum > sum2)
            return 1;

        if (sum2 > sum) {
            return 2;
        }
        if (sum == sum2) {

        }
        return 0;
    }
}




