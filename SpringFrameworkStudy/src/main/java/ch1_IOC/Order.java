package ch1_IOC;

/**
 * @author ZhengXinchang
 * @create 2021-10-02-10:32
 */
public class Order {
    private String orderName;
    private String address;

    public Order() {
    }

    public Order(String orderName, String address) {
        this.orderName = orderName;
        this.address = address;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
