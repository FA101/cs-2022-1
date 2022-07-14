/**
 * Exemplo de uma classe componente da hierarquia de classes, cuja super classe é abstrata.
 */
package heranca_polimorfismo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter @Setter @NoArgsConstructor
public class PessoaConcreta extends PessoaAbstrata{

    public PessoaConcreta(String nome) {
        this.nome = nome;
    }

    /**
     * Implementação do método abstrato cantar().
     * @return
     */
    @Override
    public String cantar() {
        return "Sou capaz de cantar";
    }
}
