package excecao;

import javax.xml.xpath.XPathFactoryConfigurationException;

public class ExemploGenericoExcecao {
    public void explicaExcecao(){
        try {
            // código que inclui comandos/invocações de métodos
            // que podem gerar uma situação de exceção.
            int a = 10;
            int x = 0;
            if(x > 0){
                int c = a / x;
            }else {
                int b = Integer.parseInt(null); //throws Exception as     //the input string is of illegal format for parsing as it is null.
            }
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            // bloco de tratamento associado à condição de
            // exceção XException ou a qualquer uma de suas
            // subclasses, identificada aqui pelo objeto
            // com referência ae
        } catch (NumberFormatException nfe) {
            // bloco de tratamento para a situação de exceção
            // YException ou a qualquer uma de suas subclasses
            System.out.println(nfe.getMessage());
            nfe.printStackTrace();
        } finally {
            System.out.println("Estou no bloco finally");
            // bloco de código que sempre será executado após
            // o bloco try, independentemente de sua conclusão
            // ter ocorrido normalmente ou ter sido interrompida
        }
    }

    public static void main(String args[])
    {
        new ExemploGenericoExcecao().explicaExcecao();
    }
}
