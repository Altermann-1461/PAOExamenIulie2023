import java.util.List;
import java.util.Scanner;

public class Servicii {
    public static void adaugareAngajat(List<Salariat_spital> listaAngajati) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți numele angajatului: ");
        String nume = scanner.nextLine();

        System.out.print("Introduceți vârsta angajatului: ");
        int varsta = scanner.nextInt();
        scanner.nextLine(); // Consumăm linia goală

        System.out.print("Introduceți salariul angajatului: ");
        int salariu = scanner.nextInt();
        scanner.nextLine(); // Consumăm linia goală

        Salariat_spital angajat = new Salariat_spital(nume, varsta, salariu);
        listaAngajati.add(angajat);

        System.out.println("Angajatul a fost adăugat cu succes!");

    }

    public static void vizualizareAngajati(List<Salariat_spital> listaAngajati) {
        System.out.println("--- Lista angajați ---");

        if (listaAngajati.isEmpty()) {
            System.out.println("Nu există angajați înregistrati.");
        } else {
            for (Salariat_spital angajat : listaAngajati) {
                System.out.println("Nume: " + angajat.getNume());
                System.out.println("Vechime: " + angajat.getVechime());
                System.out.println("Salariu: " + angajat.getSalariu());
                System.out.println("---------------------");
            }
        }
    }

    public static void actualizareAngajat(List<Salariat_spital> listaAngajati) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți numele angajatului de actualizat: ");
        String numeCautat = scanner.nextLine();

        boolean angajatGasit = false;

        for (Salariat_spital angajat : listaAngajati) {
            if (angajat.getNume().equalsIgnoreCase(numeCautat)) {
                System.out.print("Introduceți noul nume: ");
                String numeNou = scanner.nextLine();
                angajat.setNume(numeNou);

                System.out.print("Introduceți noua vechime: ");
                int varstaNoua = scanner.nextInt();
                scanner.nextLine(); // Consumăm linia goală
                angajat.setVechime(varstaNoua);

                System.out.print("Introduceți noul salariu: ");
                int salariuNou = scanner.nextInt();
                scanner.nextLine(); // Consumăm linia goală
                angajat.setSalariu(salariuNou);

                System.out.println("Angajatul a fost actualizat cu succes!");
                angajatGasit = true;
                break;
            }
        }

        if (!angajatGasit) {
            System.out.println("Angajatul nu a fost găsit.");
        }

    }

    public static void stergereAngajat(List<Salariat_spital> listaAngajati) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți numele angajatului de șters: ");
        String numeCautat = scanner.nextLine();

        boolean angajatGasit = false;

        for (Salariat_spital angajat : listaAngajati) {
            if (angajat.getNume().equalsIgnoreCase(numeCautat)) {
                listaAngajati.remove(angajat);
                System.out.println("Angajatul a fost șters cu succes!");
                angajatGasit = true;
                break;
            }
        }

        if (!angajatGasit) {
            System.out.println("Angajatul nu a fost găsit.");
        }

    }
}
