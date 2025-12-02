# 🚀 Desafios de Programação em Java

Este repositório contém uma série de desafios de programação para reforçar os conceitos de **Java Básico** e **Programação Orientada a Objetos (POO)**

## ☕ Módulo 1: Java Básico e Estruturas de Dados

Estes desafios focam em **tipos de dados**, **estruturas de controle** (`if`, `for`, `while`) e manipulação básica de `arrays` e `strings`.

| Desafio | Foco Principal | Detalhamento |
| :--- | :--- | :--- |
| **1. Calculadora Simples** | Estruturas de Controle e I/O | Crie um programa que peça dois números e a operação (+, -, *, /). Use um `switch` para executar a operação. Implemente tratamento básico para **divisão por zero**. |
| **2. Inversão de String** | Manipulação de Strings/Arrays | Receba uma string (palavra ou frase) e imprima a string invertida. *Tentem duas soluções: usando um laço `for` ou usando `StringBuilder`.* |
| **3. Média de Notas** | Arrays e Laços de Repetição | Peça as 4 notas de *N* alunos (onde *N* é definido pelo usuário) e armazene-as em um **array 2D** (matriz). Calcule e imprima a média final de cada aluno e a média geral da turma. |
| **4. Números Primos** | Lógica e Laços Aninhados | Desenvolva um método que receba um número inteiro `n` e imprima todos os números primos de 1 até `n`. |

---

## 📦 Módulo 2: Programação Orientada a Objetos (POO)

Estes desafios exploram os 4 pilares da POO: **Encapsulamento**, **Herança**, **Polimorfismo** e **Abstração**.

### Desafio 5: Sistema de Gestão de Contas Bancárias (Encapsulamento e Herança)

1.  **Classe `ContaBancaria`:**
    * **Atributos (Privados):** `numero`, `saldo`, `titular`.
    * **Encapsulamento:** Implemente **getters** e métodos de negócio (`depositar(valor)`, `sacar(valor)`, `consultarSaldo()`). O saque deve verificar o saldo.
2.  **Classes Filhas:**
    * **`ContaCorrente`:** Herda de `ContaBancaria`. Adicione `taxaMensal`. Implemente um método `cobrarTaxa()`.
    * **`ContaPoupanca`:** Herda de `ContaBancaria`. Implemente um método `renderJuros(taxa)` que aumenta o saldo.
3.  **Teste:** Crie instâncias das classes filhas e demonstre seus comportamentos diferentes.

### Desafio 6: Sistema de Gerenciamento de Funcionários (Polimorfismo)

1.  **Classe Base `Funcionario`:**
    * **Atributos:** `nome`, `matricula`, `salarioBase`.
    * **Método:** `calcularSalario()`: Retorna o `salarioBase` (deve ser sobrescrito).
2.  **Classes Filhas:**
    * **`Gerente`:** Adicione `bonusAnual`. Sobrescreva `calcularSalario()` para incluir o bônus.
    * **`Programador`:** Adicione `horasExtras`. Sobrescreva `calcularSalario()` para incluir o valor das horas extras.
3.  **Polimorfismo:** Crie uma **lista** de tipo `Funcionario`. Adicione objetos `Gerente` e `Programador` a ela. Percorra a lista e chame `calcularSalario()` para cada objeto para demonstrar o polimorfismo.

---

## 🧩 Módulo 3 & 4: Coleções e Relacionamentos POO

Estes desafios focam em manipular coleções (`ArrayList`) e modelar sistemas mais complexos com **Composição** e **Agregação**.

### Desafio 7. Gerenciador de Tarefas Simples (ArrayList)

* Crie um programa que gerencie uma lista de tarefas (`String`) usando um **`ArrayList`**.
* Apresente um menu com as opções: **Adicionar**, **Listar Todas** (com índice) e **Remover** (pelo índice).

### Desafio 10: Sistema de Cadastro de Pedidos (Composição/Agregação)

1.  **Classe `Produto`:** Atributos (`codigo`, `nome`, `preco`).
2.  **Classe `ItemPedido`:** Atributos (`Produto produto`, `int quantidade`). **Composição**: `ItemPedido` **TEM UM** `Produto`.
    * Método: `calcularSubtotal()` (preço * quantidade).
3.  **Classe `Pedido`:** Atributos (`numero`, `ArrayList<ItemPedido> itens`). **Agregação**: `Pedido` **TEM VÁRIOS** `ItemPedido`.
    * Métodos: `adicionarItem()`, `calcularTotal()` (soma dos subtotais de todos os itens).
4.  **Teste:** Crie produtos, adicione-os como itens a um pedido e calcule o total.

### Desafio 11: Gerenciador de Biblioteca (Associação e Herança)

1.  **Classe `Pessoa`** (Base): Atributos (`nome`, `identificacao`).
2.  **Classes Filhas:** **`Autor`** e **`Membro`**.
3.  **Classe `Livro`:** Atributos (`titulo`, `Autor autor`, `boolean emprestado`).
4.  **Classe `Biblioteca`:**
    * Atributos: `ArrayList<Livro> acervo`, `ArrayList<Membro> membros`.
    * Métodos: `adicionarLivro()`, `emprestarLivro(titulo, idMembro)`, `devolverLivro()`, `listarLivrosDisponiveis()`.
