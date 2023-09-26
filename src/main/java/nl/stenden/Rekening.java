package nl.stenden;

/**
 * Simpele data klasse om mee te werken
 */
public class Rekening {

    private String rekeningNummer;

    private double bedrag;

    public String getRekeningNummer() {
        return rekeningNummer;
    }

    public void setRekeningNummer(String rekeningNummer) {
        this.rekeningNummer = rekeningNummer;
    }

    public double getBedrag() {
        return bedrag;
    }

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    public String getEigenaar() {
        return eigenaar;
    }

    public void setEigenaar(String eigenaar) {
        this.eigenaar = eigenaar;
    }

    private String eigenaar;

    public Rekening(String rekeningNummer, double bedrag, String eigenaar) {
        this.rekeningNummer = rekeningNummer;
        this.bedrag = bedrag;
        this.eigenaar = eigenaar;
    }
}
