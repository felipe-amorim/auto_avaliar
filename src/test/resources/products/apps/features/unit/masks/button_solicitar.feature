Feature: Validar a existência do botão "Solicitar" dentro da página "Solicitar Avaliação"

  @GrupoAbraoReze @Vendedor @Unit @Solicitar
  Scenario: CT_169, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "abrao"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo tipo de avaliacao
    And O usuario preenche o campo tipo de avaliacao com o primeiro item disponivel
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo tipo de avaliacao
    And O usuario realiza o logoff

  @GrupoAbraoReze @Avaliador @Unit @Solicitar
  Scenario: CT_170, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "abrao"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo tipo de avaliacao
    And O usuario preenche o campo tipo de avaliacao com o primeiro item disponivel
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo tipo de avaliacao
    And O usuario realiza o logoff

  @GrupoAbraoReze @Gerente @Unit @Solicitar
  Scenario: CT_171, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "abrao"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo tipo de avaliacao
    And O usuario preenche o campo tipo de avaliacao com o primeiro item disponivel
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo tipo de avaliacao
    And O usuario realiza o logoff


  @GrupoAndreta @Vendedor @Unit @Solicitar
  Scenario: CT_172, Author: Felipe Amorim, Category: unit_buttons_solicitar-vendedor, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "andreta"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo tipo de avaliacao
    And O usuario preenche o campo tipo de avaliacao com o primeiro item disponivel
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo tipo de avaliacao
    And O usuario realiza o logoff

  @GrupoAndreta @Avaliador @Unit @Solicitar
  Scenario: CT_173, Author: Felipe Amorim, Category: unit_buttons_solicitar-avaliador, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "andreta"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo tipo de avaliacao
    And O usuario preenche o campo tipo de avaliacao com o primeiro item disponivel
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo tipo de avaliacao
    And O usuario realiza o logoff

  @GrupoAndreta @Gerente @Unit @Solicitar
  Scenario: CT_174, Author: Felipe Amorim, Category: unit_buttons_solicitar-gerente, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "andreta"
    When O usuario clica no botao solicitar avaliacao
    Then O usuario clica no botao solicitar sem preencher os campos obrigatorios
    And O usuario valida a mensagem de obrigatoriedade do campo tipo de avaliacao
    And O usuario preenche o campo tipo de avaliacao com o primeiro item disponivel
    And O usuario valida nao existencia da mensagem de obrigatoriedade do campo tipo de avaliacao
    And O usuario realiza o logoff
