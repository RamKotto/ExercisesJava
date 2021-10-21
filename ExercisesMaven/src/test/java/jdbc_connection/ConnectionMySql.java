package jdbc_connection;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySql {

    @Test
    public void mySqlConnect() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/union_reporting?user=root");
        System.out.println(conn.getCatalog());
    }
}
