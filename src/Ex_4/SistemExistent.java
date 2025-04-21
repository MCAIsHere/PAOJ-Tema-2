package Ex_4;

public class SistemExistent {
    public void afiseazaXML(String xml){
        System.out.println("XML:");
        System.out.println(xml);
    }
    public String genereazaJSON(){
        return "{\"nume\":\"Alice\",\"email\":\"alice@example.com\",\"rol\":\"admin\"}";
    }
}
