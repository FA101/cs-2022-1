package Exemplo2;

public class Gerente extends TipoDeEmpregado{
    @Override
    protected Double quantiaAPagar(Empregado empregado) {
        return empregado.lerSalarioMensal() + empregado.lerBonus();
    }
}
