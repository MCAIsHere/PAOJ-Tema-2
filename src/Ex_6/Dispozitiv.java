package Ex_6;

public interface Dispozitiv {
    default void status(){
        System.out.println("Dispozitivul este in stand-by.");
        utilizat_de_status();
    }
    void porneste();
    void opreste();
    static void descriereGenerala(String cuvant){
        System.out.println("Descrierea " + cuvant + ".");
    }
    private void utilizat_de_status(){
        System.out.println("Metoda apelata intern.");
    }
}
