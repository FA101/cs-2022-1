package aula12.tarefa12;

import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {
        int i;
        Double deposito=0.0, saque=0.0;                
        Scanner input = new Scanner(System.in); 
        ContaBancaria usuario1 = new ContaBancaria(0.0);
        Double ref = usuario1.getSaldo();

        System.out.println("\nSua conta bancária possui saldo " + usuario1.getSaldo() + "\n");
        System.out.println("\nVoce quer depositar (1) ou sacar um valor (2)?\n");
        i = input.nextInt();
        
        if(i==1){
            System.out.println("\nDigite o deposito: \n");
            deposito = input.nextDouble();
            if(deposito >= 0.0){
                usuario1.depositar(deposito);
            }else{
                System.out.println("\nValor incorreto.\n");
            }
            
        }else if(i==2){
            System.out.println("\nDigite o saque: \n");
            saque = input.nextDouble();
            if(saque >=0){
                if(saque <= usuario1.getSaldo()){
                    usuario1.sacar(saque);
                }
            }else{
                System.out.println("\nValor incorreto.\n");
            }            
        }else{
            System.out.println("\nOpcao incorreta.\n");
        }
        
        try{                        
            if(saque > usuario1.getSaldo()){
                throw new SaldoInsuficienteException();
            }else if(saque <= usuario1.getSaldo() && saque >= 0.0 && deposito >= 0.0){
                System.out.println("\nOperacao realizada com sucesso.\n");
                System.out.println("\nSeu saldo e de: " + usuario1.getSaldo() + "\n");
            }else{
                System.out.println("\nErro na operacao. Tente novamente.\n");
            }
        } catch(SaldoInsuficienteException ai){
            System.out.println("\nSeu saldo e: " + usuario1.getSaldo() + "\n");
            System.out.println("\nVoce solicitou o saque de: " + saque + "\n");
            System.out.println("\nSaldo insuficiente.\n");
        } finally{
            input.close();
        }
    }
}
