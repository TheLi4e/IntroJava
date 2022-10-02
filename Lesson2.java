import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Lesson2 {
    public static String[] GetFiles (String path) {
        File folder = new File(path);
        List<String> filesList = new ArrayList();
        for (File file : folder.listFiles())
        {
            filesList.add(file.getName());
        }
        String[] filesArray = new String[filesList.size()];

        for (int i = 0; i < filesList.size(); i++) {
            filesArray[i] = filesList.get(i);
        }
        return filesArray;
    }

    public static void Task1(String [] filesArray) {
        File file = new File("Task1.txt");
        Logger log = Logger.getLogger(Lesson2.class.getName());
        FileHandler fh = null;
        try {
            fh = new FileHandler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fh.setLevel(Level.INFO);
        fh.setFormatter(simpleFormatter);
        log.addHandler(fh);
        FileWriter fileWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter("Task1.txt", false);
            for (int i = 0; i < filesArray.length ; i++) {
                fileWriter.write(filesArray[i]);
                fileWriter.append('\n');
            }
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            log.warning(e.getMessage());
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void Task2(String [] files)
    {
        String fileType = "";
        for (int i = 0; i < files.length; i++) {
            File file = new File(files[i]);
            System.out.println("Расширение файла: " + getFileExtension(file));
        }
    }
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
}
