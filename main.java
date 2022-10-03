public class main{
    public static void main(String[] args) {

        Produto p = new Produto("teste", "aoba", 5.5);
        Lote l = new Lote(10, "22-05-2022", p);

        System.out.println(l);
    }
}
