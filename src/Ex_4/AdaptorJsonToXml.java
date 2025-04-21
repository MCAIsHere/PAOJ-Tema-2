package Ex_4;

import java.util.Map;

public class AdaptorJsonToXml {
    private SistemExistent sistem;

    public AdaptorJsonToXml(SistemExistent sistem) {
        this.sistem = sistem;
    }

    public void trimiteDateJSON(String json) {
        String xml = convertesteJsonInXml(json);
        sistem.afiseazaXML(xml);
    }

    private String convertesteJsonInXml(String json) {
        json = json.trim().replaceAll("[{}\"]", "");
        String[] perechi = json.split(",");

        StringBuilder xml = new StringBuilder();

        for (String pereche : perechi) {
            String[] cheieValoare = pereche.split(":", 2);

            String cheie = cheieValoare[0].trim();
            String valoare = cheieValoare[1].trim();
            xml.append("<").append(cheie).append(">").append(valoare).append("</").append(cheie).append(">\n");
        }

        return xml.toString();
    }
}
