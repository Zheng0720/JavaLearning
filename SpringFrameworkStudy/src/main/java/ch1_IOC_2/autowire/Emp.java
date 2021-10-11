package ch1_IOC_2.autowire;

/**
 * @author ZhengXinchang
 * @create 2021-10-03-10:00
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
}
