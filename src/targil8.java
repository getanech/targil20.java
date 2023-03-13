import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class targil8 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRandoomArray(5)));
    }
    public static int[] getRandoomArray(int sum){
        int[] array = new int[sum];
        Random random = new Random();
        for(int i = 0;i< array.length;i++){
            array[i]=random.nextInt(100);
        }
        return array;
    }
    }
