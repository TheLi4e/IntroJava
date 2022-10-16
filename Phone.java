import java.util.HashMap;
import java.util.Map;

public class Phone {
    private Map<String, String> map;

    public Phone() {
        map = new HashMap<>();
    }

    void add(String number, String name) {
        map.put(number, name);
    }

    public void search(String name) {
        for (String key : map.keySet()) {
            if (map.get(key).equals(name)) {
                System.out.println(map.get(key) + "\t" + key);
            }
        }
    }

    public void print(){
        for (Object objectName : map.keySet()) {
            System.out.print(map.get(objectName)+ "\t");
            System.out.println(objectName);
        }
    }

}

