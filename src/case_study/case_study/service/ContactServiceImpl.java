package case_study.service;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.House;
import case_study.models.Villa;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ContactServiceImpl implements ContactService {
    private static Queue<Contract> queueContract = new ArrayDeque<>();
    static Scanner scanner = new Scanner(System.in);

    public static void contract() {
        for (Booking booking : BookingServiceImpl.setToqueue()) {
            if (booking.getFacility() instanceof Villa || booking.getFacility() instanceof House) {
                System.out.println("nhập mã hợp đồng");
                int code = Integer.parseInt(scanner.nextLine());
                System.out.println("số tiền cọc trước");
                double firstMoney = Integer.parseInt(scanner.nextLine());
                System.out.println("số tiền thanh toán");
                double bill = Integer.parseInt(scanner.nextLine());
                Contract contract = new Contract(code, firstMoney, bill, booking);
                queueContract.add(contract);
            }
        }
    }

    public static void editContract() {
        System.out.println("nhập mã số hợp đồng");
        int soHopdong = Integer.parseInt(scanner.nextLine());
        for (Contract contract : queueContract) {
            if (contract.getsoHopDong() == soHopdong) {
                System.out.println("nhập số hợp đồng");
                soHopdong = Integer.parseInt(scanner.nextLine());
                System.out.println("Số tiền cọc");
                double tienCoc = Integer.parseInt(scanner.nextLine());
                System.out.println("Số tiền thanh toán");
                double tienThanhtoan = Integer.parseInt(scanner.nextLine());
                contract.setsoHopDong(soHopdong);
                contract.setsoTienCoc(tienCoc);
                contract.setsoTienThanhToan(tienThanhtoan);
            } else {
                System.out.println("không tìm thấy");
            }
        }
    }

    @Override
    public void add() {
    }

    @Override
    public void show() {

    }
}
