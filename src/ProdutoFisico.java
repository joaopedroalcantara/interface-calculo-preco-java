public class ProdutoFisico implements Calculavel{

    @Override
    public double calcularPrecoFinal(double preco){
        double taxa = 0.10;
        double produto = preco + (preco * taxa);
        return produto;
    }

}
