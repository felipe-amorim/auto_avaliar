package products.apps.unit.objects;

import java.util.LinkedHashMap;

public class AppsSolicitarAvaliacao {
    public static String appsSolicitarAvaliacaoTitle = "//div[contains(text(), \"Solicitar avaliação\")]";
    public static String appsTipoAvaliacaoCombobox = "//select[@ng-model=\"ctrl.valuation.valuation_type_id\"]";
    public static String appsAvaliadorResponsavelCombobox = "//select[@ng-model=\"ctrl.valuation.valuer_id\"]";
    public static String appsNomeDoClienteInput = "//input[@ng-model=\"ctrl.valuation.name\"]";
    public static String appsAnoDeInteresseInput = "//input[@ng-model=\"ctrl.interest.year\"]";
    public static String appsCelularInput = "//input[@ng-model=\"ctrl.valuation.cell_phone\"]";
    public static String appsPlacaInput = "//input[@ng-model=\"ctrl.valuation.plate\"]";
    public static String appsSolicitarButton = "//button[@ng-click=\"ctrl.solicita()\"]";
    public static String appsBuscarPlacaButton = "//button[@ng-click=\"ctrl.getPlateData()\"]";
    public static String appsVeiculoInput = "//av-search-filter[@label=\"Veículo\"][contains(@controller, \"oraculo/versions/listAll\")]//input[@placeholder=\"Todos\"]";
    public static String appsPrimeiroVeiculoLi = "//av-search-filter[@label=\"Veículo\"][contains(@controller, \"oraculo/versions/listAll\")]//li/a";
    public static String appsObrigatoriedadeTipoDeAvaliacaoText = "//div[text()=\"É necessário selecionar um TIPO DE AVALIAÇÃO!\"]";
    public static String appsObrigatoriedadeAvaliadorResponsavelText = "//div[text()=\"É necessário selecionar um AVALIADOR RESPONSÁVEL!\"]";
    public static String appsObrigatoriedadeNomeText = "//div[text()=\"É necessário digitar uma valor para: NOME!\"]";
    public static String appsObrigatoriedadeCelularText = "//div[text()=\"É necessário digitar uma valor para: CELULAR!\"]";
    public static String appsObrigatoriedadePlacaText = "//div[text()=\"É necessário digitar uma valor para: PLACA!\"]";
    public static String appsPlacaInvalidaText = "//div[text()=\"Por favor informe uma PLACA válida!\"]";
    public static String appsSolicitarAvaliacoButtonSolicitar = "//button[@class=\"btn btn-success m-sm text-uppercase ng-binding\"]";
    public static String appsSolicitarAvaliacaoInputRenavam = "//input[@ng-model=\"ctrl.valuation.renavam\"]";
    public static String appsSolicitarAvaliacaoSelectChaveReserva = "//label[contains(.,\"O veículo possui chave reserva?\")]/following-sibling::select[@class]";
    public static String appsSolicitarAvaliacaoSelectManual = "//label[contains(.,\"Tem manual?\")]/following-sibling::select[@class]";
    public static String appsSolicitarAvaliacaoButtonSolicita = "//button[@ng-click=\"ctrl.solicita()\"]";
    public static String appsPlacaNaoEncontradaText = "//div[text()=\"Placa não encontrada!\"]";
    public static String appsSolicitarAvaliacaoInputCPF = "//div[@class=\"row mt-sm\"]//div[@class=\"col-lg-4 col-sm-4 mb-lg\"]//input[@class=\"form-control ng-pristine ng-untouched ng-valid ng-empty ng-valid-cpf ng-valid-cnpj\"]";
    public static String appsSolicitarAvaliacaoInputExpectativaDoCliente = "//input[@ng-model=\"ctrl.valuation.expected_value\"]";
    public static String appsSolicitarAvaliacaoButtonOpenFieldObs = "//i[@class=\"fa fa-arrow-down\"]";
    public static String appsSolicitarAvaliacaoInputTextObs = "//textarea[@class=\"form-control note-editor ng-pristine ng-untouched ng-valid ng-empty\"]";
    public static String appsSolicitarAvaliacaoInputNumeroTelefone = "//input[@class=\"form-control phone_mask\"]";
    public static String appsSolicitarAvaliacaoInputEmailCliente = "//input[@ng-model=\"ctrl.valuation.email\"]";


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
        ret.put(appsBuscarPlacaButton, "Buscar placa");
        ret.put(appsCelularInput, "Celular");
        ret.put(appsPlacaInput, "Placa");
        ret.put(appsSolicitarButton, "Solicitar");
        ret.put(appsObrigatoriedadeTipoDeAvaliacaoText, "Mensagem de obrigatoriedade do campo tipo de avaliação");
        ret.put(appsObrigatoriedadeAvaliadorResponsavelText, "Mensagem de obrigatoriedade do campo avaliador responsável");
        ret.put(appsObrigatoriedadeNomeText, "Mensagem de obrigatoriedade do campo nome");
        ret.put(appsObrigatoriedadeCelularText, "Mensagem de obrigatoriedade do campo celular");
        ret.put(appsObrigatoriedadePlacaText, "Mensagem de obrigatoriedade do campo placa");
        ret.put(appsPlacaInvalidaText, "Mensagem de placa inválida");
        ret.put(appsSolicitarAvaliacoButtonSolicitar, "Botaão solicitar, para finalizar solicitacao de avaliação");
        ret.put(appsSolicitarAvaliacaoSelectChaveReserva, "Chave Reserva SIM");
        ret.put(appsSolicitarAvaliacaoSelectManual, "Manual SIM");
        ret.put(appsSolicitarAvaliacaoButtonSolicita, "Solicita");
        ret.put(appsPlacaNaoEncontradaText, "Mensagem de placa não encontrada");
        ret.put(appsSolicitarAvaliacaoInputCPF, "Input cpf para solicitar avaliação");
        ret.put(appsSolicitarAvaliacaoInputRenavam, "Input renavan para solicitar avaliação");
        ret.put(appsSolicitarAvaliacaoInputExpectativaDoCliente, "Input expectativa de preco do cliente para avaliação");
        ret.put(appsSolicitarAvaliacaoButtonOpenFieldObs, "Botão para abrir o campo observações");
        ret.put(appsSolicitarAvaliacaoInputTextObs, "Text area observações");
        ret.put(appsSolicitarAvaliacaoInputNumeroTelefone, "Input numero de telefone");
        ret.put(appsSolicitarAvaliacaoInputEmailCliente, "Input e-mail cliente");
        return ret;
    }
}
