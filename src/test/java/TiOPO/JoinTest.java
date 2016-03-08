package TiOPO;

import junit.framework.TestCase;
import static TiOPO.StringLibrary.join;
/**
 * Created by Egor P on 08.03.2016.
 */
public class JoinTest extends TestCase {
    public void testJoin1() throws Exception {
        String s = join("", "", "");
        assertTrue("Error, strings not equals",s.equals(""));
    }

    public void testJoin2() throws Exception {
        String s = join(" ", "", "");
        assertTrue("Error, strings not equals",s.equals(" "));
    }

    public void testJoin3() throws Exception {
        String s = join(" ", "abc", "def");
        assertTrue("Error, strings not equals",s.equals("abc def"));
    }

    public void testJoin4() throws Exception {
        String s = join("aaa", "bbb", "ddd");
        assertTrue("Error, strings not equals",s.equals("bbbaaaddd"));
    }
}