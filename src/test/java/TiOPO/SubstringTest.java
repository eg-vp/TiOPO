package TiOPO;

import junit.framework.TestCase;

import static TiOPO.StringLibrary.substring;

/**
 * Created by Egor P on 07.03.2016.
 */
public class SubstringTest extends TestCase {
    public void testSubstring1() throws Exception {
        String s = substring("", 0, 0);
        assertTrue("Error, strings not equals", s.equals(""));
    }

    public void testSubstring2() throws Exception {
        String s = substring("abcdefg", 0, 7);
        assertTrue("Error, strings not equals", s.equals("abcdefg"));
    }

    public void testSubstring3() throws Exception {
        String s;
        try {
            s = substring("abcdefg", -1, 7);
        }
        catch (Exception ex)
        {
            s = "-1";
        }
        assertTrue("Error, strings not equals", s.equals("-1"));
    }

    public void testSubstring4() throws Exception {
        String s;
        try {
            s = substring("abcdefg", 1, -7);
        }
        catch (Exception ex)
        {
            s = "-1";
        }
        assertTrue("Error, strings not equals", s.equals("-1"));
    }

    public void testSubstring5() throws Exception {
        String s;
        try {
            s = substring("abcdefg", 1, 9);
        }
        catch (Exception ex)
        {
            s = "-1";
        }
        assertTrue("Error, strings not equals", s.equals("-1"));
    }

    public void testSubstring6() throws Exception {
        String s;
        try {
            s = substring("abcdefg", 0, 9);
        }
        catch (Exception ex)
        {
            s = "-1";
        }
        assertTrue("Error, strings not equals", s.equals("-1"));
    }

    public void testSubstring7() throws Exception {
        String s = substring("asdfg nhgt", 3, 6);
        assertTrue("Error, strings not equals", s.equals("fg nhg"));
    }
}