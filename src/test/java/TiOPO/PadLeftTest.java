package TiOPO;

import junit.framework.TestCase;

import static TiOPO.StringLibrary.padLeft;

/**
 * Created by Egor P on 07.03.2016.
 */
public class PadLeftTest extends TestCase {
    public void testPadLeft1() throws Exception {
        String s = padLeft("", ' ', 0);
        assertTrue("Error, strings not equals", s.equals(""));
    }

    public void testPadLeft2() throws Exception {
        String s = padLeft("abc", 'd', 0);
        assertTrue("Error, strings not equals", s.equals("abc"));
    }

    public void testPadLeft3() throws Exception {
        String s = padLeft("abc", 'd', -1);
        assertTrue("Error, strings not equals", s.equals("abc"));
    }

    public void testPadLeft4() throws Exception {
        String s = padLeft("abc", 'd', 3);
        assertTrue("Error, strings not equals", s.equals("abc"));
    }

    public void testPadLeft5() throws Exception {
        String s = padLeft("abc", 'd', 8);
        assertTrue("Error, strings not equals", s.equals("dddddabc"));
    }

    public void testPadLeft6() throws Exception {
        String s = padLeft("abc", 'D', 9);
        assertTrue("Error, strings not equals", s.equals("DDDDDDabc"));
    }

}
