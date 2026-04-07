import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQLite {

    public static void main(String[] args) {
        initConnection();
    }

    public static void initConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:sqlite_database_2022.db";
            Connection conn = DriverManager.getConnection(url);
            if (conn != null) {
                System.out.println("Connection established");
                conn.close();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        } catch (SQLException e) {
            System.out.println("Connection failed");
        }
    }
}
