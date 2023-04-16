# Atividade 3

Atividade:

--> Usando a classe JOptionPane para entrada de dados;
Crie uma classe que receba a nota de duas provas e de um trabalho. Calcule e mostre a média.

Classe impressão de texto: "Main"  
IFPR - Campus Cascavel  
Aluno: Thiago Oliveira Dupim
Disciplina: Programação Orientada a Objetos  
Professor: Nelson Bellincanta

### Codigo:
```
String aux; //Criando uma variavel do tipo String que vai receber a entrada dentro da caixa de entrada.

	float prova1, prova2, notadotrabalho, media; //criando as variaveis do tipo float
		
		aux = JOptionPane.showInputDialog("Insira a nota da prova 1: "); //Iniciando a caixa de entrada e dando o valor para a variavel aux
		prova1 = Float.parseFloat(aux); // transformando o valor da variavel "aux" (String) para a "prova1" (Float)
			
		aux = JOptionPane.showInputDialog("Insira a nota da prova 2: ");//Perguntando novamente na caixa pedindo um segundo numero
		prova2 = Float.parseFloat(aux);// transformando o valor da variavel "aux" (String) para a "prova2" (Float)
			
        aux = JOptionPane.showInputDialog("Insira a nota do trabalho: ");//Perguntando novamente na caixa pedindo um segundo numero
		notadotrabalho = Float.parseFloat(aux);// transformando o valor da variavel "aux" (String) para a "notadotrabalho" (Float)
			
        media= (prova1 + prova2 + notadotrabalho) /3; //fazendo um calculo simples para calcular a media
        
		JOptionPane.showMessageDialog(null, "Á media do aluno foi " + media); //Imprimindo na caixa a media
	
System.exit(0); //finalizando
```
