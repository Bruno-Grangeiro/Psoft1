package Sistema.Repository;

public class Lote{
    int qtd;
    String dataV;
    Produto produto;

    Lote(int qtd, String dataV, Produto produto){
        this.qtd = qtd;
        this.produto = produto;
        this.dataV = dataV;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Sistema.Repository.Lote{" +
                "qtd=" + qtd +
                ", dataV=" + dataV +
                ", produto=" + produto +
                '}';
    }
}