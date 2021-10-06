package case_study.models;

import case_study.models.Facility;

public class House extends Facility {
    public String tieuChuan;
    public int soTang;

    public House(String maDichVu, String dichVu, double dienTichSuDung, double chiPhi, int soLuong, String kieuThue, String tieuChuan, int soTang) {
        super(maDichVu, dichVu, dienTichSuDung, chiPhi, soLuong, kieuThue);
        this.tieuChuan = tieuChuan;
        this.soTang = soTang;
    }

    public String getTieuChuan() {
        return tieuChuan;
    }
    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }
    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuan='" + tieuChuan + '\'' +
                ", soTang=" + soTang +
                ", maDichVu='" + maDichVu + '\'' +
                ", dichVu='" + dichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhi=" + chiPhi +
                ", soLuong=" + soLuong +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
}

