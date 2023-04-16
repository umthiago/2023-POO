# Atividade 4

Atividade:

--> Atualmente os gastos mensais de uma empresa são detalhados em planilhas eletrônicas. Assim, para fechar o balanço do primeiro trimestre, é necessário somar o gasto total destas planilhas. Sabendo que, em janeiro, foram gastos R$ 30.000,00 reais, em fevereiro, R$ 33.030,77 reais e em março, R$ 23.899,01 reais, faça uma classe em Java que calcule e exiba o gasto total no trimestre, seguindo os seguintes passos:

a) Crie uma classe chamada BalancoTrimestral com o método main;
b) No método principal, declare uma variável inteira chamada gastosJaneiro e inicialize-a com o valor gasto no mês de janeiro;
c) Crie também as variáveis gastosFevereiro e gastosMarco, inicializando-as com os respectivos gastos, utilize uma linha para cada declaração;
d) Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras variáveis;
e) Exiba a variável gastosTrimestre.

Classe impressão de texto: "Main"  
IFPR - Campus Cascavel  
Aluno: Thiago Oliveira Dupim

Disciplina: Programação Orientada a Objetos  
Professor: Nelson Bellincanta

### Codigo:
```
int gastosJaneiro = 20000; // Criando e declarando a primeira variavel
int gastosFevereiro = 15000; // Criando e declarando a segunda variavel
int gastosMarco = 25000; // Criando e declarando a terceira variavel

int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; //calculo simples para calcular os gastos do trimestre

System.out.println("Total de gastos no Trimestre: " + gastosTrimestre); //Imprimindo o gasto do trimestre
```
