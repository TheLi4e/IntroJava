
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
    //Task1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);
        System.out.println("List: " + linkedList);
        System.out.println("Reversed list: " + Lesson4.Task1(linkedList));

    //Task3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
        System.out.println(Lesson4.Task3(linkedList));
    }
}