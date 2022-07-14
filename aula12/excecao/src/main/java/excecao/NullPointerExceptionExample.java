package excecao;

import heranca_polimorfismo.PessoaConcreta;

//@Getter
public class NullPointerExceptionExample {

    public static void main(String[] args) {
        PessoaConcreta pc = new PessoaConcreta();
        pc.setConjuge(new PessoaConcreta());
        if(pc.getConjuge() != null) {
            pc.getConjuge().setNome("Tatiana");
            System.out.println(pc.getConjuge().getNome());
        }
    }
}
