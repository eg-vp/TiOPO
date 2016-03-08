package TiOPO;

/**
 * Created by Egor P on 07.03.2016.
 */
public class StringLibrary {
    public static String padRight(String str, char c, int length) {
        int addLength = length - str.length();
        if (addLength <= 0)
            return str;
        for (int i = 0; i < addLength; i++)
            str += c;
        return str;
    }

    public static String padLeft(String str, char c, int length) {
        int addLength = length - str.length();
        if (addLength <= 0)
            return str;
        String add = "";
        for (int i = 0; i < addLength; i++)
            add += c;
        return add + str;
    }

    public static String swapCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isDigit(chars[i])) {
                if (Character.isUpperCase(chars[i])) {
                    chars[i] = Character.toLowerCase(chars[i]);
                } else {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            }
        }
        return new String(chars);
    }

    public static String substring(String str, int sPos, int len) throws StringIndexOutOfBoundsException {
        String resultStr = "";
        if (sPos < 0 || len < 0 || len > str.length() || sPos + len > str.length())
            throw new StringIndexOutOfBoundsException();
        for (int i = sPos; i < sPos + len; i++) {
            resultStr += str.charAt(i);
        }
        return resultStr;
    }

    public static String[] chop(String str, int length) {
        int strLength = str.length();
        if (strLength == 0)
            return new String[0];
        if (length == strLength || length <= 0) {
            return new String[]{str};
        }
        String[] strings = new String[(strLength + (length - 1)) / length];
        int j = 0;
        int i = 0;
        while (i + length <= strLength) {
            strings[j] = substring(str, i, length);
            i += length;
            j++;
        }
        if (strLength - i != 0 && strLength - i < length)
            strings[j] = substring(str, i, strLength - i);
        return strings;
    }
}

