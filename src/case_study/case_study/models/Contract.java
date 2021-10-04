package case_study.models;

public class Contract {
    private int soHopDong;
    private double soTienCoc;
    private double soTienThanhToan;
    private Booking booking;

    public Contract(int soHopDong, double soTienCoc, double soTienThanhToan) {
        this.soHopDong = soHopDong;
        this.soTienCoc = soTienCoc;
        this.soTienThanhToan = soTienThanhToan;
    }

    public Contract(int soHopDong, double soTienCoc, double soTienThanhToan, Booking booking) {
        this.soHopDong = soHopDong;
        this.soTienCoc = soTienCoc;
        this.soTienThanhToan = soTienThanhToan;
        this.booking = booking;
    }

    public int getsoHopDong() {
        return soHopDong;
    }

    public void setsoHopDong(int soHopDong) {
        this.soHopDong = soHopDong;
    }

    public double getsoTienCoc() {
        return soTienCoc;
    }

    public void setsoTienCoc(double soTienCoc) {
        this.soTienCoc = soTienCoc;
    }

    public double getsoTienThanhToan() {
        return soTienThanhToan;
    }

    public void setsoTienThanhToan(double soTienThanhToan) {
        this.soTienThanhToan = soTienThanhToan;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "soHopDong=" + soHopDong +
                ", soTienCoc=" + soTienCoc +
                ", soTienThanhToan=" + soTienThanhToan +
                ", booking=" + booking +
                '}';
    }
}
