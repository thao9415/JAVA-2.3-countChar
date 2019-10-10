import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi;
        char kyTu;
        kyTu='a';
        int count = 0;

        System.out.printf("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.printf("Số lượng số ký tự "+kyTu+" xuất hiện là: "+count);


//        System.out.printf("Enter character: ");
//        Scanner scanner = new Scanner(System.in);
//        String x = scanner.nextLine();
//        String[] arr = {"dscallsadsanskdalmsavnajflaflcac"};
//        int count = 0;
//        for (int i= 0; i<arr.length; i++) {
//            if ( x.equals(arr.charAt(i))) {
//                count++;
//            }
//
//        }
//        System.out.printf(count);
    }
}
