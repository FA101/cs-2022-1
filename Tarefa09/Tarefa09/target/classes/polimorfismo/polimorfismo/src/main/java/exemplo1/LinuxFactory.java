package exemplo1;

public class LinuxFactory implements GUIFactory{

    public Menu createMenu() {
        return new LinuxMenu();
    }
}
