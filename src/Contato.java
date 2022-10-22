public class Contato {
    private String nomeContato;
    private String emailContato;
    private int id;

    public Contato() {}
    public Contato(Integer id, String nome, String email) {
        super();
        this.nomeContato = nome;  
        this.emailContato = email;
        this.id = id;
    }
    public String getNomeContato() {
        return nomeContato;
    }
    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmailContato() {
        return emailContato;
    }
    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }
}
