package Sistema;

public class Fachada {

    Sistema sistema;

    Fachada(){
        this.sistema = new Sistema();
    }

    public void criaProd(int id, String nome, String fabricante, double preco){
        sistema.criaProd(id, nome, fabricante, preco);
    }

    public void criaLote(int id, int qtd, String dataV, int idProd){
        sistema.criaLote(id, qtd, dataV, idProd);
    }
}
