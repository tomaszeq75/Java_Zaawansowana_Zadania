public class Student extends Person {
    private String type;
    private int year, price;

    public Student(String type, int year, int price) {
        this.type = type;
        this.year = year;
        this.price = price;
    }

    public Student(String name, String address, String type, int year, int price) {
        super(name, address);
        this.type = type;
        this.year = year;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
