package case_study.check_validate;

import java.util.Scanner;
import java.util.regex.Pattern;


public class CheckFacility {
    static Scanner scanner = new Scanner(System.in);
    public static final String AREA = "^[1-9][0-9]{2,}$";
    public static final String AREA2 = "^[3-9][1-9]$";
    public static final String CHIPHI = "^[1-9][0-9]{5,}$";
    public static final String SOLUONG = "^[1-9]|[1][0-9]$";
    public static final String SOTANG = "^[1-9][0-9]?$";

    public static final String HOURS = "^[H]o[u]r[s]$";
    public static final String DAY = "^[D]a[y]$";
    public static final String MONTH = "^[M]o[n]t[h]$";    // Pattern.compile("^([0]?[1-9]|[12][0-9]|3[01])/(0?[1-9]|[1][012])$");

    public static final String BORN = "^([1-9]|[12][0-9]|3[01])/([1-9]|[1][012])/((19|20)[3-9][0-9])$";    //dd/mm/yyyy

    public static final String VIP = "^[V]i[p]$";
    public static final String BUDGET = "^[B]u[d][g]e[t]$";

    public static String checkBorn() {
        while (true) {
            String born = scanner.nextLine();
            if (Pattern.matches(BORN, born)) {
                return born;
            } else {
                System.out.println("bạn nhập sai");
            }
        }
    }

    public static String tieuChuan() {
        while (true) {
            String tieuChuan = scanner.nextLine();
            if (Pattern.matches(VIP, tieuChuan) || Pattern.matches(BUDGET, tieuChuan)) {
                return tieuChuan;
            } else {
                System.out.println("bạn nhập sai mời nhập lại");
                System.err.println("tiêu chuẩn thuê có 2 loại Vip,Budget(bình dân)");
            }
        }
    }


    public static String kieuThue() {
        while (true) {
            String kieuThue = scanner.nextLine();
            if (Pattern.matches(HOURS, kieuThue) || Pattern.matches(DAY, kieuThue)
                    || Pattern.matches(MONTH, kieuThue)) {
                return kieuThue;
            } else {
                System.out.println("bạn nhập sai mời nhập lại");
                System.err.println("kiểu thuê có định dạng Day,Month,Hours");
            }
        }
    }

    public static String soTang() {
        while (true) {
            String soTang = scanner.nextLine();
            if (Pattern.matches(SOTANG, soTang)) {
                return soTang;
            } else {
                System.out.println("bạn nhập sai mời nhập lại");
            }
        }
    }


    public static String members() {
        while (true) {
            String member = scanner.nextLine();
            if (Pattern.matches(SOLUONG, member)) {
                return member;
            } else {
                System.out.println("bạn nhập sai");
                System.err.println("số lượng người thuê phải dưới 20 người");
            }
        }
    }


    public static String areaUse() {
        while (true) {
            String area = scanner.nextLine();
            if (Pattern.matches(AREA, area) || Pattern.matches(AREA2, area)) {
                return area;
            } else {
                System.out.println("bạn nhập sai");
                System.out.println("số bạn nhập phải lớn hơn 30 m2");
            }
        }
    }

    public static String chiPhi() {
        while (true) {
            String chiPhi = scanner.nextLine();
            if (Pattern.matches(CHIPHI, chiPhi)) {
                return chiPhi;
            } else {
                System.out.println("bạn nhập sai");
                System.err.println("chi phí nhỏ nhất là 100.000");
            }
        }
    }

    public static void main(String[] args) {
        areaUse();

    }

}
