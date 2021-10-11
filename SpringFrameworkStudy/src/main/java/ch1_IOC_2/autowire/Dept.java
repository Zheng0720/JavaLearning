package ch1_IOC_2.autowire;

/**
 * @author ZhengXinchang
 * @create 2021-10-03-10:00
 */
public class Dept {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }
}
