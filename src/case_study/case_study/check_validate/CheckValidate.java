package case_study.check_validate;


import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckValidate {
    static Scanner scanner = new Scanner(System.in);

    public static final String SERVICE_VILLA = "^[S]V[V]L-[0-9]{4}$";
    public static final String SERVICE_HOUSE = "^[S]V[H]O-[0-9]{4}$";
    public static final String SERVICE_ROOM = "^[S]V[R]O-[0-9]{4}$";

    public static final String VILLA = "^[V]i[l]l[a]$";
    public static final String HOUSE = "^[H]o[u]s[e]$";
    public static final String ROOM = "^[R]o[o]m$";
    public static final String NUMBER = "^[1-9][0-9]*$";



    public static String checkValidate(String regex, String msg) {
        while (true) {
            System.err.println(msg);
            String value = scanner.nextLine();
            if (Pattern.matches(regex, value)) {
                return value;
            } else {
                System.out.println("bạn nhập sai");
            }
        }
    }

    public static String mess(String mess) {
        return "định dạng của dịch vụ là " + mess+"-YYYY" + " với YYYY là 4 chữ số";
    }

    public static void main(String[] args) {
    }
}


