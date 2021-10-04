package case_study;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[1-9]{1,2}/[0-9]{1,2}/[0-9]{4}$");
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