public class targil7 {
    public static void main(String[] args) {
        strong(5);
    }
    public static void strong(int num){
        int power = num;
        for (int i = 0; i < 5; i++) {
            System.out.print(num+",");
            num*=power;
        }
    }
}
