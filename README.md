# 💰 Desafio: Contribuintes (POO e Listas) - DevSuperior

Este projeto é a resolução do desafio "Contribuintes", proposto no capítulo "Construtores, this, sobrecarga, encapsulamento" do curso **Formação Desenvolvedor Moderno** da DevSuperior. O objetivo é aplicar os conceitos de Programação Orientada a Objetos (POO) e a manipulação de `List` em Java para criar um sistema que calcula a declaração de imposto de renda para múltiplos contribuintes.

---

## ✨ Conceitos Aplicados

Este projeto foi uma oportunidade para praticar e solidificar os seguintes conceitos:

* **Programação Orientada a Objetos (POO):** Foco na criação de uma classe `TaxPayer` que modela uma entidade do mundo real.
* **Encapsulamento:** A classe `TaxPayer` encapsula todos os dados (atributos `private`) e as regras de negócio (métodos de cálculo), tornando o código principal mais limpo.
* **Listas (`ArrayList`):** Utilização de uma lista para armazenar uma coleção dinâmica de objetos `TaxPayer`, permitindo registrar um número `N` de contribuintes.
* **Separação de Responsabilidades:** A classe `Main` cuida da interação com o usuário, enquanto a classe `TaxPayer` cuida de toda a lógica de impostos.
* **Métodos com Responsabilidade Única:** Criação de métodos específicos para cada cálculo (`salaryTax`, `grossTax`, `taxRebate`, etc.), deixando o código organizado e legível.
* **Leitura de Dados:** Utilização da classe `Scanner` e padronização de `Locale` para ler os dados do usuário no console.

---

## 룰 Regras de Negócio

O sistema calcula o valor do imposto devido com base nas seguintes regras:

#### Imposto sobre Salário
O cálculo é feito com base na renda mensal (`renda anual / 12`).
* **Abaixo de R$ 3000.00/mês:** Isento.
* **De R$ 3000.00 até R$ 5000.00 (exclusive):** 10%.
* **Acima de R$ 5000.00:** 20%.

#### Imposto sobre Serviços e Capital
* **Prestação de Serviços:** 15% sobre a renda anual de serviços.
* **Ganho de Capital:** 20% sobre a renda anual com ganho de capital.

#### Abatimento de Impostos
* O contribuinte pode abater despesas com saúde e educação.
* O valor do abatimento é o **menor valor** entre:
    1. A soma total dos gastos com saúde e educação.
    2. 30% do valor do imposto bruto total (soma de todos os impostos).

---

## 📂 Estrutura do Projeto

O projeto está organizado em duas classes principais, seguindo a separação de pacotes `application` e `entities`:

* **`entities/TaxPayer.java`**: A classe que representa um único contribuinte. Ela contém os atributos de renda e gastos, e os métodos responsáveis por todos os cálculos de imposto (`grossTax`, `taxRebate`, `netTax`, etc.).

* **`application/Main.java`**: A classe principal que contém o método `main`. É responsável por interagir com o usuário, ler os dados de `N` contribuintes, instanciar e adicionar os objetos `TaxPayer` a uma `List`, e, por fim, percorrer a lista para apresentar o relatório final de cada um.

---

## 🚀 Como Executar

1.  Certifique-se de ter o **JDK (Java Development Kit)** (versão 17 ou superior) instalado em sua máquina.
2.  Clone ou baixe o código deste repositório.
3.  Abra um terminal ou prompt de comando e navegue até a pasta `src` do projeto.
4.  Compile os arquivos Java:
    ```bash
    javac application/Main.java entities/TaxPayer.java
    ```
5.  Execute o programa (a partir da pasta `src`):
    ```bash
    java application.Main
    ```
6.  Siga as instruções no console para inserir os dados dos contribuintes.

---

## 👨‍💻 Autor

* **Victor Xavier**
