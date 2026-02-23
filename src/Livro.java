public class Livro implements Calculavel{

    @Override
    public double calcularPrecoFinal(double preco){
        double desconto = 0.05;
        double livro = preco - (preco * desconto);
        return livro;
    }

}
