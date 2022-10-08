import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    //Task1. Пусть дан произвольный список целых чисел, удалить из него четные числа
        List<Integer> list = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(Lesson3.task1(list));

    /*Task2.Задан целочисленный список ArrayList. Найти минимальное, максимальное и
    среднее арифметическое из этого списка. (Collections.max())
     */
        List<Integer> list1 = new ArrayList();
        list1 = Lesson3.task2(list);
        System.out.println("Максимальное число - "+ list1.get(0) + ", минимальное число - "+list1.get(1)+
                ", среднее арифметическое списка - "+ list1.get(2));
    }
}