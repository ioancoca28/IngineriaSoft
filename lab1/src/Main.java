import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Parinte> parinti = new ArrayList<>();

        parinti.add(new Parinte("Andrei"));
        parinti.add(new Parinte("Vasile"));
        parinti.add(new Parinte("George"));
        parinti.add(new Parinte("Matei"));
        parinti.add(new Copil("vhita"));


        parinti.sort(new Comparator<Parinte>() {
            @Override
            public int compare(Parinte o1, Parinte o2) {
                return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
            }
        });

        for (int i = 0; i < parinti.size(); i++) {

            Parinte par = parinti.get(i);
            par.afiseaza();

        }
    }
}