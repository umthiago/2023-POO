# Atividade 6

Atividade:

--> Dados os valores de um depósito fixo mensal e um montante desejado, crie uma classe para determinar quantos meses serão necessários para acumular o montante desejado, considerando juros mensais de 0,5%.

Classe impressão de texto: "Main"  
IFPR - Campus Cascavel  
Aluno: Thiago Oliveira Dupim    
Disciplina: Programação Orientada a Objetos  
Professor: Nelson Bellincanta

### Codigo:
```
import java.util.Scanner;                                       //importanto o metodo Scanner da classe Java.util

Scanner ent = new Scanner(System.in);                           //criando o objeto para a entrada scanner;

double depositoMensal;                                          //iniciando uma variavel;
double montanteDesejado;                                        //iniciando uma variavel;
int meses = 1;                                                  //iniciando uma variavel;
double contagem = 0;                                            //iniciando uma variavel;
          
System.out.print("Digite o valor do deposito fixo mensal: ");   //Imprimindo uma pergunta do valor de deposito mensal;
depositoMensal = ent.nextDouble();                              //dando o valor digitado da entrada para a variavel "depositoMensal";
          
System.out.print("\nDigite o montante desejado: ");             //Imprimindo uma pergunta do valor de monte desejado;
montanteDesejado = ent.nextDouble();                            //dando o valor digitado da entrada para a variavel "montanteDesejado";

// essa variavel contagem serve para depositar a junção dos salarios ao decorrer dos meses;

contagem = depositoMensal;                                      //a variavel contagem recebe primeiramente o valor do deposito;
          
while (contagem < montanteDesejado){                            //um while enquanto a contagem for menor que o montante desejado;
             
    contagem = contagem + (depositoMensal * 1.05);              //contagem recebe contagem + o salario mensal;
    meses = meses + 1;                                          //contagem de meses que recebe os meses ao decorrer do tempo;
          
}
          
System.out.printf("%nSerá necessario %d meses até chegar no monte desejado!!", meses);      //Imprimindo a quantidade de meses;

System.out.printf("Valor adquirido nesses %d meses: R$%.2f", meses, contagem);              //imprimindo o valor adquirido dos meses;
```
