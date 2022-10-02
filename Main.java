import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*Task1. В консоли запросить имя пользователя. В зависимости от текущего времени,
вывести приветствие вида • "Доброе утро, <Имя>!",
если время от 05:00 до 11:59 • "Добрый день, <Имя>!",
если время от 12:00 до 17:59; • "Добрый вечер, <Имя>!",
если время от 18:00 до 22:59; • "Доброй ночи, <Имя>!",
если время от 23:00 до 4:59
 */
        String name = GetName();
        LocalDateTime currentTime = LocalDateTime.now();
        var time = currentTime.getHour();
        System.out.println(Lesson1.Task1(time, name));

//Task2. Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1
        int[] binary = {1, 1, 0, 1, 1, 1};
        System.out.println(Lesson1.Task2(binary));

/*Task3. Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа, равные заданному,
нужно перенести эти элементы в конец массива. Таким образом, первые несколько (или все) элементов
массива должны быть отличны от заданного, а остальные - равны ему.
*/
        int[] nums = {3, 2, 2, 3};
        String val = Integer.toString(3);
        int[] result = Lesson1.Task3(nums, val);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();

//Task4. Вычислить n-ое треугольное число
        Lesson1.Task4();
    }

    private static String GetName() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите имя: ");
        return userInput.nextLine();
    }
}
