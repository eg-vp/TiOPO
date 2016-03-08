package TiOPO;

import junit.framework.TestCase;

import static TiOPO.StringLibrary.padRight;

/**
 * Created by Egor P on 07.03.2016.
 */
public class PadRightTest extends TestCase {
    public void testPadRight1() throws Exception {
        String s = padRight("", ' ', 0);
        assertTrue("Error, strings not equals", s.equals(""));
    }

    public void testPadRight2() throws Exception {
        String s = padRight("abc", 'd', 0);
        assertTrue("Error, strings not equals", s.equals("abc"));
    }

    public void testPadRight3() throws Exception {
        String s = padRight("abc", 'a', -1);
        assertTrue("Error, strings not equals", s.equals("abc"));
    }

    public void testPadRight4() throws Exception {
        String s = padRight("abc", 'd', 3);
        assertTrue("Error, strings not equals", s.equals("abc"));
    }

    public void testPadRight5() throws Exception {
        String s = padRight("abc", 'd', 7);
        assertTrue("Error, strings not equals", s.equals("abcdddd"));
    }

    public void testPadRight6() throws Exception {
        String s = padRight("abc", 'D', 8);
        assertTrue("Error, strings not equals", s.equals("abcDDDDD"));
    }
}