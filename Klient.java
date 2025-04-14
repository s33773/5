import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji = new ArrayList<>();

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }
    public boolean dodajRezerwacje(Wydarzenie wydarzenie) {
        listaRezerwacji.add(wydarzenie);
        return true;
    }
    public void wyswietlRezerwacje() {
        for(Wydarzenie wydarzenie:listaRezerwacji){
            System.out.println(wydarzenie.toString());
        }
    }
    public void anulujRezerwacje(Wydarzenie wydarzenie) {
        listaRezerwacji.remove(wydarzenie);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}