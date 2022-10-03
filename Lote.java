public class Lote{
    int qtd;
    String dataV;
    Produto produto;

    Lote(int qtd, String dataV, Produto produto){
        this.qtd = qtd;
        this.produto = produto;
        this.dataV = dataV;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getDataV() {
        return dataV;
    }

    public void setDataV(String dataV) {
        this.dataV = dataV;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Lote{" +
                "qtd=" + qtd +
                ", dataV=" + dataV +
                ", produto=" + produto +
                '}';
    }
}