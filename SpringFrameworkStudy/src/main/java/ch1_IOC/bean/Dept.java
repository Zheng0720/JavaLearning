package ch1_IOC.bean;

/**
 * @author ZhengXinchang
 * @create 2021-10-02-15:02
 */
public class Dept {
    private String dName;



    public void setdName(String dName) {
        this.dName = dName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dName='" + dName + '\'' +
                '}';
    }
}
