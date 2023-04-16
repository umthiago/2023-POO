# Atividade 5

Atividade:

--> Adicione a Atv04 (sem alterar as linhas existentes) o cálculo para a média mensal de gastos, criando uma variável mediaMensal junto com uma mensagem. Para isso, concatene a String com o valor, usando "Valor da média mensal = " + mediaMensal.

Classe impressão de texto: "Main"  
IFPR - Campus Cascavel  
Aluno: Thiago Oliveira Dupim

Disciplina: Programação Orientada a Objetos  
Professor: Nelson Bellincanta

### Codigo:
```
int gastosJaneiro = 20000; // inciando e declarando a variavel
int gastosFevereiro = 15000; // inciando e declarando a variavel
int gastosMarco = 25000; // inciando e declarando a variavel

int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; //calculo simples para calcular o gasto trimensal
 
System.out.println("Total de gastos no Trimestre: " + gastosTrimestre);//imprimindo o valor do gasto trimensal

int mediaMensal = (gastosTrimestre/3); //calculo simples

System.out.println("Valor da média mensal = " + mediaMensal); //Imprimindo o do gasto mensal
```
