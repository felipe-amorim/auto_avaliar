package products.apps.unit.objects;

import java.util.LinkedHashMap;

public class AppsAvaliacoes {
    public static String appsAvaliacoesTitle = "//div[contains(text(), \"Avaliações\")]";
    public static String appsSolicitarButton = "//button[@ng-click=\"ctrl.solicita()\"]";


    //Layout
    public static String appsTextBuscarPlaca = "//input[@placeholder=\"Buscar Placa\"]/ancestor::div/label";
    public static String textBuscarPlaca = "Buscar placa";
    public static String appsButtonVeiculoRecemAvaliado = "//td[@class=\"text-uppercase\"]/div/span[contains(text(),\"arg0\")]";
    public static String appsButtonAdicionarImagemAvaliacaoSolicitada = "//a[@ng-click=\"ctrl.showPhotosModal()\"]";
    public static String appsButtonSelecionarImagemDocumento = "//div[contains(text(),\"Documento\")]/ancestor::div[@class=\"panel-heading pb0\"]/following-sibling::div/button";
    public static String appsButtonSelecionarImagemFrenteLado = "//div[contains(text(),\"Frente-Lado Diagonal\")]/ancestor::div[@class=\"panel-heading pb0\"]/following-sibling::div/button";
    public static String appsInputFiltroMarca = "//label[contains(text(),\"Marca\")]/ancestor::div/av-search-filter/div/div/input";
    public static String appsInputFiltroModelo = "//label[contains(text(),\"Modelo\")]/ancestor::div/av-search-filter/div/div/input";
    public static String appsInputFiltroVersao = "//label[contains(text(),\"Versão\")]/ancestor::div/av-search-filter/div/div/input";
    public static String appsButtonFiltroBuscar = "//button[@ng-click=\"ctrl.find()\"]";




    public static LinkedHashMap<String, String> appsAvaliacoes = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(appsAvaliacoesTitle, "Titulo avaliações");
        ret.put(appsSolicitarButton, "Solicitar");
        ret.put(appsTextBuscarPlaca, "Buscar placa");
        ret.put(appsButtonVeiculoRecemAvaliado, "Veiculo recem avaliado");
        ret.put(appsButtonVeiculoRecemAvaliado, "Adicionar imagem");
        ret.put(appsButtonSelecionarImagemDocumento, "Selecionar Documento");
        ret.put(appsButtonSelecionarImagemFrenteLado, "Selecionar Frente-Lado Diagonal");
        ret.put(appsInputFiltroMarca, "Marca");
        ret.put(appsInputFiltroModelo, "Modelo");
        ret.put(appsInputFiltroVersao, "Versão");
        ret.put(appsButtonFiltroBuscar, "Buscar");
        return ret;
    }
}
