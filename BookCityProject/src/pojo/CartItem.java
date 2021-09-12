package pojo;

/**
 * @author ZhengXinchang
 * @create 2021-09-12-9:27
 */
public class CartItem {
    private Integer id;
    private String name;
    private Integer count;
    private double price;
//    private double totalPrice;

    public CartItem() {
    }

    public CartItem(Integer id, String name, Integer count, double price) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        if (count != null) {
            double totalPrice = count * price;
            return totalPrice;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "CartItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", totalPrice=" + this.getTotalPrice() +
                '}';
    }

}
