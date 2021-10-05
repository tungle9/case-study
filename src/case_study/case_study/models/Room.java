package case_study.models;


public class Room extends Facility {
    private String dichVufree;

    public void Room() {
    }

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
}

