package products.apps.unit.objects;

import java.util.LinkedHashMap;

public class AppsLogin {
    public static String appsEmailInput = "//input[@id=\"inputEmail\"]";
    public static String appsPasswordInput = "//input[@id=\"inputPassword\"]";
    public static String appsLoginButton = "//button";
    public static String appsLoginCaptcha = "//label[@id=\"recaptcha-anchor-label\"]";


    public static LinkedHashMap<String, String> appsLogin = createData();

    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(appsEmailInput, "E-mail");
        ret.put(appsPasswordInput, "Senha");
        ret.put(appsLoginCaptcha, "Botão login");
        ret.put(appsLoginCaptcha, "Captcha");
        return ret;
    }
}