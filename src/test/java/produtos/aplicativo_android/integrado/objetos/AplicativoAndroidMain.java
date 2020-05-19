package produtos.aplicativo_android.integrado.objetos;

import java.util.LinkedHashMap;

public class AplicativoAndroidMain {

    public static String aplicativoAndroidMainMaisButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton";
    public static String aplicativoAndroidMainCarroButton = "com.autoaction.app:id/home_fab_menu_car";


    public static LinkedHashMap<String, String> aplicativoAndroidMain = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(aplicativoAndroidMainMaisButton, "Mais");
        ret.put(aplicativoAndroidMainCarroButton, "Carro");
        return ret;
    }
}
