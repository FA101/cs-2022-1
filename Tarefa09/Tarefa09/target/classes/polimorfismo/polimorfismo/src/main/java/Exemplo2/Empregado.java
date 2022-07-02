package Exemplo2;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Empregado {

    private Double salarioMensal;

    private Double comissao;

    private Double bonus;

    private TipoDeEmpregado tipoEmpregado;

    public Double quantiaPagar(){
        return tipoEmpregado.quantiaAPagar(this);
    }

    public Double lerSalarioMensal(){
        return salarioMensal;
    }

    public Double lerComissao(){
        return comissao;
    }

    public Double lerBonus(){
        return bonus;
    }


}
