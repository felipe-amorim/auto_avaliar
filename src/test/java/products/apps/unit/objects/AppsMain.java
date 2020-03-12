package products.apps.unit.objects;

import java.util.LinkedHashMap;

public class AppsMain {
    public static String appsIconUser = "//a[@id=\"top-user-menu\"]";


    public static LinkedHashMap<String, String> appsMain = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(appsIconUser, "Icone de usuário logado");
        return ret;
    }
}
