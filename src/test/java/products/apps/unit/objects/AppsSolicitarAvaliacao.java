package products.apps.unit.objects;

import java.util.LinkedHashMap;

public class AppsSolicitarAvaliacao {
    public static String appsSolicitarAvaliacaoTitle = "//div[contains(text(), \"Solicitar avaliação\")]";
    public static String appsTipoAvaliacaoCombobox = "//select[@ng-model=\"ctrl.valuation.valuation_type_id\"]";
    public static String appsAvaliadorResponsavelCombobox = "//select[@ng-model=\"ctrl.valuation.valuer_id\"]";
    public static String appsNomeDoClienteInput = "//input[@ng-model=\"ctrl.valuation.name\"]";
    public static String appsAnoDeInteresseInput = "//input[@ng-model=\"ctrl.interest.year\"]";
    public static String appsVeiculoInput = "//av-search-filter[@label=\"Veículo\"][contains(@controller, \"oraculo/versions/listAll\")]//input[@placeholder=\"Todos\"]";
    public static String appsPrimeiroVeiculoLi = "//av-search-filter[@label=\"Veículo\"][contains(@controller, \"oraculo/versions/listAll\")]//li/a";
    public static String appsObrigatoriedadeTipoDeAvaliacaoText = "//div[text()=\"É necessário selecionar um TIPO DE AVALIAÇÃO!\"]";


    public static LinkedHashMap<String, String> appsSolicitarAvaliacao = createData();
    private static LinkedHashMap<String, String> createData() {
        LinkedHashMap<String, String> ret = new LinkedHashMap<>();
        ret.put(appsSolicitarAvaliacaoTitle, "Titulo solicitar avaliação");
        ret.put(appsTipoAvaliacaoCombobox, "Combobox tipo avaliação");
        ret.put(appsAvaliadorResponsavelCombobox, "Combobox avaliador responsável");
        ret.put(appsNomeDoClienteInput, "Nome do cliente");
        ret.put(appsAnoDeInteresseInput, "Ano de interesse");
        ret.put(appsVeiculoInput, "Veiculo");
        ret.put(appsPrimeiroVeiculoLi, "Primeiro veiculo");
        ret.put(appsObrigatoriedadeTipoDeAvaliacaoText, "Mensagem de obrigatoriedade do campo tipo de avaliação");
        return ret;
    }
}
