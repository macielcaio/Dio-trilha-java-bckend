public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23997909");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("o cep não corresponde as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidException{
        if(cep.length() != 8)
            throw new CepInvalidException();
     //simulando cep formatado
     return "23.456-004";       
    }
}
