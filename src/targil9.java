import java.util.Scanner;

public class targil9 {
    public static void main(String[] args) {
        String fullname;
        int age;
        sayHello("haim", 25);
        printkaful2();
        printBiggest(50, 60, 70);
        int num = multiply(8, 9);
        System.out.println(num);
        double circle = getCirclePerimeter(4);
        System.out.println(circle);
        numbers(6);
        String fullName = name("Haim");
        System.out.println(fullName);
        printAllZogi();
        boolean y= iSsevenBoom(88);
        System.out.println(y);
        printEvenNumbers();
        int sum[] = new int[10];
       }

    public static void sayHello(String fullname, int age) {
        System.out.println("your name is " + fullname);
        System.out.println("your age is " + age);
    }
    public static void printkaful2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scanner.nextLine();
        System.out.println("enter your age");
        int age = scanner.nextInt();
        age = age *= 2;
        System.out.println(name + " " + age);
    }
    public static void printBiggest(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if(b>a&&b>c) {
            System.out.println(b);
        }else if(c>a&&c>b){
            System.out.println(c);
        }
    }
    public static int multiply(int a, int b) {
        int num = a * b;
        return num;
    }
    public static double getCirclePerimeter(int r) {
        double pi = 3.14;
        return 2 * Math.PI * r;
    }
    public static boolean numbers(int i) {
        if (i % 2 == 0)
            return true;

        return false;
    }
    public static String name(String fullName) {
        return fullName + "!!!";
    }
    public static void printAllZogi() {
        for (int i = 0; i <= 200; i++) {
            if (numbers(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean iSsevenBoom(int y){
        if(y%7==0){
            return true;
        }
        return false;
    }
    public static void printEvenNumbers() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}


















