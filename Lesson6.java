import java.util.ArrayList;
import java.util.Scanner;

public class Lesson6 {
    public static void task1 (ArrayList<Notebook> notebooks) {
        boolean a = true;

        while (a){
            ArrayList<Notebook> filtredNotebooks = new ArrayList<Notebook>();
            System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                    "1 - ОЗУ\n" +
                    "2 - Объем ЖД\n" +
                    "3 - Операционная система\n" +
                    "4 - Бренд\n" +
                    "5 - Модель\n" +
                    "6 - Видеокарта\n"+
                    "7 - Выход из программы.");

            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextInt()) {
                System.out.println("Неверный ввод! Введите число!");
                scanner.next();
            }
            int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Введите нужное Вам значение:\n");
                while (!scanner.hasNextInt()) {
                    System.out.println("Неверный ввод! Введите число!");
                    scanner.next();
                }
                int ram = scanner.nextInt();
                for (Notebook filter1 : notebooks) {
                    if (filter1.getRam() == ram) {
                        filtredNotebooks.add(filter1);
                    }
                }
                System.out.println(filtredNotebooks);
                break;
            case 2:
                while (!scanner.hasNextInt()) {
                    System.out.println("Неверный ввод! Введите число!");
                    scanner.next();
                }
                int capacity = scanner.nextInt();
                for (Notebook filter1 : notebooks) {
                if (filter1.getCapacity() == capacity) {
                    filtredNotebooks.add(filter1);
                }
                }
                System.out.println(filtredNotebooks);
                break;
            case 3:
                System.out.println("Введите нужное Вам значение:\n");
                String os = scanner.next();
                for (Notebook filter1 : notebooks) {
                    if (os.equals(filter1.getOs())) {
                        filtredNotebooks.add(filter1);
                    }
                }
                System.out.println(filtredNotebooks);
                break;
            case 4:
                System.out.println("Введите нужное Вам значение:\n");
                String brand = scanner.next();
                for (Notebook filter1 : notebooks) {
                    if (brand.equals(filter1.getBrand())) {
                        filtredNotebooks.add(filter1);
                    }
                }
                System.out.println(filtredNotebooks);
                break;
            case 5:
                System.out.println("Введите нужное Вам значение:\n");
                String model = scanner.next();
                for (Notebook filter1 : notebooks) {
                    if (model.equals(filter1.getModel())) {
                        filtredNotebooks.add(filter1);
                    }
                }
                System.out.println(filtredNotebooks);
                break;
            case 6:
                System.out.println("Введите нужное Вам значение:\n");
                String graphicCard = scanner.next();
                for (Notebook filter1 : notebooks) {
                    if (graphicCard.equals(filter1.getGraphicCard() )) {
                        filtredNotebooks.add(filter1);
                    }
                }
                System.out.println(filtredNotebooks);
                break;
            default:
                System.out.println("Неверный ввод! Введите число для выбора параметра!");
                break;
            case 7:
                a=false;
                break;
        }
    }
}
}
