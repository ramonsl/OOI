package Version0;

public class Main {
    public static void main(String[] args) {
        DbUtils bd = new DbUtils();
       // bd.dropTable();
        //bd.criarDB();

        DbHelper operacoes = new DbHelper();
        operacoes.insert();
        operacoes.update();
        operacoes.delete();
        operacoes.select();
    }
}
