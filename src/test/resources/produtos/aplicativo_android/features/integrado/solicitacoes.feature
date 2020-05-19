Feature: Realizar nova solicitação

  @NovaSolicitacao
  Scenario: Realizar nova solicitacao, Author: Felipe Amorim, Category: Nova Solicitacao, Environment: Galaxy S9 - Android 10 - App 1.0
    Given O usuario abre o aplicativo HANB com o dispositivo "AA Galaxy S9 10" e versao do OS "10"
    And O usuario acessa o menu brasil
    And O usuario preenche o campo email como timeqa
    And O usuario preenche o campo senha com a senha padrao
    And O usuario clica em entrar
    When O usuario clica em mais
    And O usuario clica no menu carro
    And O usuario permite o acesso as fotos do aplicativo
    And O usuario permite acesso ao microfone do aplicativo
    And O usuario preenche o campo owner
    And O usuario preenche o campo telefone
    And O usuario preenche o campo celular
    And O usuario preenche o campo email
    And O usuario escolhe o vendedor QA
    And O usuario preenche a placa
    And O usuario arrasta a tela para baixo
    And O usuario preenche o ano de fabricacao
    And O usuario preenche o ano de lancamento
    And O usuario arrasta a tela para baixo
    And O usuario preenche a kilometragem
    And O usuario preenche a marca utilizando o filtro por "fiat"
    And O usuario preenche o modelo utilizando o filtro por "palio"
    And O usuario arrasta a tela para baixo
    And O usuario preenche o campo versao
    And O usuario preenche o campo cor
    And O usuario arrasta a tela para baixo
    And O usuario preenche o campo combustivel
    And O usuario preenche o campo cambio
    And O usuario preenche o campo procedencia
    And O usuario preenche o campo quantidade de portas utilizando o filtro por "4"
    And O usuario arrasta a tela para baixo
    And O usuario arrasta a tela para baixo
    And O usuario insere quatro fotos de teste
    And O usuario arrasta a tela para baixo
    And O usuario clica em salvar e avancar
    And O usuario arrasta a tela para baixo
    And O usuario arrasta a tela para baixo
    And O usuario arrasta a tela para baixo
    And O usuario clica em salvar e avancar
    And O usuario clica em salvar e avancar
    And O usuario preenche o campo classificacao como A
    And O usuario preenche o campo finalidade como oferta
    And O usuario clica em salvar e avancar
