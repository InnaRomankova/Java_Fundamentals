package by.it.romankova.lesson1.lab3;

/*3. Имеется целое число, следует вывести его в бухгалтерском формате.
Т.е. начиная справа каждые три позиции отделяются пробелом. Например число
20023143 должно быть выведено как 20 023 143 */

import java.io.*;

public class Task_4_A3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите целое число:");
        String string = reader.readLine();
        System.out.println("Бухгалтерский формат введенного числа:");
        /* С введенным числом будем работать, как со строкой (string).
        С помощью метода charAt будем выводить на печать символы поочередно,
        начиная слева. */
        for (int i=0, j=string.length()-1 ; i<string.length() ; i++, j--){
            System.out.print(string.charAt(i));
            if (j %3== 0 & j>0) {
                System.out.print(" ");
            }
        }
        System.out.println();
        long num = -1876543210678890333L;
        System.out.printf("%,d", num);
    }


}
