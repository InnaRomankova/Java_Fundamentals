package by.it.romankova.lesson2.object_25_test;

public class Collection {
    public static void main(String[] args) {
        Ob o1 = new Ob();
        o1.setD(5);
        Ob o2 = new Ob();
        o2.setD(5);
        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode()==o2.hashCode());
        System.out.println(o1==o2);
        System.out.println(o1);
        System.out.println(o2);

        String s1 =new String();
        s1="s";
        String s2 =new String();
        s2="s";
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()==s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
class Ob{
    int d;

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}