import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalSystem system = new RentalSystem();
        Scanner scanner = new Scanner(System.in);

        // Wir fügen der Flotte ein paar Test-Autos hinzu
        system.fahrzeugHinzufuegen(new Vehicle("CAR1", "VW", "Golf 8", 45.00));
        system.fahrzeugHinzufuegen(new Vehicle("CAR2", "Tesla", "Model 3", 89.00));
        system.fahrzeugHinzufuegen(new Vehicle("CAR3", "BMW", "3er", 70.00));

        while (true) {
            System.out.println("\n--- AUTOVERMIETUNG SYSTEM ---");
            System.out.println("1. Flotte anzeigen");
            System.out.println("2. Auto mieten");
            System.out.println("3. Auto zurückgeben");
            System.out.println("4. Beenden");
            System.out.print("Wähle eine Option: ");

            String auswahl = scanner.nextLine();

            if (auswahl.equals("1")) {
                system.alleFahrzeugeAnzeigen();
            } else if (auswahl.equals("2")) {
                System.out.print("Gib die Fahrzeug-ID ein, die du mieten willst: ");
                String id = scanner.nextLine();
                system.fahrzeugMieten(id);
            } else if (auswahl.equals("3")) {
                System.out.print("Gib die Fahrzeug-ID für die Rückgabe ein: ");
                String id = scanner.nextLine();
                system.fahrzeugZurueckgeben(id);
            } else if (auswahl.equals("4")) {
                System.out.println("System beendet. Gute Fahrt!");
                break;
            } else {
                System.out.println("Ungültige Option. Bitte erneut versuchen.");
            }
        }
        scanner.close();
    }
}