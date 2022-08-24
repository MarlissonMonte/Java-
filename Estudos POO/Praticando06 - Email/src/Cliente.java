public class Cliente {
    public static void main(String[] args) {
        ServidorEmail servidor;

        ClienteEmail cliente1;
        ClienteEmail cliente2;
        ClienteEmail cliente3;
        ClienteEmail cliente4;
        ClienteEmail cliente5;
    
        servidor = new ServidorEmail();
    
        cliente1 = new ClienteEmail( servidor, "cliente1" );
        cliente2 = new ClienteEmail( servidor, "cliente2" );
        cliente3 = new ClienteEmail( servidor, "cliente3" );
        cliente4 = new ClienteEmail( servidor, "cliente4" );
        cliente5 = new ClienteEmail( servidor, "cliente5" );

        // --------------------- Mensagens do cliente1 -------------------- //
        cliente1.enviarEmail("cliente5", "Olá, boa tarde!");
        cliente1.enviarEmail("cliente2", "Olá, boa tarde!");
        cliente1.enviarEmail("cliente3", "Olá, boa tarde!");
        cliente1.enviarEmail("cliente4", "Olá, boa tarde!");
        cliente1.enviarEmail("cliente5", "Olá, boa tarde!");

        // --------------------- Mensagens do cliente2 -------------------- //
        cliente2.enviarEmail("cliente5", "Olá, boa tarde!");
        cliente2.enviarEmail("cliente4", "Olá, boa tarde!");
        cliente2.enviarEmail("cliente3", "Olá, boa tarde!");

        // --------------------- Mensagens do cliente3 -------------------- //
        cliente3.enviarEmail("cliente5", "Olá, boa tarde!");
        cliente3.enviarEmail("cliente4", "Olá, boa tarde!");
        cliente3.enviarEmail("cliente5", "Olá, boa tarde!");
        cliente3.enviarEmail("cliente1", "Olá, boa tarde!");
        cliente3.enviarEmail("cliente2", "Olá, boa tarde!");
        cliente3.enviarEmail("cliente1", "Olá, boa tarde!");
        cliente3.enviarEmail("cliente4", "Olá, boa tarde!");
        cliente3.enviarEmail("cliente4", "Olá, boa tarde!");

        // --------------------- Mensagens do cliente4 -------------------- //
        cliente4.enviarEmail("cliente1", "Olá, boa tarde!");
        cliente4.enviarEmail("cliente2", "Olá, boa tarde!");

        // --------------------- Mensagens do cliente5 -------------------- //
        cliente5.enviarEmail("cliente2", "Olá, boa tarde!");

        System.out.println(servidor.quantosEmails("cliente3"));
        cliente3.todosEmail();
            
    

/*  Q1) enviar msg as quantidade de msg seguinte; 
    Cliente1 >> 5
    Cliente2 >> 3
    Cliente3 >> 8
    Cliente4 >> 2
    Cliente5 >> 1
*/ 


int qtos;

        qtos = servidor.quantosEmails("cliente1");
        for (int i = 0; i < qtos; i++) cliente1.imprimirSeguinteEmail();

        qtos = servidor.quantosEmails("cliente2");
        for (int i = 0; i < qtos; i++) cliente2.imprimirSeguinteEmail();

        qtos = servidor.quantosEmails("cliente3");
        for (int i = 0; i < qtos; i++) cliente3.imprimirSeguinteEmail();

        qtos = servidor.quantosEmails("cliente4");
        for (int i = 0; i < qtos; i++) cliente4.imprimirSeguinteEmail();

        qtos = servidor.quantosEmails("cliente5");
        for (int i = 0; i < qtos; i++) cliente5.imprimirSeguinteEmail();
    }
}
//Q2) imprimir n email.