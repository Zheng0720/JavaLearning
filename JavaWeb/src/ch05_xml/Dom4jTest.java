package ch05_xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

/**
 * @author ZhengXinchang
 * @create 2021-09-02-11:55
 */
public class Dom4jTest {
    @Test
    public void test1() throws DocumentException {
        SAXReader saxReader=new SAXReader();
        Document document = saxReader.read("src/ch05_xml/books.xml");
        System.out.println(document);
    }
}
