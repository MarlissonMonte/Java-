public class ClienteEmail {
    private ServidorEmail servidor;
    private String usuario;
    // metodo construtor
    public ClienteEmail( ServidorEmail servidor, String usuario ) {
        this.servidor = servidor;
        this.usuario = usuario;
    }

    public Email getSeguintEmail() {
        return servidor.getSeguinteEmail( usuario );
    }

    public void imprimirSeguinteEmail() {
        Email email  = servidor.getSeguinteEmail( usuario );
        if (email == null) {
            System.out.println("Nenhum email novo...");
        } else {
            email.imprimir();
        }
    }

    public void enviarEmail( String para, String mensagem ) {
        Email email = new Email( usuario, para, mensagem );
        servidor.post( email );
    }
    public void todosEmail(){
        while (servidor.quantosEmails(this.usuario) != 0){
            imprimirSeguinteEmail();
        }
    }
}