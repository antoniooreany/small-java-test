package main.java.com.coder;

public class Main {
    public static void main(String[] args) {

        String e = Coder.encode("e", 5);
        System.out.println(e);

        String e1 = Coder.encode("z", 1);
        System.out.println(e1);

        String e3 = Coder.encode("X", 7);
        System.out.println(e3);

        System.out.println("/////////////////////////////////////////////");

        String e6 = Coder.decode("j", 5);
        System.out.println(e6);

        String e7 = Coder.decode("a", 1);
        System.out.println(e7);

        String e8 = Coder.decode("E", 7);
        System.out.println(e8);

        System.out.println("/////////////////////////////////////////////");

        String e5 = Coder.encode("HELLO", 5);
        System.out.println(e5);

        String e9 = Coder.decode("BTWQI", 5);
        System.out.println(e9);

        System.out.println("/////////////////////////////////////////////");

        String e10 = Coder.encode("innoWake rules", 9);
        System.out.println(e10);

        String e11 = Coder.decode("IUHUR", 6);
        System.out.println(e11);


    }
}
