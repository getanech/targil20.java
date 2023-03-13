import java.util.Scanner;

public class targil3 {
    public static void main(String[] args) {
        System.out.println(isnumbers(3,4,5));
    }
    public static boolean isnumbers(int num1,int num2,int num3){
          num1*=num1;
         num2*=num2;
         num3*=num3;
         if(num1+num2==num3){
             return true;
        }else return false;
    }
}