package Exemplo2;

public class TipoEmpregado {

    private String tipoEmpregado;

    private Double _salarioMensal;

    private Double _comissao;

    private Double _bonus;

    public String getTipo() {
        return tipoEmpregado;
    }

    public Double quantiaAPagar() {
        switch(getTipo()) {
            case "ENGENHEIRO":
                return _salarioMensal;
            case "VENDEDOR":
                return _salarioMensal + _comissao;
            case "GERENTE":
                return _salarioMensal + _bonus;
            default:
                throw new RuntimeException("tipo incorreto de empregado");
        }
    }
}
