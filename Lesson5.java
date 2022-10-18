import java.util.*;

public class Lesson5 {

    public static HashMap<String, Integer> task2(String[] array) {
        HashMap<String, String> names = new HashMap<String, String>();
        HashMap<String, Integer> namesAndCount = new HashMap<String, Integer>();
        for (String name : array) {
            String[] splitted = name.split(" ");
            names.put(splitted[1], splitted[0]);
            namesAndCount.put(splitted[0], Collections.frequency(names.values(), splitted[0]));
        }
        return namesAndCount;
    }

    public static TreeMap<Integer, ArrayList<String>> sortedTask2(HashMap<String, Integer> namesAndCount) {

        TreeMap<Integer, ArrayList<String>> sortedNames= new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer key1, Integer key2) {
                return Integer.compare(key2, key1);
            }
        });

        for (int i = 0; i < namesAndCount.size(); i++) {
            if (!sortedNames.containsKey(namesAndCount.values().toArray()[i])) {
                ArrayList<String> names = new ArrayList<>();
                names.add((String) namesAndCount.keySet().toArray()[i]);
                sortedNames.put((Integer) namesAndCount.values().toArray()[i], names);
            } else {
                ArrayList<String> list = sortedNames.get(namesAndCount.values().toArray()[i]);
                list.add((String) namesAndCount.keySet().toArray()[i]);
            }
        }
        return sortedNames;
    }
}