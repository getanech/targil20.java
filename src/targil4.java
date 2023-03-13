import java.util.Scanner;

public class targil4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number=0;
        while (number !=13){
        System.out.println("enter");
           number = scanner.nextInt();
       }
//
//        System.out.println("error");
//        Scanner scanner1 = new Scanner(System.in);
//        int sum = 0;
//        int odd=0;
//        while (sum <= 1000) {
//            System.out.println("go");
//            sum = scanner1.nextInt();
//            if(sum%2==1)
//                odd++;
//        }
//        System.out.println("error");
//        System.out.println("odd numbers "+odd);
//
//
//        for (int count = 0; count<= 300; count++) {
//            if(count%4==0){
//                System.out.println(count);
//            }
//        }
//        for (int i =0 ; i <=300 ; i++) {
//            if (i%4==0){
//                i++;
//            System.out.println("dividents by 4:"+i);
//        }
//    }
        System.out.println("please enter a number.");
        for (int i = 100; i < 1000; i++) {
            if (i % 7 == 0 || i / 10 == 7 || i % 10 == 7)
                System.out.println("boom");
            else
                System.out.println(i);
        }
    }
}


//        for (int i=100;i<1000;i++){
//            if(i%10==i/10%10&&i%10==i/100){
//                System.out.println(i);
//            }
//       }
//
//        for (int i = 100; i < 1000; i++){
//            if (i / 100 == i % 10) {
//                System.out.println(i);
//            }
//        }
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("enter a string");
//        String str=scanner1.next();
//        String exit="exit";
//        int counter=0;
//        while(str.compareTo(exit)!=0)
//        {
//            System.out.println("enter a string");
//            str=scanner1.next();
//            if(str.length()>=4)
//            {counter++;
//            }
//        }
//        System.out.println("DONE");
//        System.out.println("the number of words entered with more than 4 chars is: "+counter);
//    }
//    }


















