public class main{
    public static void main(String[] args) {

        Produto p = new Produto('teste', 'aoba', 5.5);
        Lote l = new Lote(10, new Date(2022,02,05), p);

    }
}
