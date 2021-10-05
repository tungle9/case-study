package case_study;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        boolean check = true ;
//        while (check) {
//            check = false;
//            try {
//                int a  = Integer.parseInt(scanner.nextLine());
//                break;
//            } catch (Exception e) {
//                check = true ;
//                System.out.println("nhập lại");
//                System.out.println(e);
//            }
//        }
//        System.out.println("đúng");




        Pattern pattern = Pattern.compile("^[V]I[P]$");
        while (true) {
            String a = scanner.nextLine();
            if (pattern.matcher(a).find()) {
                System.out.println(a);
                break;
            } else {
                System.err.println("bạn nhập sai");
            }
        }
  }
}