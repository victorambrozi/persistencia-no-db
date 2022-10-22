import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws Exception {
        FormsDao formDB = new FormsDao();
        Contato joaoPaulo = new Contato(1, "João Paulo", "joaopaulo@formulario.com");
        Contato duda = new Contato(2, "Eduarda", "duda@formulario.com");
        formDB.incluir(duda);

    }
}
