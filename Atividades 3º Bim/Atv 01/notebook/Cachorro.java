public class Cachorros extends Mamiferos{
    private String raca; //atributo raca

    public Cachorros(String raca2, String nome, int idade){
        super(nome, idade);
        this.raca = raca2;
    }

    public String getRaca(){
        return this.raca;
    }

    public void setRaca(String raca2){
        this.raca = raca2;
    }

    public void abanarRabo(){
        System.out.println("O cachorro está abanando o rabo.");
    }
}
