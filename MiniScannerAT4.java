import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Escreva uma descrição da classe Scanner aqui.
 * 
 * @author Henrique Abreu Hollanda da Rocha 
 * @author Thiago Salanti Mambrini
 * @author Matheus Guido Noronha Moreira Passos
 * 
 * @version 1.0
 */
public class MiniScannerAT4 {
    
    //classe interna para representar a tupla (tipo, lexema)
    public static class Token {
        public final String tipo;
        public final String lexema;
        
        public Token(String tipo, String lexema) {
            this.tipo = tipo;
            this.lexema = lexema;
        }
        
        @Override
        public String toString() {
            return "('" + tipo + "', '" + lexema + "')";
        }
    }

    //função que atua como o analisador léxico
    public static List<Token> tokenize(String texto) {
        List<Token> listaTokens = new ArrayList<>();
        
        //expressão regular com grupos nomeados:
        String regex = "(?<ID>[a-zA-Z_][a-zA-Z0-9_]*)|(?<NUM>\\d+)|(?<OP>[=+\\-*])|(?<SPACE>\\s+)";
        
        //pattern para compilar a string em um Autômato Finito
        Pattern padrao = Pattern.compile(regex);
        Matcher matcher = padrao.matcher(texto);

        //matcher.find() avança o autômato consumindo os lexemas válidos
        while (matcher.find()) {
            if (matcher.group("ID") != null) {
                listaTokens.add(new Token("ID", matcher.group("ID")));
            } 
            else if (matcher.group("NUM") != null) {
                listaTokens.add(new Token("NUM", matcher.group("NUM")));
            } 
            else if (matcher.group("OP") != null) {
                listaTokens.add(new Token("OP", matcher.group("OP")));
            }
        }
        
        return listaTokens;
    }

    //método principal
    public static void main(String[] args) {
        String codigo = "position = initial + rate * 60";
        
        System.out.println("Analisando o código: " + codigo);
        System.out.println("Tokens gerados:");
        
        //imprime os tokens na tela
        List<Token> tokens = tokenize(codigo);
        for (Token t : tokens) {
            System.out.println(t);
        }
    }
}