
public class Mamiferos{
    private String nome; //atributo String nome
    private int idade; //atributo int idade

    //metodo construtor da classe
    public Mamiferos(String nome2, int idade2){
        this.nome = nome2;
        this.idade = idade2;
    }

    public void setNome(String nome2){
        this.nome = nome2;
    }

    public void setIdade(int idade2){
        this.idade = idade2;
    }

    //metodo getNome para retorno da String nome
    public String getNome(){
        return this.nome;
    }

    //metodo getIdade para retorno da String idade
    public int getIdade(){
        return this.idade;
    }

    public void emitirSom(){
        System.out.println("Som de mamífero");
    }

    public void mover(){
        System.out.println("Mamífero se movendo");
    }

    
}
