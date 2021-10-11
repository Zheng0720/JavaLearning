package ch1_IOC_2.bean;

/**
 * @author ZhengXinchang
 * @create 2021-10-03-9:36
 */
public class Order {
    private String oname;

    public Order() {
        System.out.println("执行了无参构造");
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("调用了setOname方法");
    }
    //创建执行的初始化方法
    public void initMethod(){
        System.out.println("初始化的方法");
    }
    //创建销毁方法
    public void destroyMethod(){
        System.out.println("执行了销毁方法");
    }

    @Override
    public String toString() {
        return "Order{" +
                "oname='" + oname + '\'' +
                '}';
    }
}
