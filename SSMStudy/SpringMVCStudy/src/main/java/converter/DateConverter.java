package converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZhengXinchang
 * @create 2021-10-10-18:25
 */
public class DateConverter  implements Converter<String, Date> {

    @Override
    public Date convert(String dataStr) {
        //将日期字符串转换成日期对象进行返回
        Date date=null;
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = format.parse(dataStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
