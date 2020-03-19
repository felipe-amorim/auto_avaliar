Feature: Validar o funcionamento do botão "Solicitar Avaliação" no menu lateral esquerdo

  @GrupoAbraoReze @Vendedor @Unit @SolicitarAvaliacao
  Scenario: CT_043, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "abrao"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAbraoReze @Avaliador @Unit @SolicitarAvaliacao
  Scenario: CT_044, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "abrao"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAbraoReze @Gerente @Unit @SolicitarAvaliacao
  Scenario: CT_045, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "abrao"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAndreta @Vendedor @Unit @SolicitarAvaliacao
  Scenario: CT_046, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "andreta"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAndreta @Avaliador @Unit @SolicitarAvaliacao
  Scenario: CT_047, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "andreta"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAndreta @Gerente @Unit @SolicitarAvaliacao
  Scenario: CT_048, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "andreta"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCAOA @Vendedor @Unit @SolicitarAvaliacao
  Scenario: CT_049, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "caoa"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCAOA @Avaliador @Unit @SolicitarAvaliacao
  Scenario: CT_050, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "caoa"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCAOA @Gerente @Unit @SolicitarAvaliacao
  Scenario: CT_051, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "caoa"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarhouse @Vendedor @Unit @SolicitarAvaliacao
  Scenario: CT_052, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "carhouse"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarhouse @Avaliador @Unit @SolicitarAvaliacao
  Scenario: CT_053, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "carhouse"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarhouse @Gerente @Unit @SolicitarAvaliacao
  Scenario: CT_054, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "carhouse"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoGNC @Vendedor @Unit @SolicitarAvaliacao
  Scenario: CT_055, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "gnc"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoGNC @Avaliador @Unit @SolicitarAvaliacao
  Scenario: CT_056, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "gnc"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoGNC @Gerente @Unit @SolicitarAvaliacao
  Scenario: CT_057, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "gnc"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoJorlan @Vendedor @Unit @SolicitarAvaliacao
  Scenario: CT_058, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "jorlan"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoJorlan @Avaliador @Unit @SolicitarAvaliacao
  Scenario: CT_059, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "jorlan"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoJorlan @Gerente @Unit @SolicitarAvaliacao
  Scenario: CT_060, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "jorlan"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoLocalizaOficial @Vendedor @Unit @SolicitarAvaliacao
  Scenario: CT_061, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "localiza"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoLocalizaOficial @Avaliador @Unit @SolicitarAvaliacao
  Scenario: CT_062, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "localiza"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoLocalizaOficial @Gerente @Unit @SolicitarAvaliacao
  Scenario: CT_063, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "localiza"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoNewland @Vendedor @Unit @SolicitarAvaliacao
  Scenario: CT_064, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@newland.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoNewland @Avaliador @Unit @SolicitarAvaliacao
  Scenario: CT_065, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@newland.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoNewland @Gerente @Unit @SolicitarAvaliacao
  Scenario: CT_066, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "newland"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoParvi @Vendedor @Unit @SolicitarAvaliacao
  Scenario: CT_067, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@parvi.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoParvi @Avaliador @Unit @SolicitarAvaliacao
  Scenario: CT_068, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@parvi.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoParvi @Gerente @Unit @SolicitarAvaliacao
  Scenario: CT_069, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@parvi.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoSaga @Vendedor @Unit @SolicitarAvaliacao
  Scenario: CT_070, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@saga.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoSaga @Avaliador @Unit @SolicitarAvaliacao
  Scenario: CT_071, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@saga.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoSaga @Gerente @Unit @SolicitarAvaliacao
  Scenario: CT_072, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@saga.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoServopa @Vendedor @Unit @SolicitarAvaliacao
  Scenario: CT_073, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@servopa.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoServopa @Avaliador @Unit @SolicitarAvaliacao
  Scenario: CT_074, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@servopa.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoServopa @Gerente @Unit @SolicitarAvaliacao
  Scenario: CT_075, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@servopa.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @TestesAutoAvaliar @Vendedor @Unit @SolicitarAvaliacao
  Scenario: CT_076, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@autoavaliar.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @TestesAutoAvaliar @Avaliador @Unit @SolicitarAvaliacao
  Scenario: CT_077, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@autoavaliar.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @TestesAutoAvaliar @Gerente @Unit @SolicitarAvaliacao
  Scenario: CT_078, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@autoavaliar.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoViamar @Vendedor @Unit @SolicitarAvaliacao
  Scenario: CT_079, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@viamar.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoViamar @Avaliador @Unit @SolicitarAvaliacao
  Scenario: CT_080, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@viamar.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoViamar @Gerente @Unit @SolicitarAvaliacao
  Scenario: CT_081, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@viamar.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarrera @Vendedor @Unit @SolicitarAvaliacao
  Scenario: CT_082, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-vendedor, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "vendedortimeqa@carrera.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarrera @Avaliador @Unit @SolicitarAvaliacao
  Scenario: CT_083, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-avaliador, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "avaliadortimeqa@carrera.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarrera @Gerente @Unit @SolicitarAvaliacao
  Scenario: CT_084, Author: Felipe Amorim, Category: unit_buttons_solicitar_avaliacao-gerente, Environment: Google Chrome
    Given O usuario está logado no sistema pela url "https://apps.autoavaliar.com.br/login/usbi#" como usuario "gerentetimeqa@carrera.com.br" e senha "timeqa0102"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario realiza o logoff

