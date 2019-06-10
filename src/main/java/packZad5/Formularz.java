package packZad5;

public class Formularz {

    private int wiek;
    private int wzrost;
    private boolean czyKobieta;
    private int zarobki;
    private boolean czyMaPsa;
    private int rozmiarButa;

    public Formularz(int wiek, int wzrost, boolean czyKobieta, int zarobki, boolean czyMaPsa, int rozmiarButa) {
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.czyKobieta = czyKobieta;
        this.zarobki = zarobki;
        this.czyMaPsa = czyMaPsa;
        this.rozmiarButa = rozmiarButa;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public void setCzyKobieta(boolean czyKobieta) {
        this.czyKobieta = czyKobieta;
    }

    public void setZarobki(int zarobki) {
        this.zarobki = zarobki;
    }

    public void setCzyMaPsa(boolean czyMaPsa) {
        this.czyMaPsa = czyMaPsa;
    }

    public void setRozmiarButa(int rozmiarButa) {
        this.rozmiarButa = rozmiarButa;
    }

    @Override
    public String toString() {
        return "Formularz{" +
                "wiek=" + wiek +
                ", wzrost=" + wzrost +
                ", czyKobieta=" + czyKobieta +
                ", zarobki=" + zarobki +
                ", czyMaPsa=" + czyMaPsa +
                ", rozmiarButa=" + rozmiarButa +
                '}';
    }

    public String zwrocWFormacie() {
        return "\n--------\n" + "wiek=" + wiek + "\n" +
                ", wzrost=" + wzrost + "\n" +
                ", czyKobieta=" + czyKobieta + "\n" +
                ", zarobki=" + zarobki + "\n" +
                ", czyMaPsa=" + czyMaPsa + "\n" +
                ", rozmiarButa=" + rozmiarButa;
    }
}
