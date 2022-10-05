package Sistema.Repository;

public class Produto{
    String nome;
    String fabricante;
    double preco;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    Produto(String nome, String fabricante, double preco){
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }
}