package case_study.models;


public abstract class Facility {
    private String maDichVu;
    private String dichVu;
    private double dienTichSuDung;
    private double chiPhi;
    private int soLuong;
    private String kieuThue;

    public Facility(String maDichVu, String dichVu, double dienTichSuDung, double chiPhi, int soLuong, String kieuThue) {
        this.maDichVu = maDichVu;
        this.dichVu = dichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhi = chiPhi;
        this.soLuong = soLuong;
        this.kieuThue = kieuThue;
    }

    public String getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getDichVu() {
        return dichVu;
    }

    public void setDichVu(String dichVu) {
        this.dichVu = dichVu;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "maDichVu='" + maDichVu + '\'' +
                ", dichVu='" + dichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhi=" + chiPhi +
                ", soLuong=" + soLuong +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

//    }
//    public void nhap(){
//        System.out.println("dịch vụ");
//        dichVu = scanner.nextLine();
//        System.out.println("diện tích sử dụng ");
//        dienTichSuDung = scanner.nextInt();
//        System.out.println("chi phí ");
//        chiPhi = scanner.nextInt();
//        System.out.println("số lượng");
//        soLuong =scanner.nextInt();
//        System.out.println("kiểu thuê");
//        kieuThue = scanner.nextLine();
//    }
}
