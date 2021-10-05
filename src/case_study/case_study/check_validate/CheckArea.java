package case_study.check_validate;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckArea {
    static Scanner scanner = new Scanner(System.in);
    private static final String AREA = "^[1-9]{3,}$";
    private static final String AREA2 = "^[3-9][1-9]$";

    private static final String CHIPHI = "^[1-9][0-9]{5,}$";

    private static final String SOLUONG = "";



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
    public static String chiPhi(){
        while(true){
            String chiPhi = scanner.nextLine();
            if(Pattern.matches(CHIPHI,chiPhi)){
                return chiPhi;
            }
            else {
                System.out.println("bạn nhập sai");
                System.err.println("chi phí nhỏ nhất là 100.000");
            }
        }
    }

    public static void main(String[] args) {

    }

}
