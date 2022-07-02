package Exemplo2;

public class Teste {
    public static void main(String[] args) {
        TipoDeEmpregado tipo = new Vendedor();
        Empregado empregado = new Empregado();
        empregado.setTipoEmpregado(tipo);
        empregado.setSalarioMensal(1000.00);
        empregado.setBonus(500.00);
        empregado.setComissao(200.00);

        System.out.println(empregado.quantiaPagar());
    }
}
