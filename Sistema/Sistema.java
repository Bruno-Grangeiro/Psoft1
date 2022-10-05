package Sistema;

import Sistema.Repository.LotesRepository;
import Sistema.Repository.Produto;
import Sistema.Repository.ProdutosRepository;

public class Sistema {

    private LotesRepository lotesRep;
    private ProdutosRepository prodRep;

    Sistema(){
        this.lotesRep = new LotesRepository();
        this.prodRep = new ProdutosRepository();
    }

    public void criaProd(int id, String nome, String fabricante, double preco) {
        this.newProd(id, nome, fabricante, preco);
    }

    private void newProd(int id, String nome, String fabricante, double preco){
        this.prodRep.newProd(id, nome, fabricante, preco);
    }

    public void criaLote(int id, int qtd, String dataV, int idProduto){
        this.newLote(id, qtd, dataV, idProduto);
    }

    private void newLote(int id, int qtd, String dataV, int idProduto){
        this.lotesRep.newLote(id, qtd, dataV, prodRep.getProd(idProduto));
    }
}
