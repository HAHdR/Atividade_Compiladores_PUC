import re
import requests

#Função para busca de emails (usa a URL como parâmetro)
def busca_email(url):
    print(f"Procurando e-mails em: {url} ...")
    try:
        #Faz a requisição
        resposta = requests.get(url)
        resposta.raise_for_status() #Verifica se houve erro na requisição
        texto_pag = resposta.text

        #regexp para capturar e-mails
        regexp = r'[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}'

        #O autômato varre o HTML buscando os e-mails
        emails_encontrados = re.findall(regexp, texto_pag)
        return list(set(emails_encontrados)) #Remove duplicatas

    except Exception as e:
        print(f"Erro ao acessar a página: {e}")
        return []

#Função tokenize
def tokenize(texto):
    #Definimos a Regexp usando Grupos Nomeados
    #A correção aqui é adicionar grupos nomeados para que match.lastgroup retorne um nome de grupo válido.
    regras = r'(?P<ID>[a-zA-Z_][a-zA-Z0-9_]*) | (?P<NUM>\d+) | (?P<OP>[=+\-*]) | (?P<SPACE>\s+)'

    padrao = re.compile(regras)
    lista_tokens = []

    #finditer cria um iterador onde o autômato avalia o texto passo a passo
    for match in padrao.finditer(texto):
        tipo = match.lastgroup     #Retorna o nome do grupo que combinou (ID, NUM, etc)
        lexema = match.group(tipo) #Retorna a string exata que foi capturada

        if tipo != 'SPACE': #Ignora os espaços em branco
            lista_tokens.append((tipo, lexema))

    return lista_tokens

#Teste do scanner e extração de e-mails

codigo = "position = initial + rate * 60"
print("Tokens reconhecidos:")
for token in tokenize(codigo):
    print(token)

print("\n\n\n")

url_teste = "https://orcose.com.br/trabalhe-conosco/"
emails = busca_email(url_teste)
print("E-mails extraídos da página:")
print(emails)