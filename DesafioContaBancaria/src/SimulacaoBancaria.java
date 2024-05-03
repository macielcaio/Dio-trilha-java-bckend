import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {
            int opcao = scanner.nextInt(); 
            scanner.nextLine(); // Consumir a quebra de linha pendente
            
            // TODO: Implementar as operações de acordo com a opção escolhida
            switch (opcao) {
              case 1:
                  double valorDeposito = scanner.nextDouble();
                  if(valorDeposito >= 1){
                      saldo += valorDeposito;
                      System.out.println("Saldo atual: " + saldo);
                  }
                  break;
              case 2:
                  double valorSaque = scanner.nextDouble();
                  if(valorSaque < saldo) {
                      saldo -= valorSaque;
                      System.out.println("Saldo atual: " + saldo);
                  } else {
                      System.out.println("Saldo insuficiente."); 
                  }
                  break;
              case 3:  
                  System.out.println("Saldo atual: " + saldo);
                  break;
              case 0:  
                  System.out.println("Programa encerrado."); 
                  scanner.close(); // Fechar o scanner antes de encerrar o programa
                  return;
              default:
                  System.out.println("Opção inválida."); 
            }
        }
    }
}
