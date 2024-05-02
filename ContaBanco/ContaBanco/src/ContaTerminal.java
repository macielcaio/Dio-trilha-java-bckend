import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
      
      Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor, digite o nome do cliente !");
		String NomeCliente = entrada.next();
		
		System.out.println("Por favor, digite o número da Agência !");
		String Agencia = entrada.next();
		
        
        System.out.println("Por favor, insira saldo em sua conta !");
        double saldo = entrada.nextDouble();

        Saldo conta = new Saldo();
        conta.setSaldo(saldo); 
        
        //GERANDO NUMERO DE CONTA
        Random random = new Random();  
        int NumeroConta = random.nextInt(100000);
        System.out.println("Número da conta é: " + NumeroConta);

        System.out.printf("Olá " + NomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia +", conta "+ NumeroConta +" e seu saldo " + conta.getSaldo() + " já está disponível para saque.");

        entrada.close();
    }

}
