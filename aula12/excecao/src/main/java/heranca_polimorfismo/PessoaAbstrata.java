/**
 * Classe definida para explicar o conceito de classe abstrata
 * Autor: Gilmar Ferreira Arantes
 * Data: 02/09/2021
 */
package heranca_polimorfismo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * Exemplo de uma classe abstrata. Uma classe para ser abstrata, deve possuir pelo menos um método abstrato.
 * Uma classe abstrata na poderá ser instanciada, ou seja, não terá nenhuma instância. Somente as subclasses, concretas, terão instâncias.
 * Um método abstrato é aquele que não disponibiliza uma implementação padrão para a hierarquia de classes.
 */
@Getter @Setter
public abstract class PessoaAbstrata {

    //Todos os atributos possuem visibilidade protegida. Serão vistos diretamente, somente pelas subclasses
    protected String nome;
    protected Date dataNascimento; //data de nascimento.
    protected String sexo;
    protected String genero;
    protected String raca;

    private PessoaConcreta conjuge; //associação de pessoa com pessoa, com multiplicidade 1:1.

    private List<PessoaConcreta> filhos; //associação de pessoa com pessoa, com multiplicidade 1:n.

    private List<Documento> documentos;//associação de pessoa com Documento, com multiplicidade 1:n, do lado de Pessoa;

    private Profissao profissao;//associação de pessoa com profissão, com multiplicidade 1:n do lado de Profissão.
        // Uma pessoa está associada a uma profissão. Mas, uma profissão pode estar associada a várias pessoas.

    /**
     * Método concreto, considerando que todas as instâncias da hierarquia falam;
     */
    public String falar()
    {
        return "Hello World!";
    }

    /**
     * Método abstrato, pois nem todas as instâncias são capazes de cantar.
     */
    public abstract String cantar();
}
