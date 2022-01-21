package by.it.romankova.lesson1.lab3.arrays;

public class Example2 {
    public static void main(String[] args) {
        int[] [] array = {{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int sum = 0;
        for (int i =0; i<array.length; i++){
            for (int j=0; j<array[0].length; j++){
                sum+=array[i][j];
            }
        }
        System.out.println(sum);
    }
}
