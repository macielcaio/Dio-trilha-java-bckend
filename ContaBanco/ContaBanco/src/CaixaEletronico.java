import java.util.Scanner;

public class CaixaEletronico {

        public static void main(String[] args) {
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("Por favor, insira saldo em sua conta !");
            double saldo = entrada.nextDouble();
    
            Saldo conta = new Saldo();
            conta.setSaldo(saldo); 

            System.out.println("Por favor, digite o valor desejado para saque !");
            double valorsolicitado = entrada.nextDouble();   

            if(conta.getSaldo() > valorsolicitado){
                double valorSaque = conta.getSaldo() - valorsolicitado;

                System.out.println("O valor atual do seu saldo em conta é: " + valorSaque);
            }
            else{
                System.out.println("saldo insuficiente");
            }

            entrada.close();

        }

}
