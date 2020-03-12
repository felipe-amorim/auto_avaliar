Feature: Validar o funcionamento do botão de login

  #Grupo Abrão Reze
  @GrupoAbraoReze @Vendedor
  Scenario: CT_001, Author: Felipe Amorim, Category: login-vendedor, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "vendedortimeqa@abrao.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  @GrupoAbraoReze @Avaliador
  Scenario: CT_002, Author: Felipe Amorim, Category: login-avaliador, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "avaliadortimeqa@abrao.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  @GrupoAbraoReze @Gerente
  Scenario: CT_003, Author: Felipe Amorim, Category: login-gerente, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "gerentetimeqa@abrao.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  #Grupo Andreta
  Scenario: CT_004, Author: Felipe Amorim, Category: login-vendedor, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "vendedortimeqa@andreta.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_005, Author: Felipe Amorim, Category: login-avaliador, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "avaliadortimeqa@andreta.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_006, Author: Felipe Amorim, Category: login-gerente, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "gerentetimeqa@andreta.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

    #Grupo CAOA
  Scenario: CT_007, Author: Felipe Amorim, Category: login-vendedor, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "vendedortimeqa@caoa.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_008, Author: Felipe Amorim, Category: login-avaliador, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "avaliadortimeqa@caoa.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_009, Author: Felipe Amorim, Category: login-gerente, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "gerentetimeqa@caoa.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

    #Grupo Carhouse
  Scenario: CT_010, Author: Felipe Amorim, Category: login-vendedor, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "vendedortimeqa@carhouse.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_011, Author: Felipe Amorim, Category: login-avaliador, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "avaliadortimeqa@carhouse.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_012, Author: Felipe Amorim, Category: login-gerente, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "gerentetimeqa@carhouse.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

    #Grupo GNC
  Scenario: CT_013, Author: Felipe Amorim, Category: login-vendedor, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "vendedortimeqa@gnc.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_014, Author: Felipe Amorim, Category: login-avaliador, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "avaliadortimeqa@gnc.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_015, Author: Felipe Amorim, Category: login-gerente, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "gerentetimeqa@gnc.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

    #Grupo Jorlan
  Scenario: CT_016, Author: Felipe Amorim, Category: login-vendedor, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "vendedortimeqa@jorlan.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_017, Author: Felipe Amorim, Category: login-avaliador, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "avaliadortimeqa@jorlan.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_018, Author: Felipe Amorim, Category: login-gerente, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "gerentetimeqa@jorlan.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

    #Grupo Localiza Oficial
  Scenario: CT_019, Author: Felipe Amorim, Category: login-vendedor, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "vendedortimeqa@localiza.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_020, Author: Felipe Amorim, Category: login-avaliador, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "avaliadortimeqa@localiza.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_021, Author: Felipe Amorim, Category: login-gerente, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "gerentetimeqa@localiza.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

    #Grupo Newland
  Scenario: CT_022, Author: Felipe Amorim, Category: login-vendedor, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "vendedortimeqa@newland.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_023, Author: Felipe Amorim, Category: login-avaliador, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "avaliadortimeqa@newland.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_024, Author: Felipe Amorim, Category: login-gerente, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "gerentetimeqa@newland.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

    #Grupo Parvi
  Scenario: CT_025, Author: Felipe Amorim, Category: login-vendedor, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "vendedortimeqa@parvi.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_026, Author: Felipe Amorim, Category: login-avaliador, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "avaliadortimeqa@parvi.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_027, Author: Felipe Amorim, Category: login-gerente, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "gerentetimeqa@parvi.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

    #Grupo Saga
  Scenario: CT_028, Author: Felipe Amorim, Category: login-vendedor, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "vendedortimeqa@saga.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_029, Author: Felipe Amorim, Category: login-avaliador, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "avaliadortimeqa@saga.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_030, Author: Felipe Amorim, Category: login-gerente, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "gerentetimeqa@saga.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

    #Grupo Servopa
  Scenario: CT_031, Author: Felipe Amorim, Category: login-vendedor, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "vendedortimeqa@servopa.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_032, Author: Felipe Amorim, Category: login-avaliador, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "avaliadortimeqa@servopa.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_033, Author: Felipe Amorim, Category: login-gerente, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "gerentetimeqa@servopa.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

    #Testes Auto Avaliar
  Scenario: CT_034, Author: Felipe Amorim, Category: login-vendedor, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "vendedortimeqa@autoavaliar.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_035, Author: Felipe Amorim, Category: login-avaliador, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "avaliadortimeqa@autoavaliar.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_036, Author: Felipe Amorim, Category: login-gerente, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "gerentetimeqa@autoavaliar.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

    #Grupo Viamar
  Scenario: CT_037, Author: Felipe Amorim, Category: login-vendedor, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "vendedortimeqa@viamar.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_038, Author: Felipe Amorim, Category: login-avaliador, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "avaliadortimeqa@viamar.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_039, Author: Felipe Amorim, Category: login-gerente, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "gerentetimeqa@viamar.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

    #Grupo Carrera
  Scenario: CT_040, Author: Felipe Amorim, Category: login-vendedor, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "vendedortimeqa@carrera.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_041, Author: Felipe Amorim, Category: login-avaliador, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "avaliadortimeqa@carrera.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso

  Scenario: CT_042, Author: Felipe Amorim, Category: login-gerente, Environment: Google Chrome
    Given O usuario acessa "https://apps.autoavaliar.com.br/login/usbi#"
    And O usuario preenche o campo e-mail com "gerentetimeqa@carrera.com.br"
    And O usuario preenche o campo password com "timeqa0102"
    When O usuario clica no botao log in
    Then O usuario valida que a tela de dashboard carregou com sucesso




