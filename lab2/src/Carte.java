import java.util.ArrayList;
import java.util.List;

public class Carte {

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    String autor;

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    String titlu;

    public List<Pagina> getPagini() {
        return pagini;
    }

    public void setPagini(List<Pagina> pagini) {
        this.pagini = pagini;
    }

    List<Pagina> pagini;

    public Carte() {
        this.autor = autor;
        this.titlu = titlu;
        this.pagini = pagini;
    }

    public Carte(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
        pagini = new ArrayList<Pagina>();
    }

    public void adaugaPagina(Pagina pagina) {
        pagini.add(pagina);
    }

    public void stergPagina(Pagina pagina) {
        pagini.remove(pagina);
    }

    public void afiseazaCarte() {

        System.out.println(" ");
        System.out.println("Numele autorului este: " + autor);
        System.out.println("Numele cartii este: " + titlu);
        System.out.println("Numarul de pagini: " + pagini.size());
        System.out.println(" ");

    }
}
