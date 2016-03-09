package TiOPO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import TiOPO.Interface.ConnectInterface;

/**
 * Created by Egor P on 09.03.2016.
 */
public class main {
    public static void testWorkFunctions(String[] refStr)
    {
        for (int i = 0; i < refStr.length;i++)
        {
            System.out.println("Reference string: "+refStr[i]);
            System.out.println("\"Chars\" function: " + Arrays.toString(StringLibrary.chars(refStr[i])));
            System.out.println("\"Chop\" function: " +  Arrays.toString(StringLibrary.chop(refStr[i], 2)));
            System.out.println("\"Join\" function: " + StringLibrary.join("abc", "123", refStr[i]));
            System.out.println("\"PadLeft\" function: " + StringLibrary.padLeft(refStr[i], '1', 15));
            System.out.println("\"PadRight\" function: " + StringLibrary.padRight(refStr[i], '2', 15));
            System.out.println("\"Reverse\" function: " + StringLibrary.reverse(refStr[i]));
            System.out.println("\"Substring\" function: " + StringLibrary.substring(refStr[i], 1, 4));
            System.out.println("\"SwapCase\" function: " + StringLibrary.swapCase(refStr[i]));
        }
    }

    public static String[] getStringList(ConnectInterface conn)
    {
        Statement stmt = conn.createState();
        List<String> lstStr = new ArrayList<String>();
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM \"DifferentStrings\"");
            while (rs.next())
            {
                lstStr.add(rs.getString("string"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lstStr.toArray(new String[]{});
    }

    public static void main(String[] args) {
        ConnectInterface conn = new Connect();
        conn.driverRegistration();
        conn.getConnection();
        String[] strs = getStringList(conn);
        testWorkFunctions(strs);
        conn.closeConnection();
    }
}
