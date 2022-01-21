package by.it.romankova.lesson2.test_;

public class Test {
    public static void main(String[] args) {
        char c1 = '1';
        char c2 = '\u0031';
        char c3 = 49;
        System.out.println(c1+c2+c3);
        System.out.println(c2+c3);
        System.out.println(c1+c2);
        System.out.println(c1+c3);
        Object obj = new Object();
        System.out.println(obj.hashCode());
        System.out.println(obj.hashCode());
    }

}
