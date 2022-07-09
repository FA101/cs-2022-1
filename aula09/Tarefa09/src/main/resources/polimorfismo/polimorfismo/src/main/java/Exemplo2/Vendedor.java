package Exemplo2;

public class Vendedor extends TipoDeEmpregado{

    protected Double quantiaAPagar(Empregado empregado) {
        return empregado.lerSalarioMensal() + empregado.lerComissao();
    }
}
