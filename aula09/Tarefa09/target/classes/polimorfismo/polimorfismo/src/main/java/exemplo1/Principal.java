package exemplo1;

import com.sun.javafx.scene.input.InputEventUtils;

public class Principal {
    public static void main(String[] args) {
        int tipoMenu = 1;
        if(tipoMenu == 0){
            new Aplicacao(new WinFactory());
        }else{
            new Aplicacao(new LinuxFactory());
        }
    }
}
