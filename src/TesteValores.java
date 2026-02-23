public class TesteValores extends Livro{
    public static void main(String[] args) {


        Livro livro1 = new Livro();
        System.out.println("O valor do livro com o desconto ficou de: " + livro1.calcularPrecoFinal(20) + " Reais.");
    }
}
