package main.java.com.coder;

class Coder {

    private static final char A_LOWER_CASE = 'a';
    private static final char Z_LOWER_CASE = 'z';
    private static final char A_UPPER_CASE = 'A';
    private static final char Z_UPPER_CASE = 'Z';

    static String encode(String in, int rot) {
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
        int intervalSize = endChar - beginChar;
        int threshold = beginChar - outAbsolute / intervalSize;
        outChars[index] = (char) (threshold + outAbsolute % intervalSize);
    }

    static String decode(String in, int rot) {
        char[] inChars = in.toCharArray();
        char[] outChars = new char[inChars.length];
        for (int i = 0; i < inChars.length; i++) {
            if (inChars[i] >= A_LOWER_CASE && inChars[i] <= Z_LOWER_CASE) {
                applyDecodeLogic(inChars, outChars, rot, i, A_LOWER_CASE, Z_LOWER_CASE);
            } else if (inChars[i] >= A_UPPER_CASE && inChars[i] <= Z_UPPER_CASE) {
                applyDecodeLogic(inChars, outChars, rot, i, A_UPPER_CASE, Z_UPPER_CASE);
            } else {
                outChars[i] = inChars[i];
            }
        }
        return new String(outChars);
    }

    private static void applyDecodeLogic(char[] inChars, char[] outChars, int rot, int index, char beginChar, char endChar) {
        char[] outCharsRow = new char[inChars.length];
        outCharsRow[index] = (char) (inChars[index] - rot);
        outChars[index] = normalizeForUSASCII(outCharsRow[index], beginChar, endChar);
    }

    /**
     * @param inChar    a char to be processed
     * @param beginChar begin of the interval
     * @param endChar   begin of the interval
     * @return normalized for the US ASCII character
     */
    private static char normalizeForUSASCII(char inChar, char beginChar, char endChar) {

        int relativeInChar = inChar - beginChar;
        int intervalSize = endChar - beginChar;

        if (relativeInChar % (intervalSize + 1) < 0) {
            return (char) ((relativeInChar % (intervalSize + 1)) + beginChar + intervalSize + 1);
        } else {
            return (char) ((relativeInChar % (intervalSize + 1)) + beginChar);
        }
    }
}
