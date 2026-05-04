# Questao-2-Sistema-de-Controle-de-Notas-Escolares-

Sistema de gerenciamento de notas em Java para a turma **"3º Ano A"**.  
O projeto cadastra alunos, calcula médias e permite interações via menu interativo com opções para emitir boletins, contar aprovados, exibir o aluno com maior média e lançar novas notas.

## Funcionalidades

O sistema oferece um menu interativo com as seguintes opções:

1. Emitir boletins de todos os alunos  
2. Exibir quantidade de alunos aprovados  
3. Exibir aluno com maior média  
4. Lançar notas para um aluno pelo índice e exibir seu boletim atualizado  
0. Encerrar o sistema  

## Estrutura do Projeto

- **Aluno.java** → Classe que representa um aluno (nome, matrícula, notas e média).  
- **GerenciadorTurma.java** → Classe que gerencia a turma (cadastrar alunos, emitir boletins, contar aprovados, maior média).  
- **TesteNotas.java** → Classe principal com o menu interativo.  

## Tecnologias Utilizadas

- Java JDK 26 (ou superior)  
- Scanner para entrada de dados  
- Estruturas de repetição (`do-while`)  
- Estruturas de decisão (`switch-case`)  
- Programação orientada a objetos (POO)  

## Como Executar

1. Compile os arquivos:
   ```bash
   javac Aluno.java GerenciadorTurma.java TesteNotas.java
