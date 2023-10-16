public class CarteRezultat {

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    String titlu;
    int nr;

    public CarteRezultat(String titlu, int nr){
        this.titlu=titlu;
        this.nr=nr;
    }

}
