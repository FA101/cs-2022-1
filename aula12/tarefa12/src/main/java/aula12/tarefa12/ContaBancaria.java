//Exercicio 4 da aula12

package aula12.tarefa12;

public class ContaBancaria {
    private Double saldo;    

    public ContaBancaria(Double saldo) {
        this.saldo = saldo;
    }

    public Double depositar(Double valor){
        this.setSaldo(this.getSaldo() + valor);
        return this.getSaldo();
    }

    public Double sacar(Double valor){
        this.setSaldo(this.getSaldo() - valor);
        return this.getSaldo();
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
