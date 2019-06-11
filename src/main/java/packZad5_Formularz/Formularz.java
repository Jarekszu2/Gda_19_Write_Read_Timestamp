package packZad5_Formularz;

/*
Stwórz klasę formularz. Formularz reprezentuje odpowiedzi których udzielił użytkownik.Aplikacja ma po uruchomieniu rozpocząć od zadawania pytań użytkownikowi. Po wpisaniudanych(odpowiedzi na pytania) zapisz te odpowiedzi do pliku (output_form.txt) wodpowiednim formacie (przez format mamy na myśli zawartość - np. oddziel pytania iodpowiedzi tak, aby byly pisane w nowych liniach). Poproś użytkownika o: wiek, wzrost, płeć(kobieta/mezczyzna), zarobki i zadaj dwa dodatkowe pytania. Po czynności zamknij plik iprogram
 */
public class Formularz {

    private int wiek;
    private int wzrost;
    private boolean czyKobieta;
    private int zarobki;
    private boolean czyMaPsa;
    private int rozmiarButa;

    public Formularz() {
    }

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

    public void parsujLinie(String linia) {
        String[] elementy = linia.split("=");
        switch (elementy[0]) {
            case "wiek":
                setWiek(Integer.parseInt(elementy[1]));
                break;
            case "wzrost":
                setWzrost(Integer.parseInt(elementy[1]));
                break;
            case "czyKobieta":
                setCzyKobieta(Boolean.parseBoolean(elementy[1]));
                break;
            case "zarobki":
                setZarobki(Integer.parseInt(elementy[1]));
                break;
            case "czyMaPsa":
                setCzyMaPsa(Boolean.parseBoolean(elementy[1]));
                break;
            case "rozmiarButa":
                setRozmiarButa(Integer.parseInt(elementy[1]));
                break;
        }
    }

    public String zwrocWFormacie() {
        return "wiek=" + wiek + "\n" +
                "wzrost=" + wzrost + "\n" +
                "czyKobieta=" + czyKobieta + "\n" +
                "zarobki=" + zarobki + "\n" +
                "czyMaPsa=" + czyMaPsa + "\n" +
                "rozmiarButa=" + rozmiarButa;
    }
}
