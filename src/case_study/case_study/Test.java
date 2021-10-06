package case_study;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    protected static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
    static Date date;
    static Scanner scanner = new Scanner(System.in);

    public static Date checkBorn() {
        String age ;
        while (true) {
            try {
                date = dateFormat.parse(scanner.nextLine());
                return date;
            } catch (Exception e) {
                System.out.println("bạn nhập sai định dạng");
            }
            age = dateFormat.format(date);

//            String day1 =  day.format(date);
//            int day2 = Integer.parseInt(day1);

        }



    }

    public static void main(String[] args) {






        Date date = new Date();
        DateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("dd/MM/yyyy: " + dateFormat.format(date));
        dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("MM/dd/yyyy: " + dateFormat.format(date));
        dateFormat = new SimpleDateFormat("hh:mm:ss MM/dd/yyyy");
        System.out.println("hh:mm:ss MM/dd/yyyy: " + dateFormat.format(date));
        dateFormat = new SimpleDateFormat("HH:mm:ss MM/dd/yyyy");
        System.out.println("HH:mm:ss MM/dd/yyyy: " + dateFormat.format(date));
        dateFormat = new SimpleDateFormat("HH:mm:ss.SSS MM/dd/yyyy");
        System.out.println("HH:mm:ss.SSS MM/dd/yyyy: " + dateFormat.format(date));
        dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("HH:mm:ss: " + dateFormat.format(date));


//        Scanner scanner = new Scanner(System.in);
// String s = scanner.nextLine();
//        System.out.println(s);
//
//
//
        Pattern pattern = Pattern.compile("^([1-9]|[12][0-9]|3[01])/([1-9]|[1][012])/((19|20)[3-9][0-9])$");
        Pattern pattern1 = Pattern.compile("^[1-9][0-9]*$");
//        while (true) {
//            String a = scanner.nextLine();
//            if (pattern.matcher(a).find()) {
//                System.out.println(a);
//                break;
//            } else {
//                System.err.println("bạn nhập sai");
//            }
//        }
    }
}
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