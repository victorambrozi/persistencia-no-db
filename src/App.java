import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws Exception {
        ConexaoDB con = new ConexaoDB();

        con.open();
        con.close();
    }
}
