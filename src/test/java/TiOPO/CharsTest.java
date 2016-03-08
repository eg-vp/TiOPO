package TiOPO;

import junit.framework.TestCase;

import java.util.Arrays;

import static TiOPO.StringLibrary.chars;

/**
 * Created by Egor P on 07.03.2016.
 */
public class CharsTest extends TestCase {
    public void testChars1() throws Exception {
        char[] s = chars("");
        assertTrue("Error, char arrays not equals", Arrays.equals(s, new char[0]));
    }

    public void testChars2() throws Exception {
        char[] s = chars("abcd");
        assertTrue("Error, char arrays not equals", Arrays.equals(s, new char[]{'a', 'b', 'c', 'd'}));
    }

    public void testChars3() throws Exception {
        char[] s = chars("12 cd");
        assertTrue("Error, char arrays not equals", Arrays.equals(s, new char[]{'1', '2', ' ', 'c', 'd'}));
    }
}