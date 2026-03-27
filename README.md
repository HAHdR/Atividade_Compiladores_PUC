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



