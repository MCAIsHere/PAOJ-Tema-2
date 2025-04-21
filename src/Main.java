import Ex_1.*;
import Ex_2.*;
import Ex_3.DateInvalideException;
import Ex_3.Hotel;
import Ex_3.LocIndisponibilException;
import Ex_4.*;
import Ex_5.*;
import Ex_6.Dispozitiv;
import Ex_6.Smartwatch;
import Ex_6.Telefon;
import Ex_6.Televizor;
import Ex_7.Produs;
import Ex_8.ContUtilizator;
import Ex_8.NivelAcces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws DateInvalideException, LocIndisponibilException {
        // Ex1
        ActionService serviciu = new ActionService();

        Editor editor = new Editor();
        Vizitator vizitator = new Vizitator();

        System.out.println(serviciu.showActions(editor));
        System.out.println(serviciu.showActions(vizitator));

        //
        System.out.println("-------------------------");
        // Ex2
        MetodaPlata card = new Card("123", LocalDate.of(2025, 11, 25));
        MetodaPlata cash = new Cash();
        MetodaPlata transfer = new TransferBancar("1249112317915455");

        TransferBancar.proceseazaPlata(card, 100.0);
        TransferBancar.proceseazaPlata(cash, 50.0);
        TransferBancar.proceseazaPlata(transfer, 250.0);

        //
        System.out.println("-------------------------");
        // Ex3
        Hotel hotel = new Hotel("Carol");
        hotel.rezervaLoc("13-02",9);
        hotel.rezervaLoc("13-01", 6);

        //
        System.out.println("-------------------------");
        // Ex4
        SistemExistent sistem = new SistemExistent();
        AdaptorJsonToXml adaptor = new AdaptorJsonToXml(sistem);

        String json = sistem.genereazaJSON();
        adaptor.trimiteDateJSON(json);


        //
        System.out.println("-------------------------");
        // Ex5
        OrganismViu[] lista_organisme = new OrganismViu[5];
        lista_organisme[0] = new Mamifer();
        lista_organisme[1] = new Animal();
        lista_organisme[2] = new Urs();
        lista_organisme[3] = new Delfin();

        lista_organisme[0].hraneste();
        lista_organisme[0].respira();
        ((Mamifer) lista_organisme[0]).arePar();

        lista_organisme[1].hraneste();
        lista_organisme[1].respira();

        lista_organisme[2].hraneste();
        lista_organisme[2].respira();
        ((Urs) lista_organisme[2]).voice();

        lista_organisme[3].hraneste();
        lista_organisme[3].respira();
        ((Delfin) lista_organisme[3]).voice();

        //
        System.out.println("-------------------------");
        // Ex6
        Smartwatch smartwatch = new Smartwatch();
        Telefon telefon = new Telefon();
        Televizor televizor = new Televizor();

        smartwatch.porneste();
        smartwatch.status();
        Dispozitiv.descriereGenerala("smartwatch");
        smartwatch.opreste();

        telefon.porneste();
        telefon.status();
        Dispozitiv.descriereGenerala("telefon");
        telefon.opreste();

        televizor.porneste();
        televizor.status();
        Dispozitiv.descriereGenerala("televizor");
        televizor.opreste();

        //
        System.out.println("-------------------------");
        // Ex7
        HashSet<Produs> cos_produse = new HashSet<>();
        HashMap<Produs,Integer> map_produse = new HashMap<>();

        Produs p1 = new Produs("a", "Lapte", 7.5);
        Produs p2 = new Produs("b", "Paine", 3.2);
        Produs p3 = new Produs("c", "Oua", 12.0);
        Produs p4 = new Produs("d", "Cafea", 25.5);
        Produs p5 = p2;

        cos_produse.add(p1);
        cos_produse.add(p2);
        cos_produse.add(p3);
        cos_produse.add(p5);

        map_produse.put(p1, 2);
        map_produse.put(p3, 1);
        map_produse.put(p4, 3);

        System.out.println("map_produse: " + map_produse.entrySet());
        cos_produse.forEach( (produs -> {System.out.println(produs.toString());}));

        //
        System.out.println("-------------------------");
        // Ex8
        ArrayList<ContUtilizator> lista_utilizatori = new ArrayList<>();

        lista_utilizatori.add(new ContUtilizator("a", "alice", NivelAcces.ADMIN));
        lista_utilizatori.add(new ContUtilizator("b", "bob", NivelAcces.USER));
        lista_utilizatori.add(new ContUtilizator("c", "cabob", NivelAcces.GUEST));
        lista_utilizatori.add(new ContUtilizator("d", "cat", NivelAcces.USER));
        lista_utilizatori.add(new ContUtilizator("e", "catalin", NivelAcces.EDITOR));

        NivelAcces prag = NivelAcces.USER;

        ArrayList<ContUtilizator> filler = new ArrayList<>();
        lista_utilizatori.forEach((ContUtilizator i) -> {if(i.getNivelAcces().getCod() <= prag.getCod()) filler.add(i);});

        filler.forEach((ContUtilizator i) -> {System.out.println(i.toString());});
    }
}