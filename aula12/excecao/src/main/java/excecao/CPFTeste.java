package excecao;

public class CPFTeste {
    public static void main(String[] args) {

        CPF cpf = new CPF();
        String nCpf= "190";
        try{
            System.out.println(cpf.validaCPF(nCpf));
        }catch (CpfInvalidoException cpie)
        {
            System.out.println(cpie.getMessage());
            cpie.printStackTrace();
        }
    }
}
