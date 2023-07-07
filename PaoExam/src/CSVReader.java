import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static List<Salariat_spital> read(String numeFisier) {
        List<Salariat_spital> listaAngajati = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(numeFisier))) {
            String linie;

            // Trecem peste antetul fișierului CSV
            reader.readLine();

            // Citim fiecare linie din fișierul CSV
            while ((linie = reader.readLine()) != null) {
                String[] date = linie.split(",");
                if (date.length == 3) {
                    String nume = date[0].trim();
                    int salariu = Integer.parseInt(date[1].trim());
                    int vechime = Integer.parseInt(date[2].trim());
                    Salariat_spital angajat = new Salariat_spital(nume, salariu, vechime);
                    listaAngajati.add(angajat);
                }
            }

            System.out.println("Citirea din fișierul CSV a fost realizată cu succes.");
        } catch (IOException e) {
            System.out.println("A apărut o eroare la citirea din fișierul CSV: " + e.getMessage());
        }

        return listaAngajati;
    }
}
