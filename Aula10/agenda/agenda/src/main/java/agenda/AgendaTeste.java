package agenda;

import java.util.List;

public class AgendaTeste {
    public static void main(String args[]) {
        Agenda app = new Agenda();
        Contato contato1 = new Contato("Adriana Oliveira", "antonio@ufg.br");
        Contato contato2 = new Contato("Antonio Marco", "antonio.marcos@ufg.br");
        Contato contato3 = new Contato("Jorley", "jorley@ufg.br");
        app.adicionaContato(contato1);
        app.adicionaContato(contato2);
        app.adicionaContato(contato3);
        /*
        Contato contatoConsultado = app.buscaContato("Antonio");
        if (contatoConsultado.getNome() != null) {
            System.out.println("Nome do contato consultado: " + contatoConsultado.getNome());
        }else {
            System.out.println("Contato não encontrado!");
        }
        //deverá imprimir 3
        System.out.println("A quantidade de contatos na lista é:" + app.getListaContatos().size());
        //app.removeContato("Jorley");
        app.removeContato(contato3);
        //deverá imprimir 2
        System.out.println("A quantidade de contatos na lista é:" + app.getListaContatos().size());

        //Pra ter certeza da remoção, consulte o contato pelo nome de "Jorley".
*/

        //Listando os contatos
        System.out.println("\n Modelo antigo:");
        app.listaNomesAntigo();
        System.out.println("\n Modelo Novo:");
        app.listaNomesNovo();
        System.out.println("\n Modelo Mais Novo:");
        app.listaNomesMaisNovo();
        System.out.println("\n Modelo Mais Novo Ainda:");
        app.listaNomesMaisNovoAinda();
    }
}
