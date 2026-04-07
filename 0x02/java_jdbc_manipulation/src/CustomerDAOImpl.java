import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public Connection connect(String connectionUrl) {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(connectionUrl);
        } catch (Exception e) {
            System.out.println("Connection error");
        }
        return conn;
    }

    @Override
    public void createTable(String connectionUrl) {
        String sql = "CREATE TABLE IF NOT EXISTS Customer ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "name TEXT,"
                + "age INTEGER,"
                + "cpf TEXT,"
                + "rg TEXT"
                + ");";

        try (Connection conn = connect(connectionUrl);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Create table error");
        }
    }

    @Override
    public void insert(String connectionUrl, Customer customer) {
        String sql = "INSERT INTO Customer (name, age, cpf, rg) VALUES ('"
                + customer.getName() + "',"
                + customer.getAge() + ",'"
                + customer.getCpf() + "','"
                + customer.getRg() + "');";

        try (Connection conn = connect(connectionUrl);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Insert error");
        }
    }

    @Override
    public void selectAll(String connectionUrl) {
        String sql = "SELECT * FROM Customer;";

        try (Connection conn = connect(connectionUrl);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + ","
                                + rs.getString("name") + ","
                                + rs.getInt("age") + ","
                                + rs.getString("cpf") + ","
                                + rs.getString("rg")
                );
            }

        } catch (SQLException e) {
            System.out.println("Select error");
        }
    }

    @Override
    public void update(String connectionUrl, int id, String name, Integer age) {
        String sql = "UPDATE Customer SET name='" + name + "', age=" + age + " WHERE id=" + id + ";";

        try (Connection conn = connect(connectionUrl);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Update error");
        }
    }

    @Override
    public void delete(String connectionUrl, int id) {
        String sql = "DELETE FROM Customer WHERE id=" + id + ";";

        try (Connection conn = connect(connectionUrl);
             Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Delete error");
        }
    }
}
