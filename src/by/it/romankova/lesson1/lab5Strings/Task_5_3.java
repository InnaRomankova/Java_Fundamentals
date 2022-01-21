package by.it.romankova.lesson1.lab5Strings;
// 3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_5_3 {
    public static void main(String[] args) throws IOException {

        // Создаем массив строк, вводим через консоль значение длины массива.
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число строк: ");
        int numberOfStrings = Integer.parseInt(reader.readLine());
        String [] arrayOfStrings = new String[numberOfStrings];

        // Вводим строки через консоль. Инициализируем массив.
        for (int i=0; i<numberOfStrings; i++) {
            System.out.print("Введите строку №" +(i+1)+": ");
            arrayOfStrings[i]=reader.readLine();
        }

        // Находим значение средней длины строки.
        float middleLength = 0f;
        for (String element : arrayOfStrings){
            middleLength+= element.length();
        }
        middleLength = Math.round(middleLength/numberOfStrings);
        System.out.print("Средняя длина строки (символов): "+middleLength);

        System.out.print("\n Строки, длина которых меньше средней: ");
        for (int i=0; i<arrayOfStrings.length;i++){
            if (arrayOfStrings[i].length()<middleLength){
                System.out.print("\n №" + (i+1)+". Длина строки: "+ arrayOfStrings[i].length()+". \""+arrayOfStrings[i]+"\"");
            }
        }
        System.out.print("\n Строки, длина которых больше средней: ");
        for (int i=0; i<arrayOfStrings.length;i++){
            if (arrayOfStrings[i].length()>middleLength){
                System.out.print("\n №" + (i+1)+". Длина строки: "+ arrayOfStrings[i].length()+". \""+arrayOfStrings[i]+"\"");
            }
        }
        reader.close();
    }
}
