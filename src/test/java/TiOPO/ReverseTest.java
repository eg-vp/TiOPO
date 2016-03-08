package TiOPO;

import junit.framework.TestCase;

import static TiOPO.StringLibrary.reverse;

/**
 * Created by Egor P on 07.03.2016.
 */
public class ReverseTest extends TestCase {
    public void testReverse1() throws Exception {
        String s = reverse("");
        assertTrue("Error, strings not equals",s.equals(""));
    }

    public void testReverse2() throws Exception {
        String s = reverse("whitespace");
        assertTrue("Error, strings not equals",s.equals("ecapsetihw"));
    }

    public void testReverse3() throws Exception {
        String s = reverse("world");
        assertTrue("Error, strings not equals",s.equals("dlrow"));
    }
}