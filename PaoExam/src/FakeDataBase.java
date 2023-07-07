import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FakeDataBase {

    public static void export(List<Salariat_spital> listaAngajati, String numeFisier) {
        try (FileWriter writer = new FileWriter(numeFisier)) {
            // Scriem antetul în fișierul CSV
            writer.append("Nume,Varsta,Salariu\n");

            // Iterăm prin lista de angajați și scriem datele în fișierul CSV
            for (Salariat_spital angajat : listaAngajati) {
                writer.append(angajat.getNume()).append(",")
                        .append(String.valueOf(angajat.getVechime())).append(",")
                        .append(String.valueOf(angajat.getSalariu())).append("\n");
            }

            writer.flush();
            System.out.println("Exportul în format CSV a fost realizat cu succes în fișierul " + numeFisier);
        } catch (IOException e) {
            System.out.println("A apărut o eroare la exportul în format CSV: " + e.getMessage());
        }
    }
}
