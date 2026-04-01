# Atividade_Compiladores_PUC

**EQUIPE:** Henrique Abreu Hollanda da Rocha, Matheus Guido Noronha Moreira Passos, Thiago Salanti Mambrini.

**Atividade 1 – Bash no Terminal Ubuntu: Simulando o “fluxo de entrada” do Scanner:**

Etapas:
  * Criar arquivo scanner_simples.sh
  <img width="748" height="37" alt="Captura de tela 2026-03-27 182858" src="https://github.com/user-attachments/assets/17f2050f-c39e-491a-a5a8-3dda7056796b" />
  
  * Fazer loop infinito que lê linhas de um arquivo exemplo.c (fornecido pelo professor com o exemplo do livro + comentários).
     <img width="462" height="198" alt="Captura de tela 2026-03-27 183131" src="https://github.com/user-attachments/assets/4ae07933-163e-4ee4-a1fb-75e54b5ec4d6" />

  * Adicionar tr -d ' \t\r' para remover espaços em branco (pré-processamento típico do scanner).
    <img width="356" height="24" alt="Captura de tela 2026-03-27 183214" src="https://github.com/user-attachments/assets/993d3b3a-459d-40f0-b10e-f921d0d385de" />

  * Testar com cat exemplo.c | ./scanner_simples.sh
    <img width="648" height="678" alt="Captura de tela 2026-03-27 183339" src="https://github.com/user-attachments/assets/58f08e56-5d3e-4257-98c2-25c20868dc46" />
    <img width="578" height="679" alt="Captura de tela 2026-03-27 183413" src="https://github.com/user-attachments/assets/ccc802f7-e83e-49ea-856f-ea04cf401aeb" />
    <img width="599" height="578" alt="image" src="https://github.com/user-attachments/assets/6737608d-220b-40d1-a96a-06f02edd3efb" />








**Atividade 2 – Expressões Regulares online (regexr + regex101):**

 * Regex para capturar todos os tokens
 <img width="874" height="517" alt="Captura de tela 2026-03-27 191326" src="https://github.com/user-attachments/assets/e7a13165-26f6-4f3c-bb98-8cad0dbe7a52" />




 **Explicação:**
 
A Expressão Regular utiliza o "|" para tornar possível a identificação de qualquer caracter, tornando-a mais genérica e capaz de capturar todos os identificadores (a-z, A-Z), números (0-9) e operadores (+, -, *, /). A flag /g (global) serve para capturar todos os tokens da string, sem esta flag ativa, apenas o primeiro termo da string será capturado. Os espaços são ignorados por não fazeram parte dos padrões estabelecidos.



**Atividade 3 – Find/Replace com regex em editores de texto:**

 * Remover todos os comentários // e /* */ de um arquivo grande.
   
   <img width="383" height="279" alt="image" src="https://github.com/user-attachments/assets/d4993a5f-01fd-4916-b68d-063dc030e7fe" />
   <img width="966" height="260" alt="image" src="https://github.com/user-attachments/assets/ad4acc18-aa78-480a-8687-331bd918448b" />
 
 * Substituir todos os = por := (simulando mudança de linguagem).
   <img width="1019" height="311" alt="image" src="https://github.com/user-attachments/assets/20061050-ddaf-4190-85c0-ec622d6849e7" />
   
* Limpar espaços extras em um arquivo de dados CSV maior que 10 mil linhas (registros).
* Tornar um CSV em um TSV
* CSV com dados em português converter para inglês, trocar , -> . e , -> ;
   <img width="1192" height="480" alt="image" src="https://github.com/user-attachments/assets/c4fd0ee3-278f-4d5b-8910-c038d05f2145" />

**Atividade 4 -  RegExp em Python e Java**

* Implementar um mini-scanner em Python e Java.
* Mostrando os tokens e emails reconhecidos pelo programa em Python, feito no Colab.
  <img width="599" height="265" alt="image" src="https://github.com/user-attachments/assets/5716d227-85f3-4716-bbc4-8a3b191b632f" />

* Mostrando os tokens gerados pelo código em Java:

  <img width="566" height="276" alt="image" src="https://github.com/user-attachments/assets/f450f67f-a5b2-4916-8009-9c4eba7344bd" />

* Parte final - desafio: Tokenizar o exemplo completo do livro e imprimir exatamente como na Figura 1.7 do Dragon Book.
* Saída do scanner após tokenizar o exemplo do livro:

  <img width="451" height="234" alt="image" src="https://github.com/user-attachments/assets/b15cba8c-0e3d-405e-b18d-875f931ff790" />

**Atividade 5 - Automato Finito**

* Criar DFA (Deterministic Finite Automata) para reconhecer números inteiros:
   <img width="600" height="280" alt="image" src="https://github.com/Noronha212/imagens/blob/main/AFD_inteiros2.png" />

* Criar DFA para identificadores:
   <img width="600" height="280" alt="image" src="https://github.com/Noronha212/imagens/blob/main/AFD_identificadores2.png" />

* Criar NFA (Non-Deterministic Finite Automata - Pode seguir mais de um fluxo) para operador = e == (ambiguidade):
  <img width="600" height="280" alt="image" src="https://github.com/Noronha212/imagens/blob/main/AFN_iguais.png" />

* Converter NFA → DFA (ferramenta automática do JFLAP):
  <img width="600" height="280" alt="image" src="https://github.com/Noronha212/imagens/blob/main/AFD_AFN.png" />

* Simular passo a passo com a string do livro: "const pi = 3.1416;"
  <img width="600" height="280" alt="image" src="https://github.com/Noronha212/imagens/blob/main/AFN_final.png" />
  <img width="600" height="280" alt="image" src="https://github.com/Noronha212/imagens/blob/main/AFN_saida.png" />
  
**Atividade 6 - OpenAI Tokenizer × Tokens de Compilador**
<img width="350" height="180" alt="image" src="https://github.com/user-attachments/assets/f450f67f-a5b2-4916-8009-9c4eba7344bd" />
<img width="350" height="180" alt="image" src="https://github.com/Noronha212/imagens/blob/main/Tokens.png">

*Por que “position” vira “pos + ition”?

Isso acontece principalmente por três motivos:

1 - Frequência no idioma

Partes como:

“pos”
“ition”

aparecem em várias palavras:

position
composition
transition
positive

Então o modelo aprende que essas partes são úteis e reutilizáveis.

3 - Algoritmo de tokenização

Modelos da OpenAI usam técnicas como:

Byte Pair Encoding (BPE)
ou variantes mais modernas

Esses algoritmos:

Começam com caracteres individuais
Vão juntando os pares mais frequentes
Criam “blocos” reutilizáveis

Resultado: nem sempre a palavra inteira vira um token único

3 - Eficiência de vocabulário

Se cada palavra fosse um token:

o vocabulário seria gigantesco
difícil de treinar e generalizar

Com subpalavras:

menos tokens no vocabulário
consegue lidar com palavras novas (ex: “repositioning”)*

*"Qual é a diferença conceitual entre token léxico (segue gramática regular da linguagem) e token de LLM (BPE – Byte Pair Encoding)"?

Um token léxico, usado em Compiladores, é uma unidade com significado sintático definido por regras formais (como palavras-chave, identificadores e operadores), reconhecida por gramáticas e Expressões Regulares; já um token de LLM, baseado em Byte Pair Encoding, é uma divisão do texto em subpartes estatísticas escolhidas por frequência, sem compromisso com o significado linguístico, visando apenas eficiência na representação e previsão de texto.

Token léxico → semântica + sintaxe
Token de LLM → estatística + compressão

Eles só compartilham o nome “token”, mas são conceitos totalmente diferentes.*
