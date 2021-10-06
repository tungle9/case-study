package case_study.service;

import case_study.check_validate.CheckFacility;
import case_study.check_validate.CheckValidate;
import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.read_write_file.WriteReadVilla;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class FacilityServiceImpl implements FacilityService {
    protected static Map<Facility, Integer> list = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);
    static Integer key = 0;


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
        for (Map.Entry<Facility, Integer> entry : list.entrySet()) {
            Facility facility = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(facility + "=" + value);
        }
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
                    String nameVilla = CheckValidate.checkValidate(CheckValidate.VILLA, "định dạng là Villa");
                    System.out.println("mã dịch vụ");
                    String dv = CheckValidate.checkValidate(CheckValidate.SERVICE_VILLA, CheckValidate.mess("SVVL"));
                    System.out.println("diện tích sử dụng");
                    double dienTich = Double.parseDouble(CheckFacility.areaUse());
                    System.out.println("chi phí");
                    double chiPhi = Double.parseDouble(CheckFacility.chiPhi());
                    System.out.println("phòng có số lượng người");
                    int soLuong = Integer.parseInt(CheckFacility.members());
                    System.out.println("kiểu thuê");
                    String kieuThue = CheckFacility.kieuThue();
                    System.out.println("Tiêu chuẩn");
                    String tieuChuan = CheckFacility.tieuChuan();
                    System.out.println("Số tầng");
                    int soTang = Integer.parseInt(CheckFacility.soTang());
                    System.out.println("diên tích hồ bơi");
                    double hoBoi = Double.parseDouble(CheckFacility.areaUse());
                    Villa villa = new Villa(nameVilla, dv, dienTich, chiPhi, soLuong,
                            kieuThue, tieuChuan, soTang, hoBoi);
                    list.put(villa, key++);
                    WriteReadVilla.writeFile((List<Villa>) list);
                    break;
                case 2: // house
                    System.out.println("Tên dịch vụ");
                    String nameHouse = CheckValidate.checkValidate(CheckValidate.HOUSE, "định dạng là House");
                    System.out.println("Mã dịch vụ");
                    String dv1 = CheckValidate.checkValidate(CheckValidate.SERVICE_HOUSE, CheckValidate.mess("SVHO"));
                    System.out.println("diện tích sử dụng");
                    double dienTich1 = Double.parseDouble(CheckFacility.areaUse());
                    System.out.println("chi phí");
                    double chiPhi1 = Double.parseDouble(CheckFacility.chiPhi());
                    System.out.println("phòng có số lượng người");
                    int soLuong1 = Integer.parseInt(CheckFacility.members());
                    System.out.println("kiểu thuê");
                    String kieuThue1 = CheckFacility.kieuThue();
                    System.out.println("Tiêu chuẩn");
                    String tieuChuan1 = CheckFacility.tieuChuan();
                    System.out.println("Số tầng");
                    int soTang1 = Integer.parseInt(CheckFacility.soTang());
                    House house = new House(nameHouse, dv1, dienTich1, chiPhi1,
                            soLuong1, kieuThue1, tieuChuan1, soTang1);
                    list.put(house, key++);
                    break;
                case 3: //room
                    System.out.println("Tên dịch vụ");
                    String nameRoom = CheckValidate.checkValidate(CheckValidate.ROOM, "định dạng là Room");
                    System.out.println("Mã dịch vụ");
                    String dv2 = CheckValidate.checkValidate(CheckValidate.SERVICE_ROOM, CheckValidate.mess("SVRO"));
                    System.out.println("diện tích sử dụng");
                    double dienTich2 = Double.parseDouble(CheckFacility.areaUse());
                    System.out.println("chi phí");
                    double chiPhi2 = Double.parseDouble(CheckFacility.chiPhi());
                    System.out.println("phòng có số lượng người");
                    int soLuong2 = Integer.parseInt(CheckFacility.members());
                    System.out.println("kiểu thuê");
                    String kieuThue2 = CheckFacility.kieuThue();
                    System.out.println("dịch vụ free");
                    String dVfree = scanner.nextLine();
                    Room room = new Room(nameRoom, dv2, dienTich2, chiPhi2, soLuong2, kieuThue2, dVfree);
                    list.put(room, key++);
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
