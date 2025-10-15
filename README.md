# Desafio de Programação: Cálculo de Impostos (DevSuperior)

Projeto em Java desenvolvido como parte do desafio do capítulo "Construtores, this, sobrecarga, encapsulamento" do curso **Formação Desenvolvedor Moderno** da DevSuperior.

## 🚀 Sobre o Desafio

Este programa em Java faz a leitura dos dados de renda e gastos de N contribuintes. As informações são instanciadas como objetos e armazenadas em uma lista. Ao final da entrada de dados, o programa exibe um relatório individual com o resumo do cálculo de imposto de cada contribuinte, aplicando as regras de imposto sobre salário, serviços e ganho de capital, além do cálculo de abatimento de despesas.

### ✔️ Funcionalidades Implementadas

* Leitura de dados de N contribuintes e armazenamento em uma `List` de objetos.
* Cálculo de imposto sobre salário baseado em faixas de renda mensal (isento, 10% ou 20%).
* Cálculo de imposto sobre prestação de serviços (15%) e sobre ganho de capital (20%).
* Cálculo do imposto bruto total, que é a soma de todos os impostos apurados.
* Cálculo do abatimento de imposto, considerando o menor valor entre a soma dos gastos dedutíveis (médicos + educacionais) e o teto de 30% do imposto bruto.
* Cálculo do imposto líquido devido (imposto bruto - abatimento).
* Exibição de um relatório formatado para cada contribuinte ao final da execução.

## ⚙️ Como Executar

1.  **Pré-requisitos:**
    * É necessário ter o Java JDK (versão 17 ou superior) instalado.

2.  **Clone o repositório:**
    ```bash
    git clone https://github.com/Victorx16/desafio-contribuinte-oo.git
    ```

3.  **Navegue e compile o projeto:**
    ```bash
    cd seu-repositorio/src
    javac application/Main.java entities/TaxPayer.java
    ```

4.  **Execute o programa:**
    ```bash
    java application.Main
    ```

### Exemplo de Uso

Quantos contribuintes você vai digitar? 2

Digite os dados do 1° contribuinte:

Renda anual com o sálario: 50000.00

Renda anual com prestação de serviços: 78500.00

Renda anual com o ganho de capital: 15000.00

Gastos médicos: 2200.00

Gastos educacionais: 12800.00



Digite os dados do 2° contribuinte:

Renda anual com o sálario: 120000.00

Renda anual com prestação de serviços: 0.00

Renda anual com o ganho de capital: 32000.00

Gastos médicos: 15000.00

Gastos educacionais: 7600.00



Resumo do 1° contribuinte:

Imposto bruto total: 20775.00

Abatimento: 6232.50

Imposto devido: 14542.50

Resumo do 2° contribuinte:

Imposto bruto total: 30400.00

Abatimento: 9120.00

Imposto devido: 21280.00


## 🧠 Conceitos Praticados

Este projeto foi uma oportunidade para praticar e aprofundar os seguintes conceitos de Java e Programação Orientada a Objetos:

* **Programação Orientada a Objetos (POO)**
* Criação de classes (`TaxPayer`) com atributos e métodos
* **Encapsulamento**, utilizando atributos `private` e métodos `getters`
* **Construtores** para inicialização correta dos objetos
* Separação de responsabilidades em métodos (`grossTax`, `taxRebate`, `netTax`)
* Uso de `List` e `ArrayList` para armazenar coleções de objetos
* Entrada de dados com a classe `Scanner` e padronização com `Locale`
* Saída formatada com `printf`
* Reutilização de código através de métodos (`toString`)

---

Feito por **Victor Xavier**.
