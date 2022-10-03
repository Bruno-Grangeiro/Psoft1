public class Produto{
    String nome;
    String fabricante;
    double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPreco() {
        return preco;
    }

    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", preco=" + preco +
                '}';
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    Produto(String nome, String fabricante, double preco){
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }
}