public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc=100;
    private int dostepneMiejsca=0;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Wydarzenie(String data, String nazwa, double cena) {
        this.data = data;
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Wydarzenie(String data, String nazwa, String miejsce, double cena) {
        this.data = data;
        this.nazwa = nazwa;
        this.miejsce = miejsce;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }

    public int getDostepneMiejsca() {
        return dostepneMiejsca;
    }

    public void setDostepneMiejsca(int dostepneMiejsca) {
        this.dostepneMiejsca = dostepneMiejsca;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    public String toString() {
        return this.nazwa+ " "+this.data+" "+this.miejsce;
    }
    public boolean zarezerwujMiejsce(){
        if(dostepneMiejsca<=0){
            System.out.println("Brak dostępnyc miejsc");
            return false;
        }
        dostepneMiejsca--;
        System.out.println("Zarezerwowano miejsce");
        return true;
    }
}
