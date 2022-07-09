package Exemplo2;

public class Engenheiro extends TipoDeEmpregado{
    public Double quantiaAPagar(Empregado empregado){
        return empregado.lerSalarioMensal();
    }
}
