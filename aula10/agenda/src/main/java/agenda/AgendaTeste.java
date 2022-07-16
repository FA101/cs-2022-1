package agenda;

public class AgendaTeste {
    public static void main(String args[]) {
        Agenda app = new Agenda();
        Contato contato1 = new Contato("Joao Maria", "jo.ma@ufg.br");
        Contato contato2 = new Contato("Maria Joao", "ma.jo@ufg.br");
        Contato contato3 = new Contato("Jose Maria", "j.maria@ufg.br");
        Contato contato4 = new Contato("Maria Jose", "m.jose@ufg.br");
        app.adicionaContato(contato1);
        app.adicionaContato(contato2);
        app.adicionaContato(contato3);
        app.adicionaContato(contato4);
       
        System.out.println("\n Modelo antigo:");
        app.listaNomesAntigo();
        System.out.println("\n Modelo Novo:");
        app.listaNomesNovo();
        System.out.println("\n Modelo Mais Novo:");
        app.listaNomesMaisNovo();
        System.out.println("\n Modelo Mais Novo Ainda:");
        app.listaNomesMaisNovoAinda();

        /*
        System.out.println("\n-----------------------------------------\n");
        app.removeContato(contato4);
        System.out.println("\n Modelo Mais Novo Ainda:");
        app.listaNomesMaisNovoAinda();
        */
    }
}
