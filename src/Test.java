import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        HashMap<String ,String>map=new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","TJU");
        map.put("major","com");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);
    }
}
