package ch1_IOC.bean;

/**
 * @author ZhengXinchang
 * @create 2021-10-02-15:02
 */
public class Emp {
    private Dept dept;
    private String ename;
    private String gender;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                ", ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
