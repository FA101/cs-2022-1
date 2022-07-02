package exemplo1;

public class WinFactory implements GUIFactory{

    public Menu createMenu() {
        return new WinMenu();
    }
}
