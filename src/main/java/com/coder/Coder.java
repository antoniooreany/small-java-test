package main.java.com.coder;

class Coder {

    /**
     * Boundaries of the intervals.
     */
    private static final char A_LOWER_CASE = 'a';
    private static final char Z_LOWER_CASE = 'z';
    private static final char A_UPPER_CASE = 'A';
    private static final char Z_UPPER_CASE = 'Z';

    /**
     * Encodes an inputString by shifting backwards all the values of the char(inputString).
     *
     * @param inputString is a string to encode.
     * @param shiftAmount is a value to shift characters forwards.
     * @return an encoded string.
     */
    static String encode(String inputString, int shiftAmount) {
        char[] inputChars = inputString.toCharArray();
        char[] outputChars = new char[inputChars.length];
        for (int i = 0; i < inputChars.length; i++) {
            if (inputChars[i] >= A_LOWER_CASE && inputChars[i] <= Z_LOWER_CASE) {
                outputChars[i] = applyCodeLogic(inputChars[i], shiftAmount, A_LOWER_CASE, Z_LOWER_CASE);
            } else if (inputChars[i] >= A_UPPER_CASE && inputChars[i] <= Z_UPPER_CASE) {
                outputChars[i] = applyCodeLogic(inputChars[i], shiftAmount, A_UPPER_CASE, Z_UPPER_CASE);
            } else {
                outputChars[i] = inputChars[i];
            }
        }
        return new String(outputChars);
    }

    /**
     * Decodes an inputString by shifting backwards all the values of the char(inputString).
     * ATTENTION: Decodes incorrectly with (char(inputString) - shiftAmount) < 0.
     *
     * @param inputString is a string to decode.
     * @param shiftAmount is a value to shift characters backwards.
     * @return a decoded string.
     */
    static String decode(String inputString, int shiftAmount) {
        return encode(inputString, -shiftAmount);
    }

    /**
     * @param c           is a character to proceed.
     * @param shiftAmount is a value to shift characters backwards.
     * @param beginChar   a lowest interval boundary.
     * @param endChar     a highest interval boundary
     * @return a coded character.
     */
    private static char applyCodeLogic(char c, int shiftAmount, char beginChar, char endChar) {
        char rawChar = (char) (c + shiftAmount);
        return normalizeForUSASCII(rawChar, beginChar, endChar);
    }

    /**
     * @param rawChar   a char to be processed
     * @param beginChar begin of the interval
     * @param endChar   begin of the interval
     * @return normalized for the US ASCII character
     */
    private static char normalizeForUSASCII(char rawChar, char beginChar, char endChar) {
        int relativeChar = rawChar - beginChar;
        int intervalSize = endChar - beginChar;
        int normalizedRemainder = relativeChar % (intervalSize + 1);
        int normalizedChar = normalizedRemainder + beginChar;
        if (normalizedRemainder < 0) {
            return (char) (normalizedChar + intervalSize + 1);  //TODO: Might be generalized for accepting wider range of parameter values
        } else {                                                //TODO: to avoid following limitation in decode(...):
            return (char) normalizedChar;                       //TODO: ATTENTION: Decodes incorrectly with (char(inputString) - shiftAmount) < 0.
        }
    }
}
