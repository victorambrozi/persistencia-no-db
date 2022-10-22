import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoDao {
  Connection connection;
  ResultSet result;
  PreparedStatement statement;

  public void open() throws Exception {
    String url = "jdbc:mysql://localhost:3306/cadastros";
    String user = "root";
    String password = "root";
    String driverName = "com.mysql.cj.jdbc.Driver";

    try {
      Class.forName((driverName)); // inicia o driver .jar
      connection = DriverManager.getConnection(url, user, password); // manda as informações pra conexão do bando de
                                                                     // dados
      System.out.println("Sucesso! Conexão estabelecida...");
    } catch (SQLException | ClassNotFoundException e) {
      System.out.println(e);
    }

  }

  public void close() throws Exception {
    try {
      connection.close();
      System.out.println("Sucesso! Conexão encerrada...");
      
    } catch (SQLException | ClassCastException e) {
      System.out.println("Error: " + e);
    }

  }
}
