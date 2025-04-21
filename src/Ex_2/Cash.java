package Ex_2;

public final class Cash extends MetodaPlata {
    @Override
    public void plateste(double suma){
        System.out.println("Plata cash instanta: " + suma + " RON");
    }
}
