package excecao;

public class MinhaPrimeiraExcecaoTeste {

    public void metodoQueDisparaMinhaExcecao(int x, int y) throws MinhaPrimeiraExcecao
    {
        if(x < y)
        {
            throw new MinhaPrimeiraExcecao("O valor de x não pode ser menor que o de y.");
        }
    }

    public static void main(String args[])
    {
        MinhaPrimeiraExcecaoTeste app = new MinhaPrimeiraExcecaoTeste();
        try{
            app.metodoQueDisparaMinhaExcecao(2,5);
        }catch (MinhaPrimeiraExcecao mpe)
        {
            System.out.println(mpe.getMessage());
        }
    }
}
