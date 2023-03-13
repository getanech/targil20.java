import java.util.Scanner;

public class targil16 {
    public static void main(String[] args) {
        //System.out.println(Gcd(18,12));
        //printLongest("this is sn example");
        printLongest("");

        Scanner scanner = new Scanner(System.in);//מדפיסה את הגיל ב2040
       System.out.println("enter a number");
        int age = scanner.nextInt();
        age+=17;
        System.out.println(age);
//
        Scanner scanner1=new Scanner(System.in);//מחברת בין המספרים ומדפיסה את האת התוצאה הסופית
        System.out.println("enter a number");
        int number = scanner.nextInt();
        int number2 = number / 100;
        int number3 = (number / 10) % 10;
        int number4 = number % 10;
        System.out.println(number2 + " " + number3 + " " + number4);
        System.out.println(number3 + number4);

//        for (int i = 2; i <= 10; i++) {  //מדפיסה מספרים זוגיים
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }
//        for (int i = 0; i < 20; i++) {  //מדפיסה את המספרים שמתחלקים ב3 ומדפיסה את התוצאה הסופית שלהם
//            if(i%3==0){
//                System.out.println(i);
//            }
//        }
    }
    public static int Gcd(int number1,int number2){  //מחזיה מספר שמתחלק בין שתי הפונקציות
        int result = number1;
        while (result > 0){
            if (number1 % result==0 && number2% result==0){
                break;
            }
            result--;
        }
        return result;
    }
    public static void printLongest(String text){    //מדפיסה את המילה הארוכה ביותר
        String username = "This is an example";
        System.out.println(username.substring(10));
    }
}
