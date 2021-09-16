package ch12_json.json;

import ch12_json.pojo.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ZhengXinchang
 * @create 2021-09-15-15:42
 */
public class JsonTest {
    @Test
    //1.2.1，javaBean和json的互转
    public void test1(){
        Person person = new Person(1, "郑鑫昌");
        Gson gson = new Gson();
        String personJsonString = gson.toJson(person);
        System.out.println(personJsonString);

        Person person1 = gson.fromJson(personJsonString, Person.class);
        System.out.println(person1);
    }
    //1.2.2，List 和json的互转
    @Test
    public void test2(){
        List<Person> personList=new ArrayList<>();
        personList.add(new Person(1,"郑鑫昌"));
        personList.add(new Person(2,"周杰伦"));
        personList.add(new Person(3,"孙燕姿"));

        Gson gson = new Gson();
        String s = gson.toJson(personList);
        System.out.println(s);
        List<Person> list = gson.fromJson(s, new TypeToken<List<Person>>(){}.getType());
        System.out.println(list);
        Person person = list.get(0);
        System.out.println(person);
    }
    //1.2.3. map和json的互转
    @Test
    public void test3(){
        Map<Integer,Person> personMap=new HashMap<>();
        personMap.put(1,new Person(1,"郑鑫昌"));
        personMap.put(2,new Person(2,"周杰伦"));

        Gson gson = new Gson();

        String personMapJsonString = gson.toJson(personMap);
        System.out.println(personMapJsonString);

        Map<Integer,Person> map = gson.fromJson(personMapJsonString, new TypeToken<HashMap<Integer,Person>>(){}.getType());
        System.out.println(map);
        Person person1 = map.get(1);
        System.out.println(person1);
    }
}
