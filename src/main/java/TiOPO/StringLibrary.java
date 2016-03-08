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

    public static String swapCase(String str)
    {
        char[] chars = str.toCharArray();
        for(int i = 0;i<chars.length;i++) {
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

}

