import java.util.Scanner;

public class targil18 {
    public static void main(String[] args) {
        number(5, 4);
        zogi(5);
        bigorzogi(12);
        dividesBy(27);
        number1();

    }

    public static void number(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else
            System.out.println(b);
    }

    public static void zogi(int x) {
        if (x % 2 == 0) {
            System.out.println(x);
        } else {
            System.out.println("eroor");
        }
    }
    public static void bigorzogi(int n){
        if(n%2==0&&n>10){
            System.out.println("you right");
        }else{
            System.out.println("you not alright");
        }
    }
    public static void dividesBy(int f){
        if(f%3==0){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
    public static void number1(){
      Scanner scanner = new Scanner(System.in);
        System.out.println("choese num 1-5");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("tow");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
        }

    }
}

