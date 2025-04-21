package Ex_8;

public enum NivelAcces {
    ADMIN(1,"Acces complet"), EDITOR(2,"Acces la editare"), USER(3,"Acces la vizualizare"), GUEST(4, "Acces limitat la vizualizare");

    private final Integer valoare;
    private final String descriere;
    private NivelAcces(Integer valoare, String descriere){
        this.valoare = valoare;
        this.descriere = descriere;
    }

    public String getDescriere(){
        return descriere;
    }

    public Integer getCod(){
        return valoare;
    }

    public NivelAcces NivelAccesdinCod(int cod){
        return switch (cod) {
            case 1 -> ADMIN;
            case 2 -> EDITOR;
            case 3 -> USER;
            case 4 -> GUEST;
            default -> null;
        };
    }
}
