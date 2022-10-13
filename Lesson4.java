import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lesson4 {
    public static ArrayList<Integer> Task1 (LinkedList<Integer> linkedList){
        var reverse = new ArrayList<Integer>(linkedList.size());
        new LinkedList<>(linkedList).descendingIterator().forEachRemaining(reverse::add);
        return reverse;
    }


    public static LinkedList<Integer> LinkedListReverseIterator(LinkedList<Integer> linkedList){
        LinkedList<Integer> reversedLinkedList = new LinkedList<>();
        ListIterator<Integer> iteratorInt = linkedList.listIterator();
        while(iteratorInt.hasNext()){
            iteratorInt.next();
        }
        while(iteratorInt.hasPrevious()){
            reversedLinkedList.add(iteratorInt.previous());
        }
        return reversedLinkedList;
    }

    public static int Task3(LinkedList<Integer> linkedList){
        int result = 0;
        ListIterator<Integer> iterator = linkedList.listIterator();
        while (iterator.hasNext()){
            result += iterator.next();
        }
        return result;
    }
}
