package Sistema.Repository;

import java.util.HashMap;
import java.util.Map;

public class ProdutosRepository {
    private Map<Integer, Produto> mapProd;

    public ProdutosRepository(){
        this.mapProd = new HashMap<Integer, Produto>();
    }
    public void newProd(int id, String nome, String fabricante, double preco) {
        this.mapProd.put(id, new Produto(nome, fabricante, preco));
    }

    public Produto getProd(int idProduto){
        return this.mapProd.get(idProduto);
    }
}
