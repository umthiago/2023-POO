# Atividade 1

Atividade:

--> Crie uma classe em Java que seja capaz de apresentar a soma de todos os argumentos inteiros ou reais recebidos. Argumentos inválidos devem ser desconsiderados sem provocar a exibição de erros ou exceções.

Classe impressão de texto: "Main"  
IFPR - Campus Cascavel    
Aluno: Thiago Oliveira Dupim      
Disciplina: Programação Orientada a Objetos  
Professor: Nelson Bellincanta

### Codigo:
```
import java.util.Scanner; // Importação do pacote Scanner

Scanner LER = new Scanner(System.in); // Criando um objeto que recebe o metodo Scanner

// Declaração das variáveis
float x = 0f;
float y = 0f;
float result = 0f;
    
System.out.println("Digite o valor de x"); // Método Imprimir que mostra a mensagem para o usuario
x = LER.nextFloat(); // recebe como parâmetro o valor de x digitado pelo usuario

System.out.println("Digite o valor de y"); // Método Imprimir que mostra a mensagem para o usuario
y = LER.nextFloat(); // recebe como parâmetro o valor de y digitado pelo usuario

result = x + y; // calcula o resultado de x somado a y

System.out.println("O resultado da soma dos argumentos recebidos é:"+result); // Imprimi o resultado para o usuario
```

