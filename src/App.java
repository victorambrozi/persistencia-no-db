public class App {

    public static void main(String[] args) throws Exception {
        FormsDao formDB = new FormsDao();
        // Contato joaoPaulo = new Contato(1, "João Paulo", "joaopaulo@formulario.com");
        Contato duda = new Contato(2, "Eduarda", "duda@formulario.com");
        // formDB.incluir(duda);
        System.out.println(formDB.selecionarTodos());

    }
}
