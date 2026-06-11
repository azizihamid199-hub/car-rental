public class Vehicle {
    private String id;
    private String marke;
    private String modell;
    private double preisProTag;
    private boolean istVermietet;

    // Konstruktor
    public Vehicle(String id, String marke, String modell, double preisProTag) {
        this.id = id;
        this.marke = marke;
        this.modell = modell;
        this.preisProTag = preisProTag;
        this.istVermietet = false; // Standardmäßig ist das Auto frei
    }

    // Getter und Setter (Datenkapselung)
    public String getId() { return id; }
    public String getMarke() { return marke; }
    public String getModell() { return modell; }
    public double getPreisProTag() { return preisProTag; }

    public boolean isVermietet() { return istVermietet; }
    public void setVermietet(boolean istVermietet) { this.istVermietet = istVermietet; }

    // Gibt die Fahrzeugdetails sauber formatiert zurück
    public String getDetails() {
        String status = istVermietet ? "🔴 Vermietet" : "🟢 Verfügbar";
        return String.format("[%s] %s %s (%s) - %.2f€/Tag", id, marke, modell, status, preisProTag);
    }
}