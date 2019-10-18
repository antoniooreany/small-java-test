package main.java.com.coder;

public class Main {
    public static void main(String[] args) {

        String e = Coder.encode("e", 5);
        System.out.println(e);

        String e1 = Coder.encode("z", 1);
        System.out.println(e1);

        int rot = 1 + ('z' - 'a' + 1) * 22;
        System.out.println(rot);
        String e2 = Coder.encode("z", rot);
        System.out.println(e2);

        int rot_ = 2 + ('z' - 'a' + 1) * 23;
        System.out.println(rot_ + "  // char: overflow");
        String e2_ = Coder.encode("z", rot_); // char: overflow
        System.out.println(e2_ + "  // char: overflow");

        String e3 = Coder.encode("X", 7);
        System.out.println(e3);

        int rot1 = 7 + ('Z' - 'A' + 1) * 19;
        System.out.println(rot1);
        String e4 = Coder.encode("X", rot1);
        System.out.println(e4);

        int _rot1 = 7 + ('Z' - 'A' + 1) * 20;
        System.out.println(_rot1 + "    // char: overflow");
        String _e4 = Coder.encode("X", _rot1); // char: overflow
        System.out.println(_e4 + "    // char: overflow");


        System.out.println("/////////////////////////////////////////////");







    }
}
