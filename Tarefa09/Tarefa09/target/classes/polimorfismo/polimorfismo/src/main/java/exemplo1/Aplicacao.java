package exemplo1;

public class Aplicacao {
    public Aplicacao(GUIFactory factory){
        Menu menu = factory.createMenu();
        menu.paint();
    }
}
