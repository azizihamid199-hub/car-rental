import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Vehicle> fahrzeuge;

    public RentalSystem() {
        this.fahrzeuge = new ArrayList<>();
    }

    // Auto zum System hinzufügen
    public void fahrzeugHinzufuegen(Vehicle fahrzeug) {
        fahrzeuge.add(fahrzeug);
    }

    // Alle Autos anzeigen
    public void alleFahrzeugeAnzeigen() {
        if (fahrzeuge.isEmpty()) {
            System.out.println("Keine Fahrzeuge im System.");
            return;
        }
        System.out.println("\n--- UNSERE FLOTTE ---");
        for (Vehicle v : fahrzeuge) {
            System.out.println(v.getDetails());
        }
    }

    // Ein Auto mieten
    public boolean fahrzeugMieten(String id) {
        for (Vehicle v : fahrzeuge) {
            if (v.getId().equalsIgnoreCase(id)) {
                if (!v.isVermietet()) {
                    v.setVermietet(true);
                    System.out.println("Erfolg: " + v.getMarke() + " " + v.getModell() + " wurde erfolgreich gemietet!");
                    return true;
                } else {
                    System.out.println("Fehler: Dieses Fahrzeug ist bereits vermietet.");
                    return false;
                }
            }
        }
        System.out.println("Fehler: Fahrzeug-ID nicht gefunden.");
        return false;
    }

    // Ein Auto zurückgeben
    public boolean fahrzeugZurueckgeben(String id) {
        for (Vehicle v : fahrzeuge) {
            if (v.getId().equalsIgnoreCase(id)) {
                if (v.isVermietet()) {
                    v.setVermietet(false);
                    System.out.println("Erfolg: " + v.getMarke() + " " + v.getModell() + " wurde zurückgegeben.");
                    return true;
                } else {
                    System.out.println("Fehler: Dieses Fahrzeug war gar nicht vermietet.");
                    return false;
                }
            }
        }
        System.out.println("Fehler: Fahrzeug-ID nicht gefunden.");
        return false;
    }
}