import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Salariat_spital> listaAngajatilor= new ArrayList<Salariat_spital>();
        listaAngajatilor.add(new Salariat_spital("Sandel",2000,5));
        listaAngajatilor.add(new Salariat_spital("Ionel",2000,5));
        listaAngajatilor.add(new Salariat_spital("Fanel",2000,5));
        listaAngajatilor.add(new Salariat_spital("Gigel",2000,5));
        listaAngajatilor.add(new Medic("Sinesteziu",2000,5,"psihiatru"));

        Scanner scanner = new Scanner(System.in);

        int optiune=0;
        while (optiune!=5) {



            System.out.println("\n--- Meniu ---");
            System.out.println("1. Adăugare angajat");
            System.out.println("2. Vizualizare angajați");
            System.out.println("3. Actualizare angajat");
            System.out.println("4. Ștergere angajat");
            System.out.println("5. Ieșire");
            System.out.println("6. SAVE");
            System.out.println("7. Incarca lista actualizata");


            System.out.print("Selectați o opțiune: ");
            optiune = scanner.nextInt();
            scanner.nextLine(); // Consumăm linia goală

            switch (optiune) {
                case 1:
                    Servicii.adaugareAngajat(listaAngajatilor);
                    break;
                case 2:
                    Servicii.vizualizareAngajati(listaAngajatilor);
                    break;
                case 3:
                    Servicii.actualizareAngajat(listaAngajatilor);
                    break;
                case 4:
                    Servicii.stergereAngajat(listaAngajatilor);
                    break;
                case 5:
                    System.out.println("Programul s-a încheiat.");
                    break;
                case 6:
                    FakeDataBase.export(listaAngajatilor,"Lista actualizata a angajatilor");
                    System.out.println("SAVED");
                    break;
                case 7:
                    listaAngajatilor=CSVReader.read("Lista actualizata a angajatilor");
                    System.out.println("In developing");
                    break;
                default:
                    System.out.println("Opțiune invalidă!");
            }
        }

        scanner.close();



    }
}