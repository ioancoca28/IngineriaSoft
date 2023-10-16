public class Pagina {

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    int nr;
    String text;

    public Pagina(String text, int nr) {
        super();
        this.nr = nr;
        this.text = text;
    }


}
