/**
 * Outro exemplo de classe concreta componente da hierarquia de uma super classe abstrata.
 */
package heranca_polimorfismo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class PessoaConcreta1 extends PessoaAbstrata{

    public PessoaConcreta1(String nome) {
        this.nome = nome;
    }

    /**
     * Implementação do método abstrato cantar.
     * @return
     */
    @Override
    public String cantar() {
        return "Não sou capaz de cantar";
    }
}
