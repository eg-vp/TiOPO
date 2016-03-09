package TiOPO.Interface;

import java.sql.Statement;

/**
 * Created by Egor P on 09.03.2016.
 */
public interface ConnectInterface {
    void driverRegistration();
    void getConnection();
    void closeConnection();
    Statement createState();
}
