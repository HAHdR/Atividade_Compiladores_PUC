import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe que cria um tokenizador baseado em uma regexp(expressão regular) que reconhece a gramática da língua portuguesa.
 * 
 * @author Henrique Abreu Hollanda da Rocha
 * @author Matheus Guido Noronha Moreira Passos 
 * @author Thiago Salanti Mambrini 
 * 
 * @version 2026.04.01
 */

public class TokenizadorAT7 {

    //é necessário que o arquivo.txt esteja na mesma pasta do arquivo .class para funcionar

    public static List<String> tokenizarArquivo(String caminho_arq) {
        List<String> tokens = new ArrayList<>();   //usa arraylist para armanezar as strings compatíveis com a regexp
        String texto = "";
        
        try {
            //primeira tentativa de leitura do arquivo do livro (facilita na compatibilidade)
            InputStream inputStream = TokenizadorAT7.class.getResourceAsStream(caminho_arq);
            
            if (inputStream != null) {
                //scanner é usado para transformar o InputStream em String de acordo com padrão UTF-8
                Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name());
                scanner.useDelimiter("\\A"); //'\\A' é o início do arquivo, forçando a ler tudo de uma vez
                texto = scanner.hasNext() ? scanner.next() : "";
                scanner.close();   //fecha o scanner
            } else {
                //se a primeira tentativa de leitura falhar, tem essa segunda opção que funciona melhor em outros ambientes
                Path caminho = Paths.get(caminho_arq);
                texto = Files.readString(caminho, StandardCharsets.UTF_8);
            }
            
            //em Java, o ?U é necessário para aceitar palavras com acento e ç, por exemplo, diferente do Python que já aceita por padrão
            String regexp = "(?U)[^\\W\\d_]+(?:-[^\\W\\d_]+)*|[^\\w\\s]";
            
            //compila o padrão e prepara o buscador
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(texto);
            
            //loop para procurar um padrão que bate com a regexp, adiciona na lista
            while (matcher.find()) {
                tokens.add(matcher.group());
            }
            
        } catch (Exception e) {
            System.out.println("Erro: O arquivo '" + caminho_arq + "' não foi encontrado.");
            System.out.println("Certifique-se de que ele está exatamente na mesma pasta que o código!");
        }
        
        return tokens;
    }

    public static void main(String[] args) {
        String arquivo = "livroAT7Comp.txt"; // Apenas o nome do arquivo com a extensão
        
        System.out.println("Tentando localizar e ler: " + arquivo + "...\n");
        
        List<String> listaTokens = tokenizarArquivo(arquivo);
        
        //imprime os primeiros 50 tokens, para imprimir a lista completa, basta fazer a mesma coisa que com o Python, comentar as próximas 3 linhas e tirar o comentário da última
        System.out.println("Primeiros 5000 tokens");
        int limite = Math.min(listaTokens.size(), 5000);
        System.out.println(listaTokens.subList(0, limite));

        //System.out.println(listaTokens)
    }
}