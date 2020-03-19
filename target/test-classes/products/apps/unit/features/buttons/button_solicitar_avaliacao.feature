Feature: Validar o funcionamento do botão "Solicitar Avaliação" no menu lateral esquerdo

  @GrupoAbraoReze @Vendedor @SolicitarAvaliacao
  Scenario: CT_043, Author: Felipe Amorim, Category: solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@abrao.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAbraoReze @Avaliador @SolicitarAvaliacao
  Scenario: CT_044, Author: Felipe Amorim, Category: solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@abrao.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAbraoReze @Gerente @SolicitarAvaliacao
  Scenario: CT_045, Author: Felipe Amorim, Category: solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@abrao.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAndreta @Vendedor @SolicitarAvaliacao
  Scenario: CT_046, Author: Felipe Amorim, Category: solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@andreta.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAndreta @Avaliador @SolicitarAvaliacao
  Scenario: CT_047, Author: Felipe Amorim, Category: solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@andreta.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAndreta @Gerente @SolicitarAvaliacao
  Scenario: CT_048, Author: Felipe Amorim, Category: solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@andreta.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCAOA @Vendedor @SolicitarAvaliacao
  Scenario: CT_049, Author: Felipe Amorim, Category: solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@caoa.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCAOA @Avaliador @SolicitarAvaliacao
  Scenario: CT_050, Author: Felipe Amorim, Category: solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@caoa.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCAOA @Gerente @SolicitarAvaliacao
  Scenario: CT_051, Author: Felipe Amorim, Category: solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@caoa.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarhouse @Vendedor @SolicitarAvaliacao
  Scenario: CT_052, Author: Felipe Amorim, Category: solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@carhouse.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarhouse @Avaliador @SolicitarAvaliacao
  Scenario: CT_053, Author: Felipe Amorim, Category: solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@carhouse.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarhouse @Gerente @SolicitarAvaliacao
  Scenario: CT_054, Author: Felipe Amorim, Category: solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@carhouse.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoGNC @Vendedor @SolicitarAvaliacao
  Scenario: CT_055, Author: Felipe Amorim, Category: solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@gnc.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoGNC @Avaliador @SolicitarAvaliacao
  Scenario: CT_056, Author: Felipe Amorim, Category: solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@gnc.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoGNC @Gerente @SolicitarAvaliacao
  Scenario: CT_057, Author: Felipe Amorim, Category: solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@gnc.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoJorlan @Vendedor @SolicitarAvaliacao
  Scenario: CT_058, Author: Felipe Amorim, Category: solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@jorlan.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoJorlan @Avaliador @SolicitarAvaliacao
  Scenario: CT_059, Author: Felipe Amorim, Category: solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@jorlan.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoJorlan @Gerente @SolicitarAvaliacao
  Scenario: CT_060, Author: Felipe Amorim, Category: solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@jorlan.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoLocalizaOficial @Vendedor @SolicitarAvaliacao
  Scenario: CT_061, Author: Felipe Amorim, Category: solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@localiza.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoLocalizaOficial @Avaliador @SolicitarAvaliacao
  Scenario: CT_062, Author: Felipe Amorim, Category: solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@localiza.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoLocalizaOficial @Gerente @SolicitarAvaliacao
  Scenario: CT_063, Author: Felipe Amorim, Category: solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@localiza.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoNewland @Vendedor @SolicitarAvaliacao
  Scenario: CT_064, Author: Felipe Amorim, Category: solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@newland.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoNewland @Avaliador @SolicitarAvaliacao
  Scenario: CT_065, Author: Felipe Amorim, Category: solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@newland.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoNewland @Gerente @SolicitarAvaliacao
  Scenario: CT_066, Author: Felipe Amorim, Category: solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@newland.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoParvi @Vendedor @SolicitarAvaliacao
  Scenario: CT_067, Author: Felipe Amorim, Category: solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@parvi.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoParvi @Avaliador @SolicitarAvaliacao
  Scenario: CT_068, Author: Felipe Amorim, Category: solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@parvi.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoParvi @Gerente @SolicitarAvaliacao
  Scenario: CT_069, Author: Felipe Amorim, Category: solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@parvi.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoSaga @Vendedor @SolicitarAvaliacao
  Scenario: CT_070, Author: Felipe Amorim, Category: solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@saga.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoSaga @Avaliador @SolicitarAvaliacao
  Scenario: CT_071, Author: Felipe Amorim, Category: solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@saga.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoSaga @Gerente @SolicitarAvaliacao
  Scenario: CT_072, Author: Felipe Amorim, Category: solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@saga.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoServopa @Vendedor @SolicitarAvaliacao
  Scenario: CT_073, Author: Felipe Amorim, Category: solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@servopa.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoServopa @Avaliador @SolicitarAvaliacao
  Scenario: CT_074, Author: Felipe Amorim, Category: solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@servopa.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoServopa @Gerente @SolicitarAvaliacao
  Scenario: CT_075, Author: Felipe Amorim, Category: solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@servopa.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @TestesAutoAvaliar @Vendedor @SolicitarAvaliacao
  Scenario: CT_076, Author: Felipe Amorim, Category: solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@autoavaliar.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @TestesAutoAvaliar @Avaliador @SolicitarAvaliacao
  Scenario: CT_077, Author: Felipe Amorim, Category: solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@autoavaliar.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @TestesAutoAvaliar @Gerente @SolicitarAvaliacao
  Scenario: CT_078, Author: Felipe Amorim, Category: solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@autoavaliar.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoViamar @Vendedor @SolicitarAvaliacao
  Scenario: CT_079, Author: Felipe Amorim, Category: solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@viamar.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoViamar @Avaliador @SolicitarAvaliacao
  Scenario: CT_080, Author: Felipe Amorim, Category: solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@viamar.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoViamar @Gerente @SolicitarAvaliacao
  Scenario: CT_081, Author: Felipe Amorim, Category: solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@viamar.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarrera @Vendedor @SolicitarAvaliacao
  Scenario: CT_082, Author: Felipe Amorim, Category: solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@carrera.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarrera @Avaliador @SolicitarAvaliacao
  Scenario: CT_083, Author: Felipe Amorim, Category: solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@carrera.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarrera @Gerente @SolicitarAvaliacao
  Scenario: CT_084, Author: Felipe Amorim, Category: solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@carrera.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

