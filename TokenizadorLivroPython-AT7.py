import re
import os

#Alunos: 
#Henrique Abreu Hollanda da Rocha 
#Matheus Guido Noronha Moreira Passos 
#Thiago Salanti Mambrini 

def tokenizar_arquivo(caminho_arquivo):  #função que recebe o txt e cria o regexp para tokenizar as palavras
    
    #lê um arquivo de texto e o quebra em tokens conforme a gramática em português.
    
    try:   
        with open(caminho_arquivo, 'r', encoding='utf-8') as arquivo:
            texto = arquivo.read()    #faz a leitura de acordo com a codificação utf-8
    except FileNotFoundError:
        return f"Erro: O arquivo '{caminho_arquivo}' não foi encontrado."

    regexp = r'[A-Za-z]+(?:-[A-Za-z]+)*|[^\w\s]'     #função regexp

    tokens = re.findall(regexp, texto)   #usa o findall para procurar as ocorrências de acordo com a expressão regular que é passada pelo parâmetro da função 

    return tokens   #retorna os tokens encontrados 


if __name__ == "__main__":

    #faz a leitura do arquivo
    ler_arquivo = os.path.dirname(os.path.abspath(__file__))
    
    caminho_arq = os.path.join(ler_arquivo, 'livroAT7Comp.txt')

    lista_tokens = tokenizar_arquivo(caminho_arq)
    
    #saída do programa -> vetor de strings que foram aceitas pela expressão regular, de acordo com a gramática da língua portuguesa 
    print("O arquivo foi lido do caminho:", caminho_arq)
    print("Primeiros 5000 tokens")

    #como o livro é muito extenso, o programa mostra os primeiros 5000 tokens, para mostrar todos apenas tirar o comentário do segundo 'print' e comentar o primeiro

    print(lista_tokens[:5000])   
    #print(lista_tokens)
    
  