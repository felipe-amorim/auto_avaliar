package products.apps.unit.objects;

import java.util.LinkedHashMap;

public class AppsAvaliacoes {
    public static String appsAvaliacoesTitle = "//div[contains(text(), \"Avaliações\")]";
    public static String appsSolicitarButton = "//button[@ng-click=\"ctrl.solicita()\"]";
    public static String appsAvaliacoesInputBuscarPlaca = "//input[@class=\"form-control ng-pristine ng-untouched ng-valid ng-empty\"]";
    public static String appsAvaliacoesButtonBuscar = "//button[@class=\"btn btn-success text-uppercase ng-binding\"]";
    public static String appsAvaliacoesButtonPrimeiroVeiculoCadastrado = "//tbody[@class=\"spaceSave\"]//tr[1]";
    public static String appsAvaliacoesTextValidarCarregouTelaDeBusca = "//label[@class=\"control-label ng-binding\"][text()=\"Empresa\"]";
    public static String appsAvaliacoesTextValidarAvaliacao = "//h1[@class=\"m0 pull-left ng-binding\"]";
    public static String appsAvaliacoesButtonEditarDadosDoVeiculoAvaliado = "//div[@class=\"row bg-gray-lighter p-sm\"]//span[@class=\"pull-right ng-scope\"]";
    public static String appsAvaliacoesEditarAnoVeiculoText = "//input[@ng-blur=\"ctrl.subVehicleDataHandler('', 'year')\"]";



    public static String appsAvaliacoesInputChassiEditarTeste = "//label[text()=\"Veículo\"]";


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
        ret.put(appsAvaliacoesInputBuscarPlaca, "Input buscar placa");
        ret.put(appsAvaliacoesButtonBuscar, "Botão buscar para filtrar avaliações");
        ret.put(appsAvaliacoesButtonPrimeiroVeiculoCadastrado, "Primeiro veiculo cadastrado da lista de veiculos avaliados");
        ret.put(appsAvaliacoesTextValidarCarregouTelaDeBusca, "Validar carregou tela de busca de avaliacoes");
        ret.put(appsAvaliacoesTextValidarAvaliacao, "Validar carregou tela dentro da avaliação");
        ret.put(appsAvaliacoesButtonEditarDadosDoVeiculoAvaliado, "Editar dados do veiculo avaliado");
        ret.put(appsAvaliacoesEditarAnoVeiculoText, "Campo usado para validar funcionalidade do botao editar");
        ret.put(appsTextBuscarPlaca, "Buscar placa");
        ret.put(appsAvaliacoesInputChassiEditarTeste, "Input chassi teste");
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
