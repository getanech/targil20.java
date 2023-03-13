import java.util.Arrays;

public class targil13 {
    public static void main(String[] args) {
        System.out.println(isValidString("HAIMKOPOPO"));

        int[] arr1 = {10, 11, 12,};
        int[] arr2 = {1, 2, 5};
        System.out.println(arrays(arr1, arr2));

        //System.out.println(getnolyB("abcbbf"));
    }
    public static boolean isValidString(String s) {
        if (s.length() % 2 == 0) {
            return true;
        } else return false;
    }
    public static int arrays(int[] arr1, int[] arr2) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
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



