package by.it.romankova.lesson2.object_24_InputOutputStreams;

import by.it.romankova.lesson1.packageOfUsedClasses.InputOutput;

import java.io.*;
import java.util.*;

public class T {
    private static final String FINISH_WRITING = "#ESC";
    public static void main(String[] args) throws IOException {

//Считать из одного файла текст НА РУССКОМ и НА АНГЛ. и вывести в другой
        File file = new File(InputOutput.FILE_DIRECTORY, "text.txt");
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter
                    (InputOutput.FILE_DIRECTORY + File.separator + "text4.txt"));

            while (scanner.hasNextLine()) {
                bufferedWriter.write(scanner.nextLine() + "\n");
            }
            scanner.close();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

//Считать с консоли, записать в файл, окончание «#ESC»
        // + вынести константу private static final String FINISH_WRITING = "#ESC";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter
            (InputOutput.FILE_DIRECTORY+ File.separator+"text4.txt"))) {
        System.out.println("Введите данные с консоли для записи в файл. " +
                "После окончания записи введите слово «#ESC».");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputLineFromConsole;
        while (true){
            inputLineFromConsole = bufferedReader.readLine();
            if (inputLineFromConsole.equals(FINISH_WRITING)) break;
            bufferedWriter.write(inputLineFromConsole+"\n");
        }
        bufferedReader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }


//Создать файл и записать в него список файлов (путь, имя, дата создания) из заданного каталога
        File file1 = InputOutput.createNewFile("text3.txt");
        String pathDirectory = InputOutput.readFromTheConsole("Укажите путь к каталогу (например: " +
                "src\\iromankova\\lab10LambdaStream ):  ");
        getFilesDescription(pathDirectory, file1);
        System.out.println("Список файлов (путь, имя, дата создания) из заданного каталога" +
                " находится в файле: " + file1.getPath());
    }

    private static void getFilesDescription(String pathDirectory, File file) {
        File directory = new File(pathDirectory);

        try (FileWriter fileWriter = new FileWriter(file)) {
            for (File fileOfDirectory : Objects.requireNonNull(directory.listFiles())) {
                if (fileOfDirectory.isFile()) {
                    fileWriter.write(fileOfDirectory.getAbsolutePath() + "; " + fileOfDirectory.getName() + "; " +
                            new Date(fileOfDirectory.lastModified()) + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов.Вывести их на экран через пробел.

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream
                (new FileInputStream(InputOutput.readFromTheConsole("Введите путь к файлу " +
                        "(например:  src\\iromankova\\packageOfUsedClasses\\text2.txt ) : ")))) {
            outputMaxFrequencyOfBytes(toHashMapOfBytes(bufferedInputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // В HashMap в качестве ключа помещаем байт, в качестве значения - количество экземпляров байт
    private static HashMap<Integer, Integer> toHashMapOfBytes(BufferedInputStream bufferedInputStream) {
        HashMap<Integer, Integer> hashMapOfBytes = new HashMap<>();
        int key = 0;
        while (true) {
            try {
                if ((key = bufferedInputStream.read()) == -1) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            Integer frequencyOfBytes = hashMapOfBytes.get(key);
            hashMapOfBytes.put(key, frequencyOfBytes == null ? 1 : frequencyOfBytes + 1);
        }
        System.out.println(hashMapOfBytes);
        return hashMapOfBytes;
    }

    // Метод outputMaxFrequencyOfBytes выводит на печать байты с максимальным количеством повторов.
    private static void outputMaxFrequencyOfBytes(HashMap<Integer, Integer> hashMapOfBytes) {
        System.out.print("Байт (байты) с максимальным количеством повторов:");
        hashMapOfBytes.forEach((key, value) -> {
            if (value.equals(Collections.max(hashMapOfBytes.values())))
                System.out.print(" " + key);
        });
        System.out.println(". Количество повторов: " + Collections.max(hashMapOfBytes.values()) + ".");
  }
}