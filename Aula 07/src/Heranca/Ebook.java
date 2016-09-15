package Heranca;

/**
 * Criando uma classe nova "ebook"
 */
public class Ebook extends Livro{

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
    public String getWaterMark() {
        return waterMark;
    }


    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        } else {
           // this.setValor(6);

            this.setValor( this.getValor() - this.getValor() * porcentagem);
            return true;
        }
    }
}

