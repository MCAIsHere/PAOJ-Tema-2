package Ex_2;

public sealed abstract class MetodaPlata permits Card, Cash, TransferBancar{
    public abstract void plateste(double suma);

    public static void proceseazaPlata(MetodaPlata metoda, double suma) {
        if (metoda instanceof Card card) {
            if (card.valideazaCard()){
                card.plateste(suma);
            } else {
                System.out.println("Card invalid.");
            }
        } else if (metoda instanceof Cash cash) {
            cash.plateste(suma);
        } else if (metoda instanceof TransferBancar transfer) {
            if (transfer.verificare_IBAN()) {
                transfer.plateste(suma);
            } else {
                System.out.println("IBAN invalid.");
            }
        }
    }
}
