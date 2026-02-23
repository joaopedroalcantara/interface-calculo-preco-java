public class Teste extends ProdutoFisico{
    public static void main(String[] args) {

        ProdutoFisico produto1 = new ProdutoFisico();
        System.out.println("O valor do Produto com a taxa ficou de: " + produto1.calcularPrecoFinal(30) + " Reais.");

    }
}
