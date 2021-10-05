package case_study.models;

public class Villa extends House {
    private double dienTichHoBoi;

    public Villa(String maDichVu, String dichVu, double dienTichSuDung, double chiPhi, int soLuong, String kieuThue, String tieuChuan, int soTang, double dienTichHoBoi) {
        super(maDichVu, dichVu, dienTichSuDung, chiPhi, soLuong, kieuThue, tieuChuan, soTang);
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public double getdienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setdienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }
}
