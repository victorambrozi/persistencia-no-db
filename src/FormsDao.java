import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class FormsDao extends ConexaoDao {

    public void incluir(Contato contact) throws Exception {
        String sql = "INSERT INTO contatos VALUES(?, ?, ?)";

        try {
            open();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, contact.getId());
            statement.setString(2, contact.getNomeContato());
            statement.setString(3, contact.getEmailContato());
            statement.execute();
            statement.close();
            close();
        } catch (Exception error) {
            System.out.println("Error: FormsD" + error);
        }

    }

    public List<Contato> selecionarTodos() throws Exception {
        List<Contato> contatoList = new ArrayList<>();
        String sql = "SELECT * FROM contatos";

        try {
            open();
            statement = connection.prepareStatement(sql);
            result = statement.executeQuery();

            while(result.next()) {
                Contato contato = new Contato();

                contato.setId(result.getInt(1));
                contato.setNomeContato(result.getString(2));
                contato.setEmailContato(result.getString(3));

                contatoList.add(contato);
            }


            statement.close();
            close();
        } catch(Exception error) {
            System.out.println("Error: FormsD" + error);
        }

        return contatoList;

    }

    public void selecionarUsuario() {
    }

    public void deletar() {
    }

    public void atualizar() {
    }
}
