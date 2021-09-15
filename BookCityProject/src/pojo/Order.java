package pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ZhengXinchang
 * @create 2021-09-13-19:43
 */
public class Order {
    private String order_id;
    private Date createTime;
    private BigDecimal price;
    //0未发货 1已发货 2已签收
    private Integer status = 0;
    private Integer userId;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Order() {
    }

    public Order(String order_id, Date createTime, BigDecimal price, Integer status, Integer userId) {
        this.order_id = order_id;
        this.createTime = createTime;
        this.price = price;
        this.status = status;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id='" + order_id + '\'' +
                ", createTime=" + createTime +
                ", price=" + price +
                ", status=" + status +
                ", userId=" + userId +
                '}';
    }
}
