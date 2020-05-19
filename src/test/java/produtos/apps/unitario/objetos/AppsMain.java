package produtos.apps.unitario.objetos;

import java.util.LinkedHashMap;

public class AppsMain {
    public static String appsIconUser = "//a[@id=\"top-user-menu\"]";
    public static String appsSairButton = "//a[text()=\"Sair\"]";
    public static String appsSolicitarAvaliacaoButton = "//a[@href=\"#/app/solicita\"]";
    public static String appsAvalicoesButton = "//a[@ng-click=\"sc.toggleCollapseKey('app.avaliacoes')\"]";
    public static String appsAvalicoesExpandidoButton = "//a[@href=\"#/app/avaliacoes/avaliacoes/lista\"]";


    public static LinkedHashMap<String, String> appsMain = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(appsIconUser, "Icone de usuário logado");
        ret.put(appsSairButton, "Sair");
        ret.put(appsSolicitarAvaliacaoButton, "Solicitar Avaliação");
        ret.put(appsAvalicoesButton, "Avalicações");
        ret.put(appsAvalicoesExpandidoButton, "Sub menu avalicações");
        return ret;
    }
}
