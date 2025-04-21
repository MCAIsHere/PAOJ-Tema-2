package Ex_7;

public class Produs {
    private String cod;
    private String nume;
    private Double pret;

    public Produs(String cod, String nume, Double pret){
        this.cod = cod;
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public String toString(){
        return nume + " (cod: " + cod + ")";
    }

    @Override
    public boolean equals(Object u){
        if (u == this) return true;
        if (!(u instanceof Produs)) return false;

        Produs v = (Produs) u;
        return this.cod.equals(v.cod);
    }

    @Override
    public int hashCode(){
        return (int) cod.hashCode() * nume.hashCode() * pret.hashCode();
    }
}
