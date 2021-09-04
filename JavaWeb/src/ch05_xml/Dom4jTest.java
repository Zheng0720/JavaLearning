package ch05_xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

import java.util.List;

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
    //读取books.xml文件生成book类
    @Test
    public void test2() throws DocumentException {
        //1.读取book.xml文件
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("src/ch05_xml/books.xml");
        //2.通过动Document对象获取根元紊
        Element rootElement = document.getRootElement();
//        System.out.println(rootElement);
        // 3通过根元素获取book标签对象
        List<Element> books = rootElement.elements("book");
        // 4遍历,处理每个book标签转换为Book类
        for(Element book:books){
            String name = book.elementText("name");
            String price = book.elementText("price");
            String author = book.elementText("author");
            String snValue = book.attributeValue("sn");

            System.out.println(new Book(snValue, name, Double.parseDouble(price), author));
        }

    }
}
