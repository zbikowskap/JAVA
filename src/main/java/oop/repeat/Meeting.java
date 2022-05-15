package oop.repeat;

import java.time.LocalDate;

public class Meeting {

    private String description;
    private LocalDate date;
    private String address;
    private int size;

    public Meeting(String description, String address) {
        this.description = description;
        this.address = address;
        this.date = LocalDate.now();
        this.size = 18;
    }

    public Meeting(String description, LocalDate date, String address, int size) {
        this.description = description;
        this.date = date;
        this.address = address;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String description() {
        return "Meeting{" +
                "description='" + description + '\'' +
                ", date=" + date +
                ", address='" + address + '\'' +
                ", size=" + size +
                '}';
    }
}
