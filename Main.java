
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Notebook> notebooks = new ArrayList<Notebook>();
        Notebook notebook1 = new Notebook("Asus","FA213131", 16,1024,"Windows","MSI 4090");
        Notebook notebook2 = new Notebook("Acer", "FA213131","Windows");
        Notebook notebook3 = new Notebook("Lenovo","FA2323", 32,2048,"Linux","Nvidia 2080");
        Notebook notebook4 = new Notebook("Xioami","2221", 8,1024,"Windows","MSI 3090");
        Notebook notebook5 = new Notebook("PackardBell","11111", 16,1024,"Linux","Palit 3060");
        Notebook notebook6 = new Notebook("Apple","3", 32,1024,"MacOS","Radeon 6800XT");
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        Lesson6.task1(notebooks);

    }
}