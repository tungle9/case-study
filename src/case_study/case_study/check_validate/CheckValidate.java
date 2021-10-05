package case_study.check_validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidate {
    private static Pattern pattern;
    private static Matcher matcher;
    static Scanner scanner = new Scanner(System.in);

    private static final String SERVICE_VILLA = "^[S][V][V][L]-[0-9]{4}$";
    private static final String SERVICE_HOUSE = "^[S][V][H][O]-[0-9]{4}$";
    private static final String SERVICE_ROOM = "^[S][V][R][O]-[0-9]{4}$";

    private static final String VILLA = "^[V]i[l]l[a]$";
    private static final String HOUSE = "^[H]o[u]s[e]$";
    private static final String ROOM = "^[R]o[o]m$";

    public static String villa() {
        while (true) {
            String villaName = scanner.nextLine();
            if (Pattern.matches(VILLA, villaName)) {
                return villaName;
            } else {
                System.out.println("bạn nhập sai");
                System.err.println("Định dạng tên dịch vụ phải viết hoa chữ đầu : vd Room,House.v.v");
            }
        }
    }

    public static String house() {
        while (true) {
            String houseName = scanner.nextLine();
            if (Pattern.matches(HOUSE, houseName)) {
                return houseName;
            } else {
                System.out.println("bạn nhập sai");
                System.err.println("Định dạng tên dịch vụ phải viết hoa chữ đầu : vd Room,House.v.v");

            }
        }
    }

    public static String room() {
        while (true) {
            String roomName = scanner.nextLine();
            if (Pattern.matches(ROOM, roomName)) {
                return roomName;
            } else {
                System.out.println("bạn nhập sai");
                System.err.println("Định dạng tên dịch vụ phải viết hoa chữ đầu : vd Room,House.v.v");

            }
        }
    }


    public static String checkServiceVilla() {
        while (true) {
            String villa = scanner.nextLine();
            if
            (Pattern.matches(SERVICE_VILLA, villa)) {
                return villa;
            } else {
                System.out.println("bạn nhập sai");
                System.err.println("Định dạng villa là : SVVL-YYYY với YYYY là 4 chữ số ");
            }
        }
    }

    public static String checkServiceHouse() {
        String house;
        while (true) {
            house = scanner.nextLine();
            if
            (Pattern.matches(SERVICE_HOUSE, house)) {
                return house;
            } else {
                System.out.println("bạn nhập sai");
                System.err.println("Định dạng của house là : SVHO-YYYY với YYYY là 4 chữ số ");
            }
        }
    }

    public static String checkServiceRoom() {
        String room;
        while (true) {
            room = scanner.nextLine();
            if (Pattern.matches(SERVICE_ROOM, room)) {
                return room;
            } else {
                System.out.println("bạn nhập sai");
                System.err.println("định dạng của room là : SVRO-YYYY với YYYY là 4 chữ số  ");
            }
        }
    }

    public static void main(String[] args) {
        checkServiceHouse();
    }
}


