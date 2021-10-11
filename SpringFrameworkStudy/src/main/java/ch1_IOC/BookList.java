package ch1_IOC;

import java.util.List;

/**
 * @author ZhengXinchang
 * @create 2021-10-02-15:47
 */
public class BookList {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "BookList{" +
                "list=" + list +
                '}';
    }
}
