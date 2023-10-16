
public class Main {
    public static void main(String[] args) {

        Pagina pagina = new Pagina("Ana da", 1);
        Pagina pagina1 = new Pagina("dada", 2);
        Pagina pagina2 = new Pagina("ssss", 3);

        Carte carte = new Carte("Caine", "Ion");
        carte.adaugaPagina(pagina);
        Carte carte1 = new Carte("Pisica", "Andrei");
        carte1.adaugaPagina(pagina1);
        Carte carte2 = new Carte("Soarece", "Ghita");
        carte2.adaugaPagina(pagina2);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adaugaCarte(carte);
        biblioteca.adaugaCarte(carte1);
        biblioteca.adaugaCarte(carte2);
        biblioteca.afiseazaBiblioteca();

        System.out.println("Sortarea cartilor este: ");
        biblioteca.sortareCarti();
        biblioteca.afiseazaBiblioteca();

        for(CarteRezultat data: biblioteca.cautaFraza("Ana"))
            System.out.println("Titlu: " + data.titlu);

    }
}