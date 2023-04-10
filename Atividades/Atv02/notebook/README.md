# Atividade 1

Classe impressão de texto: "Main"  
IFPR - Campus Cascavel    
Aluno: Thiago Oliveira Dupim      
Disciplina: Programação Orientada a Objetos  
Professor: Nelson Bellincanta

Atividade:

### Exibir a mensagem “Informe um inteiro: “, deixando o cursor na mesma linha:
```
System.out.print("Informe um inteiro"); // Método Imprimir que mostra a mensagem para o usuario
```
### Atribuir o produto das variáveis b e c para a variável a
```
import java.util.Scanner; // Importação do pacote Scanner

Scanner LER = new Scanner(System.in); // Criando um objeto que recebe o metodo Scanner

// Declaração das variáveis
int b = 0;
int c = 0;
int a = 0;
    
System.out.println("Digite o valor de b"); // Método Imprimir que mostra a mensagem para o usuario
b = LER.nextFloat(); // recebe como parâmetro o valor de b digitado pelo usuario

System.out.println("Digite o valor de c"); // Método Imprimir que mostra a mensagem para o usuario
c = LER.nextFloat(); // recebe como parâmetro o valor de c digitado pelo usuario

a = b * c; // atribuindo o produto das variáveis b e c para a variável a

System.out.println("O produto das variáveis b e c é:"+a); // Método Imprimir que mostra o produto para o usuario 
```

### Demonstrar a execução do cálculo e utilizar um comentário para afirmar que é um programa de exemplo de folha de pagamento.
```
System.out.println("O produto das variáveis b e c é:"+a); // Método Imprimir que mostra o produto para o usuario 
```
