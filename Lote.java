public class Lote{
    Int qtd;
    date dataV;
    produto produto;

    private Lote(int qtd, date dataV, produto produto){
        this.qtd = qtd;
        this.produto = produto;
        this.dataV = dataV;
    }
}