package case_study.models;


public abstract class Facility {
    private String dichVu;
    private double dienTichSuDung;
    private double chiPhi;
    private int soLuong;
    private String kieuThue;

    public Facility(String dichVu, double dienTichSuDung, double chiPhi, int soLuong, String kieuThue) {
        this.dichVu = dichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhi = chiPhi;
        this.soLuong = soLuong;
        this.kieuThue = kieuThue;
    }

    public String getDichVu() {
        return dichVu;
    }

    public void setDichVu(String dichVu) {
        this.dichVu = dichVu;
    }

    public double getdienTichSuDung() {
        return dienTichSuDung;
    }

    public void setdienTichSuDung(double dienTichSuDung) {
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
                "dichVu='" + dichVu + '\'' +
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
