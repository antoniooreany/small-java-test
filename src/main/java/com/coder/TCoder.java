package main.java.com.coder;

public class TCoder {

    /**
     * A method for Coder methods testing.
     * @param args is an arguments from the outside. Does not used here.
     */
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

        System.out.println("/////////////////////////////////////////////");

//        int shiftAmount = 1 + 26 * 3;
//        shiftAmount = 98;
//        System.out.println(shiftAmount);
//        String e12 = Coder.decode("a", shiftAmount); // 'a' = 97, max = 97
//        System.out.println(e12);




/////////////////////////////////////////////
//        Output:
/////////////////////////////////////////////
//        j
//        a
//        E
/////////////////////////////////////////////
//        e
//        z
//        X
/////////////////////////////////////////////
//        MJQQT
//        WORLD
/////////////////////////////////////////////
//        rwwxFjtn adunb
//        COBOL
/////////////////////////////////////////////
    }
}
