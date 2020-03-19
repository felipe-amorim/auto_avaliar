Feature: Validar o funcionamento do botão de login

  @GrupoAbraoReze @Vendedor @Unit @Login
  Scenario: CT_001, Author: Felipe Amorim, Category: unit_buttons_login-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "abrao"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAbraoReze @Avaliador @Unit @Login
  Scenario: CT_002, Author: Felipe Amorim, Category: unit_buttons_login-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "abrao"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAbraoReze @Gerente @Unit @Login
  Scenario: CT_003, Author: Felipe Amorim, Category: unit_buttons_login-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "abrao"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAndreta @Vendedor @Unit @Login
  Scenario: CT_004, Author: Felipe Amorim, Category: unit_buttons_login-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "andreta"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAndreta @Avaliador @Unit @Login
  Scenario: CT_005, Author: Felipe Amorim, Category: unit_buttons_login-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "andreta"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoAndreta @Gerente @Unit @Login
  Scenario: CT_006, Author: Felipe Amorim, Category: unit_buttons_login-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "andreta"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCAOA @Vendedor @Unit @Login
  Scenario: CT_007, Author: Felipe Amorim, Category: unit_buttons_login-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "caoa"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCAOA @Avaliador @Unit @Login
  Scenario: CT_008, Author: Felipe Amorim, Category: unit_buttons_login-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "caoa"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCAOA @Gerente @Unit @Login
  Scenario: CT_009, Author: Felipe Amorim, Category: unit_buttons_login-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "caoa"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarhouse @Vendedor @Unit @Login
  Scenario: CT_010, Author: Felipe Amorim, Category: unit_buttons_login-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "carhouse"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarhouse @Avaliador @Unit @Login
  Scenario: CT_011, Author: Felipe Amorim, Category: unit_buttons_login-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "carhouse"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarhouse @Gerente @Unit @Login
  Scenario: CT_012, Author: Felipe Amorim, Category: unit_buttons_login-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "carhouse"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoGNC @Vendedor @Unit @Login
  Scenario: CT_013, Author: Felipe Amorim, Category: unit_buttons_login-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "ngc"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoGNC @Avaliador @Unit @Login
  Scenario: CT_014, Author: Felipe Amorim, Category: unit_buttons_login-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "ngc"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoGNC @Gerente @Unit @Login
  Scenario: CT_015, Author: Felipe Amorim, Category: unit_buttons_login-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "ngc"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoJorlan @Vendedor @Unit @Login
  Scenario: CT_016, Author: Felipe Amorim, Category: unit_buttons_login-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "jorlan"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoJorlan @Avaliador @Unit @Login
  Scenario: CT_017, Author: Felipe Amorim, Category: unit_buttons_login-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "jorlan"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoJorlan @Gerente @Unit @Login
  Scenario: CT_018, Author: Felipe Amorim, Category: unit_buttons_login-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "jorlan"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoLocalizaOficial @Vendedor @Unit @Login
  Scenario: CT_019, Author: Felipe Amorim, Category: unit_buttons_login-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "localiza"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoLocalizaOficial @Avaliador @Unit @Login
  Scenario: CT_020, Author: Felipe Amorim, Category: unit_buttons_login-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "localiza"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoLocalizaOficial @Gerente @Unit @Login
  Scenario: CT_021, Author: Felipe Amorim, Category: unit_buttons_login-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "localiza"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoNewland @Vendedor @Unit @Login
  Scenario: CT_022, Author: Felipe Amorim, Category: unit_buttons_login-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "newland"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoNewland @Avaliador @Unit @Login
  Scenario: CT_023, Author: Felipe Amorim, Category: unit_buttons_login-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "newland"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoNewland @Gerente @Unit @Login
  Scenario: CT_024, Author: Felipe Amorim, Category: unit_buttons_login-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "newland"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoParvi @Vendedor @Unit @Login
  Scenario: CT_025, Author: Felipe Amorim, Category: unit_buttons_login-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "parvi"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoParvi @Avaliador @Unit @Login
  Scenario: CT_026, Author: Felipe Amorim, Category: unit_buttons_login-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "parvi"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoParvi @Gerente @Unit @Login
  Scenario: CT_027, Author: Felipe Amorim, Category: unit_buttons_login-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "parvi"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoSaga @Vendedor @Unit @Login
  Scenario: CT_028, Author: Felipe Amorim, Category: unit_buttons_login-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "saga"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoSaga @Avaliador @Unit @Login
  Scenario: CT_029, Author: Felipe Amorim, Category: unit_buttons_login-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "saga"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoSaga @Gerente @Unit @Login
  Scenario: CT_030, Author: Felipe Amorim, Category: unit_buttons_login-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "saga"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoServopa @Vendedor @Unit @Login
  Scenario: CT_031, Author: Felipe Amorim, Category: unit_buttons_login-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "servopa"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoServopa @Avaliador @Unit @Login
  Scenario: CT_032, Author: Felipe Amorim, Category: unit_buttons_login-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "servopa"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoServopa @Gerente @Unit @Login
  Scenario: CT_033, Author: Felipe Amorim, Category: unit_buttons_login-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "servopa"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @TestesAutoAvaliar @Vendedor @Unit @Login
  Scenario: CT_034, Author: Felipe Amorim, Category: unit_buttons_login-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "autoavaliar"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @TestesAutoAvaliar @Avaliador @Unit @Login
  Scenario: CT_035, Author: Felipe Amorim, Category: unit_buttons_login-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "autoavaliar"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @TestesAutoAvaliar @Gerente @Unit @Login
  Scenario: CT_036, Author: Felipe Amorim, Category: unit_buttons_login-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "autoavaliar"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoViamar @Vendedor @Unit @Login
  Scenario: CT_037, Author: Felipe Amorim, Category: unit_buttons_login-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "viamar"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoViamar @Avaliador @Unit @Login
  Scenario: CT_038, Author: Felipe Amorim, Category: unit_buttons_login-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "viamar"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoViamar @Gerente @Unit @Login
  Scenario: CT_039, Author: Felipe Amorim, Category: unit_buttons_login-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "viamar"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarrera @Vendedor @Unit @Login
  Scenario: CT_040, Author: Felipe Amorim, Category: unit_buttons_login-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "carrera"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarrera @Avaliador @Unit @Login
  Scenario: CT_041, Author: Felipe Amorim, Category: unit_buttons_login-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "carrera"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff

  @GrupoCarrera @Gerente @Unit @Login
  Scenario: CT_042, Author: Felipe Amorim, Category: unit_buttons_login-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "carrera"
    And O usuario preenche o campo password a senha padrao
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso
    And O usuario realiza o logoff
