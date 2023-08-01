// Programa Principal
public class Main {
    public static void main(String[] args) {
        // Teste dos métodos implementados
        Cachorros cachorro1 = new Cachorros("Thor", "Golden", 5);
        cachorro1.emitirSom();
        cachorro1.mover();
        System.out.println(cachorro1.getNome());
        System.out.println(cachorro1.getIdade());
        cachorro1.abanarRabo();

        Passaros passaro1 = new Passaros("Passarinho", 3, "Amarelo");
        passaro1.emitirSom();
        System.out.println(passaro1.getIdade());
        System.out.println(passaro1.getNome());
        passaro1.voar();
        System.out.println(passaro1.getCor());
        passaro1.construirNinho();
    }
}
