import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson1 {
    public static String  Task1 (int time, String name) {
        if (time >= 5 && time < 12) {
            return System.out.printf("Доброе утро, %s!", name).toString();
        } else if (time >= 12 && time < 18) {
            return System.out.printf("Добрый день, %s!", name).toString();
        } else if (time >= 18 && time < 23) {
            return System.out.printf("Добрый вечер,  %s!", name).toString();
        } else {
            return  System.out.printf("Доброй ночи, %s!", name).toString();
        }
    }

    public static int Task2 (int[] binary){
        int count = 0;
        int result = 0;
        for (int i = 0; i<binary.length; i++){
            if (binary[i]==1){
                count++;
                if(result > count) continue;
                else result = count;
            }
            else{
                count = 0;
            }
        }
        return result;
    }

    public static int[] Task3(int [] nums, String key){
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list1.add(String.valueOf(nums[i]));
        }
        for (int i = list1.size() - 1; i >= 0; i--) {
            if(list1.get(i).equals(key))  {
                list1.add(key);
                list1.remove(i);
            }
        }
        int[] result = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            result[i] = Integer.parseInt(list1.get(i));
        }
        return result;
    }
    public static void Task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (!scanner.hasNextInt()){
            System.out.println("Неверный ввод! Введите число!");
            scanner.next();
        }
        int userNum = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < userNum + 1; i++) {
            result += i;
        }
        System.out.printf("Треугольное число для %d - %d.\n", userNum, result);
    }
}
