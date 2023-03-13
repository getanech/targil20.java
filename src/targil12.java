public class targil12 {
    public static void main(String[] args) {
         int[] arr={1,2,3,3,3,5,7,8};
        System.out.println(hsdDuplicates(arr));
        //int[] arr="11:28:34";
        //clock();

    }
    public static boolean hsdDuplicates(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
        for (int j = 1;j< arr.length;j++){
            if (arr[i]==arr[j]){
               return true;
            }
        }
        }
        return false;
    }
//    public static void clock(){
//         String timeArray[];
//                 timeArray= timeArray.split(":");
//        for (int i = 0; i < timeArray; i++) {
//            System.out.println(timeArray[i]);
//        }
    }

//}
