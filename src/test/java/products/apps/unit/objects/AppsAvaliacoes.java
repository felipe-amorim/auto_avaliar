package products.apps.unit.objects;

import java.util.LinkedHashMap;

public class AppsAvaliacoes {
    public static String appsAvaliacoesTitle = "//div[contains(text(), \"Avaliações\")]";
    public static String appsSolicitarButton = "//button[@ng-click=\"ctrl.solicita()\"]";


    public static LinkedHashMap<String, String> appsAvaliacoes = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(appsAvaliacoesTitle, "Titulo avaliações");
        ret.put(appsSolicitarButton, "Solicitar");
        return ret;
    }
}
