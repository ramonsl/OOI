package Version0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by ramon on 19/10/16.
 */
public class DbHelper {


    public void insert(){
        Connection c = null;
        Statement stmt = null;
        String sql=null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:teste.db");
            System.out.println("Conectado");
            stmt = c.createStatement();
            c.setAutoCommit(false);
             sql = "INSERT INTO ALUNO (NOME,IDADE,CODIGO,SALARIO) " +
                    "VALUES ('Ramon', 32, '021131000', 2000 );";
            stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.err.println(sql);
            System.exit(0);
        }
        System.out.println("Inserido com Sucesso");
    }

    public void update(){
        Connection c = null;
        Statement stmt = null;
        String sql=null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:teste.db");
            System.out.println("Conectado");
                    stmt = c.createStatement();
            c.setAutoCommit(false);
            sql = "UPDATE ALUNO set SALARIO = 25000.00 where ID=1";
            stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.err.println(sql);
            System.exit(0);
        }
        System.out.println("Atualizado com Sucesso");
    }

    public void delete(){
        Connection c = null;
        Statement stmt = null;
        String sql=null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:teste.db");
            System.out.println("Conectado");
            stmt = c.createStatement();
            c.setAutoCommit(false);
            sql = "DELETE from ALUNO where ID=1";
            stmt.executeUpdate(sql);
            stmt.close();
            c.commit();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.err.println(sql);
            System.exit(0);
        }
        System.out.println("Removido com Sucesso");
    }

    public void select(){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:teste.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM ALUNO;" );
            while ( rs.next() ) {
                int id = rs.getInt("id");
                String  name = rs.getString("NOME");
                int age  = rs.getInt("IDADE");
                String  codigo = rs.getString("CODIGO");
                float salary = rs.getFloat("salario");
                System.out.println( "ID = " + id );
                System.out.println( "NOME = " + name );
                System.out.println( "IDADE = " + age );
                System.out.println( "CODIGO = " + codigo );
                System.out.println( "SALARIO = " + salary );
                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }


}



