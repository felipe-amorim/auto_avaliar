Feature: Validar o funcionamento do botão "Avaliações" no menu expansivel Avaliações dentro do menu lateral esquedo.

  @GrupoAbraoReze @Vendedor @Avaliacoes
  Scenario: CT_085, Author: Felipe Amorim, Category: avaliacoes-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@abrao.com.br" e senha "timeqa0102"
    When O usuario expande as opcoes no menu Avaliacoes
    And O usuario clica no botao Avaliacoes dentro do menu expandido
    Then O usuario valida que a tela Avaliacoes carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAbraoReze @Avaliador @Avaliacoes
  Scenario: CT_086, Author: Felipe Amorim, Category: avaliacoes-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@abrao.com.br" e senha "timeqa0102"
    When O usuario expande as opcoes no menu Avaliacoes
    And O usuario clica no botao Avaliacoes dentro do menu expandido
    Then O usuario valida que a tela Avaliacoes carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAbraoReze @Gerente @Avaliacoes
  Scenario: CT_087, Author: Felipe Amorim, Category: avaliacoes-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@abrao.com.br" e senha "timeqa0102"
    When O usuario expande as opcoes no menu Avaliacoes
    And O usuario clica no botao Avaliacoes dentro do menu expandido
    Then O usuario valida que a tela Avaliacoes carregou com sucesso
    And O usuario realiza o logoff
