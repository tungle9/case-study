package case_study.service;

import case_study.models.*;


import java.util.*;

public class BookingServiceImpl implements BookingService {
    protected static TreeSet<Booking> treeSet = new TreeSet<>(new Booking());
    static Scanner scanner = new Scanner(System.in);

    public static Queue<Booking> setToqueue() {
        Queue<Booking> queue1 = new ArrayDeque<>();
        for (Booking booking : treeSet) {
            queue1.add(booking);
            System.out.println(booking);
        }
        return queue1;
    }


    static {
        Booking booking2 = new Booking(123, "15/10/2000", "8/11/2000", CustomerServiceImpl.list.get(1), FacilityServiceImpl.getFacility("House"));
        Booking booking = new Booking(123, "15/10/2000", "7/11/2000", CustomerServiceImpl.list.get(0), FacilityServiceImpl.getFacility("House"));
        Booking booking1 = new Booking(321, "17/10/2000", "20/10/2000", CustomerServiceImpl.list.get(1), FacilityServiceImpl.getFacility("Room"));
        treeSet.add(booking);
        treeSet.add(booking1);
        treeSet.add(booking2);
    }

    public static Customer getCustomer(int code) { // tìm kiếm customer bằng mã
        for (Customer customer : CustomerServiceImpl.list) {
            if (customer.getCustomerCode() == code) {
                return customer;
            }
        }
        System.out.println("không tìm thấy vui lòng nhập mới");
        return null;
    }

    public static Facility getFacility(String service) { // tìm kiếm địch vụ
        for (Facility facility : FacilityServiceImpl.list.keySet()) {
            if (facility.getDichVu().contains(service)) {
                return facility;
            }
        }
        System.out.println("không tìm thấy dịch vụ");
        return null;
    }
    @Override
    public void add() {
        System.out.println("nhập mã booking");
        int idBooking = Integer.parseInt(scanner.nextLine());
        System.out.println("ngày bắt đầu");
        String batDau = scanner.nextLine();
        System.out.println("ngày kết thúc");
        String ketThuc = scanner.nextLine();
        CustomerServiceImpl.showCustomer();
        System.out.println("Nhập mã khách hàng");
        int code = Integer.parseInt(scanner.nextLine());
        Customer customer = getCustomer(code);
        FacilityServiceImpl.showFacility();
        System.out.println("mã dịch vụ");
        String serviceCode = scanner.nextLine();
        Facility facility = getFacility(serviceCode);
        Booking booking = new Booking(idBooking, batDau, ketThuc, customer, facility);
        treeSet.add(booking);
    }
    @Override
    public void show() {
        for (Booking booking : treeSet) {
            System.out.println(booking);
        }
    }
}