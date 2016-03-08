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
}

