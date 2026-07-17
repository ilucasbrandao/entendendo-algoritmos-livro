# 📘 Entendendo Algoritmos — Guia de Estudos (Java)

Este repositório foi criado para documentar meus estudos, códigos e anotações baseados no livro **"Entendendo Algoritmos: Um Guia Ilustrado para Programadores e Outros Curiosos"** de Aditya Y. Bhargava.

O objetivo principal é fixar os conceitos teóricos aplicando-os na prática utilizando a linguagem **Java**.

---

## 🚀 Progresso Atual

![Progresso](https://shields.io)
![Java](https://shields.io)

- [x] **Capítulo 1:** Introdução a Algoritmos (Busca Binária e Big O)
- [x] **Capítulo 2:** Ordenação por Seleção (Arrays e Listas Encadeadas)
- [x] **Capítulo 3:** Recursão (Pilha de Chamada / Call Stack)
- [ ] **Capítulo 4:** Quicksort *(Próximo passo)*

---

## 📂 Resumo dos Capítulos Concluídos

### 🔍 Capítulo 1: Introdução a Algoritmos
*   **Busca Binária:** Implementação do algoritmo que reduz o espaço de busca pela metade a cada iteração. Aplicado sobre arrays ordenados. Tempo de execução: $O(\log n)$.
*   **Notação Big O:** Compreensão de como mensurar o tempo de execução no pior cenário teórico (ex: busca simples vs. busca binária).

### 🗂️ Capítulo 2: Ordenação por Seleção
*   **Estruturas de Memória:** Diferenças práticas em Java entre o uso de arrays estáticos (tamanho fixo, acesso indexado $O(1)$) e listas dinâmicas/encadeadas (inserção rápida $O(1)$).
*   **Ordenação por Seleção:** Algoritmo que varre a coleção procurando repetidamente o menor elemento para construir uma nova estrutura ordenada. Tempo de execução: $O(n^2)$.

### 🔄 Capítulo 3: Recursão
*   **Conceito Base:** Funções que chamam a si mesmas. Divisão clara entre o caso-base (critério de parada) e caso recursivo.
*   **Pilha de Chamada (Call Stack):** Análise de como a JVM gerencia a memória durante execuções recursivas e os riscos de estourar o limite de memória da pilha (`StackOverflowError`).

---

## 🛠️ Tecnologias Utilizadas

*   **Linguagem:** Java (JDK 17 ou superior)
*   **Ambiente:** Git & GitHub para controle de versão.

---

## 🧠 Como Executar os Códigos

Para compilar e rodar os algoritmos deste repositório, certifique-se de ter o JDK instalado em sua máquina e siga os passos:

1. Clone o repositório:
   ```bash
   git clone https://github.com
   ```
2. Acesse a pasta correspondente ao algoritmo (ex: Busca Binária):
   ```bash
   cd capitulo-01
   ```
3. Compile o arquivo Java:
   ```bash
   javac BuscaBinaria.java
   ```
4. Execute o programa:
   ```bash
   java BuscaBinaria
   ```
