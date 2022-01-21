package by.it.romankova.lesson1.lab1KP;
/*3.Найти в массиве число, которое повторяется наибольшее количество раз.*/

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Random random = new Random();
        for (int i=0; i<arr.length;i++){
            arr[i]=random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        int n=0;
        int frec=0;
        for (int temp:arr){
            int narr=frequency (arr,temp);
            if(frec<narr){
                n=temp;
                frec=narr;
            }
        }
        System.out.println(n+" "+frec);
    }
    static int frequency(int[] arr,int x){
        int n=0;
        for (int temp:arr){
            if(x==temp){
                n++;
            }
        }return n;
    }

}
