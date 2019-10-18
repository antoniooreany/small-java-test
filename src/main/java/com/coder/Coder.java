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
            if (inChars[i] >= A_LOWER_CASE && inChars[i] <= Z_LOWER_CASE) {
                applyEncodeLogic(inChars, outChars, rot, i, A_LOWER_CASE, Z_LOWER_CASE);
            } else if (inChars[i] >= A_UPPER_CASE && inChars[i] <= Z_UPPER_CASE) {
                applyEncodeLogic(inChars, outChars, rot, i, A_UPPER_CASE, Z_UPPER_CASE);
            } else {
                outChars[i] = inChars[i];
            }
        }
        return new String(outChars);
    }

    private static void applyEncodeLogic(char[] inChars, char[] outChars, int rot, int index, char beginChar, char endChar) {
        outChars[index] = (char) (inChars[index] + rot);
        int outAbsolute = outChars[index] - beginChar;
        int divider = endChar - beginChar;
        int threshold = beginChar - outAbsolute / divider;
        outChars[index] = (char) (threshold + outAbsolute % divider);
    }


}
