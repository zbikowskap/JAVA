package functionalprogramming.streams.exercise;

public class Room {

    private String city;
    private double m2;
    private double price;
    private double distanceFromCenter;

    public Room(String city, double m2, double price, double distanceFromCenter) {
        this.city = city;
        this.m2 = m2;
        this.price = price;
        this.distanceFromCenter = distanceFromCenter;
    }

    public String getCity() {
        return city;
    }

    public double getM2() {
        return m2;
    }

    public double getPrice() {
        return price;
    }

    public double getDistanceFromCenter() {
        return distanceFromCenter;
    }

    @Override
    public String toString() {
        return "Room{" +
                "city='" + city + '\'' +
                ", m2=" + m2 +
                ", price=" + price +
                ", distanceFromCenter=" + distanceFromCenter +
                '}';
    }
}
