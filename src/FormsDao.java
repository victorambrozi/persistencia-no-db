import java.sql.Connection;

public class FormsDao extends ConexaoDao {

    
    public void incluir(Contato contact) throws Exception {
        String sql = "INSERT INTO contatos VALUES(?, ?, ?)";
        open();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, contact.getId());
        statement.setString(2, contact.getNomeContato());
        statement.setString(3, contact.getEmailContato());
        statement.execute();
        statement.close();
        close();
    }
    public void selecionarTodos() {}
    public void selecionarUsuario() {}
    public void deletar() {}
    public void atualizar() {}
}
