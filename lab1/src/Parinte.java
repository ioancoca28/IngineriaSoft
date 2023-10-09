public class Parinte {


    String nume;

    public Parinte(String nume){
        this.nume=nume;
    }

    public  String getName() {
        return nume;
    }

    public void afiseaza(){
        System.out.println("Numele parintelui este: " + nume);
    }

}
