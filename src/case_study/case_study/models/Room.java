package case_study.models;

public class Room extends Facility {
    private String dichVufree;

    public String getDichVufree() {
        return dichVufree;
    }

    public void setDichVufree(String dichVufree) {
        this.dichVufree = dichVufree;
    }


    public Room(String maDichVu, String dichVu, double dienTichSuDung, double chiPhi, int soLuong, String kieuThue, String dichVufree) {
        super(maDichVu, dichVu, dienTichSuDung, chiPhi, soLuong, kieuThue);
        this.dichVufree = dichVufree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVufree='" + dichVufree + '\'' +
                ", maDichVu='" + maDichVu + '\'' +
                ", dichVu='" + dichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhi=" + chiPhi +
                ", soLuong=" + soLuong +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }
}

