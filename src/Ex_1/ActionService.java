package Ex_1;

public class ActionService {
    public String showActions(Object obiect){
        if (obiect instanceof PoateSterge){
            return "Poate sterge.";
        } else if (obiect instanceof PoateEdita) {
            return "Poate edita.";
        } else if (obiect instanceof PoateVizualiza) {
            return "Poate vizualiza.";
        }
        return null;
    }
}
