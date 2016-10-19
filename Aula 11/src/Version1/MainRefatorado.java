package Version1;

/**
 * Created by ramon on 19/10/16.
 */
public class MainRefatorado {
    public static void main(String[] args) {
        DbUtils banco = new DbUtils();
        banco.criarDB();

        //DbHelper sqlLite= new DbHelper();
        //sqlLite.executarSQL("INSERT NTO ALUNO (NOME,IDADE,CODIGO,SALARIO) VALUES ('Ramon', 32, '021131000', 200 )");

        Aluno a= new Aluno("Sadi",34,"0034",30.0);
        AlunoDao daoAluno = new AlunoDao();
        daoAluno.save(a);
        daoAluno.list();
    }
}
