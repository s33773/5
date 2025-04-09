import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> listaRezerwacji=new ArrayList<>();
    private ArrayList<Klient> listaKlientow=new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        listaRezerwacji.add(wydarzenie);
    }
    public void dodajWydarzenie(String nazwa, double cena){
        Wydarzenie wydarzenie= new Wydarzenie(nazwa, cena);
        listaRezerwacji.add(wydarzenie);
    }
    public void dodajKlienta(Klient klient){
        listaKlientow.add(klient);
    }
    public void dodajKlienta(String imie, String nazwisko){
        Klient klient=new Klient(imie, nazwisko);
        listaKlientow.add(klient);
    }
    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        this.listaKlientow.add(klient);
        this.listaRezerwacji.add(wydarzenie);
        wydarzenie.zarezerwujMiejsce();
    }



    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for(Wydarzenie wydarzenie: listaRezerwacji){
            if(wydarzenie.getNazwa().equals(nazwa)){
                return wydarzenie;
            }
        }
        return null;
    }
    public Klient znajdzKlienta(String nazwisko) {
        for(Klient klient: listaKlientow) {
            if (klient.getNazwisko().equals(nazwisko)) {
                return klient;
            }
        }
        return null;
    }
    public void zmienCeneWydarzenia(String nazwa, double nowaCena){
        Wydarzenie wydarzenie=znajdzWydarzenie(nazwa);
        if(wydarzenie==null){
            throw new IllegalArgumentException("Wydarzenie nie istnieje");
        }
        wydarzenie.setCena(nowaCena);
    }
}
