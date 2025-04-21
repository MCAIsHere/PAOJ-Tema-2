package Ex_2;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public final class Card extends MetodaPlata {
    private String CVV;
    private LocalDate data_expirare;

    public Card(String CVV, LocalDate data_expirare) {
        this.CVV = CVV;
        this.data_expirare = data_expirare;
    }
    public boolean valideazaCard() {
        return CVV != null && CVV.matches("\\d{3}") &&
                data_expirare.isAfter(LocalDate.now());
    }

    @Override
    public void plateste(double suma) {
        System.out.println("Plata cu cardul: " + suma + " RON");
    }
}
