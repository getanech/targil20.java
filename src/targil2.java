import java.util.Scanner;

public class targil2 {
    public static void main(String[] args) {
        String FullName;
        int age;
        String city;
        String Address;
        double shoes;
        boolean vegetarian;

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name");
        FullName = scanner.nextLine();
        System.out.println(" your name is " + FullName);

        System.out.println("enter your age");
        age = scanner.nextInt();
        System.out.println(" your age is " + age);

        System.out.println("tell me your city");
        Scanner s1 = new Scanner(System.in);
        city = s1.nextLine();
        System.out.println("your city is " + city);

        System.out.println("tell me your address");
        Address = s1.nextLine();
        System.out.println(" your address is " + Address);

        System.out.println("tell me your shoes size");
        shoes = s1.nextDouble();
        System.out.println(" your shoes size is " + shoes);

        System.out.println("tell me if you are vegetarian");
        vegetarian = s1.nextBoolean();
        System.out.println(" you are "+ vegetarian);

        age+=2;
        System.out.println("your age now is "+age);


    }

}


