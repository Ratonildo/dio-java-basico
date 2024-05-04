public class MinhaClasse {
    
public static void main(String [] args) {
    String primeiroNome = "Bruno";
    String segundoNome = "Rebouças";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.print(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome)  {
    return " Resultado do Método " + primeiroNome.concat(" ").concat(segundoNome);
}

}
