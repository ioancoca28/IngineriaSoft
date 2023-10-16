import java.util.*;

public class Biblioteca {

    List<Carte> carti;

    public Biblioteca() {
        this.carti = new ArrayList<Carte>();
    }

    public Biblioteca(List<Carte> carti) {
        this.carti = carti;
    }

    public List<Carte> getCarti() {
        return carti;
    }

    public void setCarti(List<Carte> carti) {
        this.carti = carti;
    }

    public void adaugaCarte(Carte carte) {
        carti.add(carte);
    }

    public void sortareCarti() {
        Collections.sort(carti, new Comparator<Carte>() {
            @Override
            public int compare(Carte o1, Carte o2) {
                int rezCompareAutor = o1.getAutor().toLowerCase().compareTo(o2.getAutor().toLowerCase());
                if (rezCompareAutor != 0)
                    return rezCompareAutor;
                int rezComparreAutor = o1.getTitlu().toLowerCase().compareTo(o2.getTitlu().toLowerCase());
                return rezComparreAutor;
            }
        });

    }

    public List<CarteRezultat> cautaFraza(String fraza) {
        List<CarteRezultat> titluSiNrPag = new ArrayList<CarteRezultat>();
        for (Carte carte : carti)
            for (Pagina pagina : carte.getPagini())
                if (pagina.getText().contains(fraza)) {
                    titluSiNrPag.add(new CarteRezultat(carte.titlu, pagina.nr));
                }

        return titluSiNrPag;
    }


    public void afiseazaBiblioteca() {
        for (Carte carte : carti) {
            carte.afiseazaCarte();
        }
    }
}

