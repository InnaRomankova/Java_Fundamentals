package by.it.romankova.lesson2.object_24_InputOutputStreams;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    private static final String RESOURCES_DIR_NAME = "src" + File.separator + "by" + File.separator + "it"
            + File.separator + "romankova" + File.separator + "lesson2"+ File.separator
            + "object_24_InputOutputStreams"+File.separator+"resources";


    public static void main(String[] args) throws IOException {

 //создаем новую директорию
        File resourcesDirectory = new File( RESOURCES_DIR_NAME);// Создаем путь/ссылку на директорию:
        boolean directoryCreated = resourcesDirectory.mkdir(); // создаем директорию
        System.out.println("directoryCreated "+directoryCreated); // проверяем, создана ли директория true - если создался, или false - если уже раньше создан
// создаем в директории файл
        File file = new File(RESOURCES_DIR_NAME+File.separator+"poem.txt"); // создаем путь/ссылку на файл
        boolean wasCreated = file.createNewFile(); // создаем сам файл
        System.out.println("wasCreated "+wasCreated); // проверяем, создан ли файл true - если создался, или false - если уже раньше создан
//методы класса
        System.out.println(".exists() "+resourcesDirectory.exists()); // проверка - реально ли существует файл на жестком диске?
        System.out.println(".canRead() "+resourcesDirectory.canRead()); // проверка - разрешено ли чтение из файла
        System.out.println(".canWrite() "+resourcesDirectory.canWrite()); // проверка - разрешена ли запись в файл
        System.out.println(".getAbsolutePath() "+resourcesDirectory.getAbsolutePath()); // вывести абсолютный путь
        System.out.println(".getPath() "+resourcesDirectory.getPath()); // вывести путь
        System.out.println(".getCanonicalPath() "+file.getCanonicalPath()); // выводит путь
        System.out.println(".getTotalSpace() "+file.getTotalSpace()); // размеры объем
        System.out.println(".getUsableSpace() "+file.getUsableSpace()); // размеры объем
        System.out.println(".delete() "+file.delete()); // удалить файл
        System.out.println(".delete() "+resourcesDirectory.delete()); // удалить файл





    }
}
