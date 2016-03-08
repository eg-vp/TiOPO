package TiOPO;

import junit.framework.TestCase;

import java.util.Arrays;

import static TiOPO.StringLibrary.chop;

/**
 * Created by Egor P on 07.03.2016.
 */
public class ChopTest extends TestCase {
    public void testChop1() throws Exception {
        String[] s = chop("", 0);
        assertTrue("Error, string arrays not equals", Arrays.equals(s, new String[0]));
    }

    public void testChop2() throws Exception {
        String[] s = chop("abcdefg", 7);
        assertTrue("Error, string arrays not equals", Arrays.equals(s, new String[]{"abcdefg"}));
    }

    public void testChop3() throws Exception {
        String[] s = chop("hello world", 3);
        assertTrue("Error, string arrays not equals", Arrays.equals(s, new String[]{"hel", "lo ", "wor", "ld"}));
    }

    public void testChop4() throws Exception {
        String[] s = chop("hello world", -5);
        assertTrue("Error, string arrays not equals", Arrays.equals(s, new String[]{"hello world"}));
    }

    public void testChop5() throws Exception {
        String[] s = chop("hello ", 1);
        assertTrue("Error, string arrays not equals", Arrays.equals(s, new String[]{"h", "e", "l", "l", "o", " "}));
    }

    public void testChop6() throws Exception {
        String[] s = chop("hello ", 0);
        assertTrue("Error, string arrays not equals", Arrays.equals(s, new String[]{"hello "}));
    }
}