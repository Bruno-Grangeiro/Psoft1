package Sistema.Repository;

import java.util.HashMap;
import java.util.Map;

public class LotesRepository {

    private Map<Integer, Lote> mapLote;

    public LotesRepository(){
        this.mapLote = new HashMap<Integer, Lote>();
    }

    public void newLote(int id, int qtd, String dataV, Produto produto) {
        this.mapLote.put(id, new Lote(qtd, dataV, produto));
    }
}
