package excecao;

import javax.swing.*;
import java.io.*;

public class ExemploExcecao3 {
    void saveNetDevices() {
        try {
            Object mNetDevices = new Object();
            FileOutputStream fos = new
                    FileOutputStream("NetDevices.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(mNetDevices);
            oos.close();
            fos.close();
        } catch (NullPointerException nexc) {
            JOptionPane.showMessageDialog(null, "NetDevices list is null - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
        } catch (InvalidClassException nexc) {
            JOptionPane.showMessageDialog(null, "NetDevices list is invalid - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
        } catch (NotSerializableException nexc) {
            JOptionPane.showMessageDialog(null, "NetDevices list is not serializable - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException nexc) {
            JOptionPane.showMessageDialog(null, "IO Exception saving NetDevices list - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /*
    Ordem das exceções - Exemplo errado
    try {
        comando(s);
    } catch (Exception e) {
        comando(s);
    } catch (FileNotFoundException f) {
        comando(s);
    }
     */

    /*
    Ordem das exceções - Exemplo correto
    try {
        comando(s);
    } catch (FileNotFoundException f) {
        comando(s);
    } catch (Exception e) {
        comando(s);
    }
     */
}
