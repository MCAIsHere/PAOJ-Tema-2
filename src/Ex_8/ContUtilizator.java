package Ex_8;

public class ContUtilizator {
    private String id;
    private String username;
    private NivelAcces acces;

    public ContUtilizator(String id, String username, NivelAcces acces){
        this.id = id;
        this.username = username;
        this.acces = acces;
    }

    public String toString(){
        return username;
    }
    public NivelAcces getNivelAcces(){ return acces;}
}
