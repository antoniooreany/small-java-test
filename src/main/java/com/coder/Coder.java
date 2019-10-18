package main.java.com.coder;

public class Coder {

    private static final char A_LOWER_CASE = 'a';
    private static final char Z_LOWER_CASE = 'z';
    private static final char A_UPPER_CASE = 'A';
    private static final char Z_UPPER_CASE = 'Z';

    public static String encode(String in, int rot) {
        char[] inChars = in.toCharArray();
        char[] outChars = new char[inChars.length];
        for (int i = 0; i < inChars.length; i++) {
            if ((inChars[i] >= A_LOWER_CASE && inChars[i] <= Z_LOWER_CASE)) {
                decode(rot, inChars, outChars, i, A_LOWER_CASE, Z_LOWER_CASE);
            } else {
                if (inChars[i] >= A_UPPER_CASE && inChars[i] <= Z_UPPER_CASE) {
                    decode(rot, inChars, outChars, i, A_UPPER_CASE, Z_UPPER_CASE);
                } else {
                    outChars[i] = inChars[i];
                }
            }
        }
        return new String(outChars);
    }

    private static void decode(int rot, char[] inChars, char[] outChars, int i, char a, char z) {
        outChars[i] = (char) (inChars[i] + rot);
        int absoluteOut = outChars[i] - a;
        int divider = z - a;
        int threshold = a - absoluteOut / divider;
        outChars[i] = (char) (threshold + absoluteOut % divider);
    }
}
