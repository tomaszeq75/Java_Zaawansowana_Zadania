package enums;

import java.util.Objects;

public class Order {

    private int price;
    Transport transport;

    public Order(int price, Transport transport) {
        this.price = price;
        this.transport = transport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return price == order.price && transport == order.transport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, transport);
    }
}
