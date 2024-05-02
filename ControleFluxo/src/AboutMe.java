
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String name = scanner.next();
    
            System.out.println("Digite seu sobrenome: ");
            String lastname = scanner.next();
    
            System.out.println("Digite sua idade: ");
            int age = scanner.nextInt();
    
            System.out.println("Digite sua alatura: ");
            double height = scanner.nextDouble();
            
        //IMPRIMINDO RESULTADOS DAS INFRMAÇÕES INSERIDAS PARA CONSOLE
        System.out.println("Olá me chammo " + name + " " + lastname);
        System.out.println("Eu tenho " + age + " anos " + "e tenho " + height + " de altura" );
        } catch (InputMismatchException e) {
            System.out.println("Os campos podem conter erros de digitação");
        }


    }
}
