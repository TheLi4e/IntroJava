
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lesson3 {

    public static List<Integer> task1 (List<Integer>list){
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i)%2==0){
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public static List<Integer> task2 (List<Integer>list){
        int max = Collections.max(list);
        int min = Collections.min(list);
        int sum = 0;
        for (int i: list) {
            sum += i;
        }
        int average = sum/ list.size();
        List <Integer> result = new ArrayList();
        result.add(max);
        result.add(min);
        result.add(average);
        return result;

    }
}
