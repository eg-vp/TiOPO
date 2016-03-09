package TiOPO;

import junit.framework.TestCase;

import static TiOPO.StringLibrary.swapCase;

/**
 * Created by Egor P on 07.03.2016.
 */
public class SwapCaseTest extends TestCase {
    public void testSwapCase1() throws Exception {
        String s = swapCase("");
        assertTrue("Error, strings not equals", s.equals(""));
    }

    public void testSwapCase2() throws Exception {
        String s = swapCase("heLLO");
        assertTrue("Error, strings not equals", s.equals("HEllo"));
    }

    public void testSwapCase3() throws Exception {
        String s = swapCase("1thaNKS5");
        assertTrue("Error, strings not equals", s.equals("1THAnks5"));
    }

    public void testSwapCase4() throws Exception {
        String s = swapCase("12345");
        assertTrue("Error, strings not equals", s.equals("12345"));
    }

    public void testSwapCase5() throws Exception {
        String s = swapCase("ABCDE");
        assertTrue("Error, strings not equals", s.equals("abcde"));
    }

    public void testSwapCase6() throws Exception {
        String s = swapCase("zxcvb");
        assertTrue("Error, strings not equals", s.equals("ZXCVB"));
    }

    public void testSwapCase7() throws Exception {
        String s = swapCase("abc!!DE11");
        assertTrue("Error, strings not equals", s.equals("ABC!!de11"));
    }

    public void testSwapCase8() throws Exception {
        String s = swapCase("abc!,D,11");
        assertTrue("Error, strings not equals", s.equals("ABC!,d,11"));
    }
}