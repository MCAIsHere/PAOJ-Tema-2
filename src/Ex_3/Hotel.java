package Ex_3;
import java.util.HashMap;

public class Hotel {
    private String nume;
    private HashMap<String,Boolean>[] date_rezervari;

    public Hotel (String nume){
        this.nume = nume;
        this.date_rezervari = new HashMap[100];
        for (int i = 0; i < 30; i++) {
            date_rezervari[i] = new HashMap<String, Boolean>();
        }
    }

    public void rezervaLoc(String data, int loc) throws DateInvalideException, LocIndisponibilException{
        if (loc >= 100 || loc < 0) throw new DateInvalideException("Loc nespecificat corespunzator.");
        else if (date_rezervari[loc].get(data) != null && date_rezervari[loc].get(data))
            throw new LocIndisponibilException("Loc indisponibil.");
        date_rezervari[loc].put(data,true);
        System.out.println("Loc " + loc + " rezervat pe data " + data);
    }
}
