package case_study.models;

import java.util.Comparator;


public class Booking implements Comparator<Booking> {
    private int maBooking;
    private String batDau;
    private String ketThuc;
    private Customer customer;
    private Facility facility;

    public Booking() {
    }

    public Booking(int maBooking, String batDau, String ketThuc, Customer customer, Facility facility) {
        this.maBooking = maBooking;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        this.customer = customer;
        this.facility = facility;
    }

    public int getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public String getBatDau() {
        return batDau;
    }

    public void setBatDau(String batDau) {
        this.batDau = batDau;
    }

    public String getKetThuc() {
        return ketThuc;
    }

    public void setKetThuc(String ketThuc) {
        this.ketThuc = ketThuc;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking=" + maBooking +
                ", batDau=" + batDau +
                ", ketThuc=" + ketThuc +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }

    @Override
    public int compare(Booking o1, Booking o2) {
        if (o1.batDau.compareTo(o2.batDau) == 0) {
            return (o1.ketThuc.compareTo(o2.ketThuc));
        } else {
            return (o1.batDau.compareTo(o2.batDau));
        }
    }
}
