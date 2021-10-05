package case_study.service;

import case_study.check_validate.CheckArea;
import case_study.check_validate.CheckValidate;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    protected static Map<Facility, Integer> list = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        list.put(new House("House","SVHO-1234", 500, 50000, 4, "hours", "VIP", 5), 0);
        list.put(new Room("Room","SVRO-1234", 500, 700000, 4, "hours", "drinking"), 0);
        list.put(new Villa("Villa","SVVL-1234", 500, 800000, 4, "hours", "VIP", 5, 100), 0);
    }

    public static Facility getFacility(String serviceName) {
        for (Map.Entry<Facility, Integer> map : list.entrySet()) { // lấy theo tên dịch vụ house,room....
            if (map.getKey().getDichVu().contains(serviceName)) {
                map.setValue(map.getValue() + 1);
                return map.getKey();
            }
        }
        return null;
    }

    public static void showFacility() {
        for (Facility facility : list.keySet()) {
            Integer value = list.get(facility);
            System.out.println(facility + "có key là : " + value);
        }
    }

    @Override
    public void show() {
    }

    @Override
    public void add() {
        int login = 1;
        do {
            System.out.println("Service");
            System.out.println("1.\tAdd New Villa");
            System.out.println("2.\tAdd New House");
            System.out.println("3.\tAdd New Room");
            System.out.println("4.\tBack to menu");
            login = scanner.nextInt();
            scanner.nextLine();
            switch (login) {
                case 1: // Villa
                    System.out.println("Tên dịch vụ");
                    String nameVilla = CheckValidate.villa();
                    System.out.println("mã dịch vụ");
                    String dv = CheckValidate.checkServiceVilla();
                    System.out.println("diện tích sử dụng");
                    double dienTich = Double.parseDouble(CheckArea.areaUse());
                    System.out.println("chi phí");
                    double chiPhi = Double.parseDouble(CheckArea.chiPhi());
                    System.out.println("số lượng");
                    int soLuong = Integer.parseInt(scanner.nextLine());
                    System.out.println("kiểu thuê");
                    String kieuThue = scanner.nextLine();
                    System.out.println("Tiêu chuẩn");
                    String tieuChuan = scanner.nextLine();
                    System.out.println("Số tầng");
                    int soTang = Integer.parseInt(scanner.nextLine());
                    System.out.println("diên tích hồ bơi");
                    double hoBoi = Double.parseDouble(CheckArea.areaUse());
                    Villa villa = new Villa(nameVilla,dv, dienTich, chiPhi, soLuong,
                            kieuThue, tieuChuan, soTang, hoBoi);
                    list.put(villa, 0);
                    break;
                case 2: // house
                    System.out.println("Tên dịch vụ");
                    String nameHouse = CheckValidate.house();
                    System.out.println("Mã dịch vụ");
                    String dv1 = CheckValidate.checkServiceHouse();
                    System.out.println("diện tích sử dụng");
                    double dienTich1 = Double.parseDouble(CheckArea.areaUse());
                    System.out.println("chi phí");
                    double chiPhi1 = Double.parseDouble(CheckArea.chiPhi());
                    System.out.println("số lượng");
                    int soLuong1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("kiểu thuê");
                    String kieuThue1 = scanner.nextLine();
                    System.out.println("Tiêu chuẩn");
                    String tieuChuan1 = scanner.nextLine();
                    System.out.println("Số tầng");
                    int soTang1 = Integer.parseInt(scanner.nextLine());
                    House house = new House(nameHouse,dv1, dienTich1, chiPhi1,
                            soLuong1, kieuThue1, tieuChuan1, soTang1);
                    list.put(house, 0);
                    break;
                case 3: //room
                    System.out.println("Tên dịch vụ");
                    String nameRoom = CheckValidate.room();
                    System.out.println("Mã dịch vụ");
                    String dv2 = CheckValidate.checkServiceRoom();
                    System.out.println("diện tích sử dụng");
                    double dienTich2 = Double.parseDouble(CheckArea.areaUse());
                    System.out.println("chi phí");
                    double chiPhi2 = Double.parseDouble(CheckArea.chiPhi());
                    System.out.println("số lượng");
                    int soLuong2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("kiểu thuê");
                    String kieuThue2 = scanner.nextLine();
                    System.out.println("dịch vụ free");
                    String dVfree = scanner.nextLine();
                    Room room = new Room(nameRoom,dv2, dienTich2, chiPhi2, soLuong2, kieuThue2, dVfree);
                    list.put(room, 0);
                    break;
            }
        } while (login != 4);
    }

    public static void maintenance() {
        for (Map.Entry<Facility, Integer> map : list.entrySet()) {
            if (map.getValue() >= 5) {
                System.out.println(map.getKey());
            } else {
                System.out.println("Không có dịch vụ nào cần bảo trì");
            }
        }
    }
}
