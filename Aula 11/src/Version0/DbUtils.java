package Version0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbUtils {

    public  void criarDB()
    {

        Connection c = null;  //Objeto necessario para criar uma conexao com o bd
        Statement stmt = null; //Objeto necessario para excutar operaçoes no BD
        try { // bloco para controle de excecoes
            Class.forName("org.sqlite.JDBC");  //Usado para indicar o driver que deve ser carregado.
            c = DriverManager.getConnection("jdbc:sqlite:teste.db");
            ///Obtem uma CONEXAO COM o BANCO DE DADOS test.db
            /// o banco de dados é criado caso não exita
            ///ou apenas abre uma conexao com o banco existente.
            System.out.println("Banco Exitente e conectado!");

            stmt = c.createStatement();
            /// a conexao objeto "c" cria um canal de comunicao com meu banco
            /// para realizar operacoes no banco devemos usar um objeto Statement ou PreparedStatement
            /// nas proximas aulas
            String sql = "CREATE TABLE ALUNO " +
                    "(ID  INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                    " NOME           TEXT    NOT NULL, " +
                    " IDADE            INT     NOT NULL, " +
                    " CODIGO        CHAR(50), " +
                    " SALARIO         REAL)";
            /// Criaçao das tabelas por meio de uma String
            stmt.executeUpdate(sql); /// execuçao do comando no BD
            stmt.close(); // Fechamento da comunicacao
            c.close(); //fechamento da conexao.
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
        System.out.println("TABELA CRIADA");
    }

    public  void dropTable()
    {

        Connection c = null;  //Objeto necessario para criar uma conexao com o bd
        Statement stmt = null; //Objeto necessario para excutar operaçoes no BD
        try { // bloco para controle de excecoes
            Class.forName("org.sqlite.JDBC");  //Usado para indicar o driver que deve ser carregado.
            c = DriverManager.getConnection("jdbc:sqlite:teste.db");
            ///Obtem uma CONEXAO COM o BANCO DE DADOS test.db
            /// o banco de dados é criado caso não exita
            ///ou apenas abre uma conexao com o banco existente.
            System.out.println("Banco Exitente e conectado!");

            stmt = c.createStatement();
            /// a conexao objeto "c" cria um canal de comunicao com meu banco
            /// para realizar operacoes no banco devemos usar um objeto Statement ou PreparedStatement
            /// nas proximas aulas
            String sql = "DROP TABLE IF EXISTS ALUNO ";
            /// Criaçao das tabelas por meio de uma String
            stmt.executeUpdate(sql); /// execuçao do comando no BD
            stmt.close(); // Fechamento da comunicacao
            c.close(); //fechamento da conexao.
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
        System.out.println("TABELA Apagada");
    }
}
