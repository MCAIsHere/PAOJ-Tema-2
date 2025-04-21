package Ex_2;

public final class TransferBancar extends MetodaPlata {
    public String IBAN;

    public TransferBancar (String IBAN){
        this.IBAN = IBAN;
    }
    public boolean verificare_IBAN(){
        return IBAN.matches("\\d{16}");
    }
    @Override
    public void plateste(double suma){
        System.out.println("Plata transfer bancar: " + suma + " RON");
    }
}
