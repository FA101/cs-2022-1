package heranca_polimorfismo;

import java.util.ArrayList;

public class PessoaTeste {

    public static void main(String[] args) {
        PessoaConcreta p = new PessoaConcreta();

        p.setNome("Jorley");

        p.setConjuge(new PessoaConcreta("Sabrina"));

        p.setFilhos(new ArrayList<PessoaConcreta>());

        p.getFilhos().add(new PessoaConcreta("Francisco"));
        p.getFilhos().add(new PessoaConcreta("Sarah"));

        System.out.println("O nome da pessoa é: " + p.getNome());
        System.out.println("O nome do conjuge é: "  + p.getConjuge().getNome());

        System.out.println("Filhos:\n");
        for(PessoaConcreta p1 : p.getFilhos())
        {
            System.out.println(p1.getNome());
        }

        System.out.println(p.falar());
        System.out.println(p.cantar());

        //definindo outra instancia de pessoa
        PessoaConcreta1 p2 = new PessoaConcreta1();
        System.out.println(p2.falar());
        System.out.println(p2.cantar());

    }

}
