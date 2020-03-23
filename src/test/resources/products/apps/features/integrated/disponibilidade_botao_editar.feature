Feature: Disponibilidade botao editar para usuarios sem acesso

  @abrao @vendedor @botaoEditarAbrao
  Scenario: Disponibilidade botao ditar para usuarios sem acesso, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "abrao"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    #And A automacao espera o usuario resolver o captcha
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    #And O usuario seleciona o avaliador responsavel 1
    And O usuario insere um nome do cliente
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario utiliza scroll para navegar em 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo


  @abrao @avaliador @botaoEditarAbrao
  Scenario: Disponibilidade botao ditar para usuarios sem acesso, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "abrao"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    #And A automacao espera o usuario resolver o captcha
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario seleciona o avaliador responsavel 1
    And O usuario insere um nome do cliente
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario utiliza scroll para navegar em 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  @abrao @gerente @botaoEditarAbrao
  Scenario: Disponibilidade botao ditar para usuarios sem acesso, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "abrao"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    #And A automacao espera o usuario resolver o captcha
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario seleciona o avaliador responsavel 1
    And O usuario insere um nome do cliente
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario utiliza scroll para navegar em 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo





  @andreta @vendedor @botaoEditarAndreta @botaoEditarAndretaVendedor
  Scenario: Disponibilidade botao ditar para usuarios sem acesso, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "andreta"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    And A automacao espera o usuario resolver o captcha
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido
    And O usuario insere um nome do cliente
    And O usuario preenche o campo e-mail para solicitacao de avaliacao
    And O usuario insere um telefone
    And O usuario insere um celular
    And O usuario utiliza scroll para navegar em 1000
    And O usuario insere uma placa real
    And O usuario insere um numero de renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o campo observacoes
    And O usuario utiliza scroll para navegar em -1000
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  @andreta @avaliador @botaoEditarAndreta @botaoEditarAndretaAvaliador
  Scenario: Disponibilidade botao ditar para usuarios sem acesso, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "andreta"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    #And A automacao espera o usuario resolver o captcha
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario seleciona o avaliador responsavel 1
    And O usuario insere um nome do cliente
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario utiliza scroll para navegar em 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  @andreta @gerente @botaoEditarAndreta @botaoEditarAndretaGerente
  Scenario: Disponibilidade botao ditar para usuarios sem acesso, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "andreta"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    #And A automacao espera o usuario resolver o captcha
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido
    And O usuario insere um nome do cliente
    And O usuario preenche o campo e-mail para solicitacao de avaliacao
    And O usuario insere um telefone
    And O usuario insere um celular
    And O usuario utiliza scroll para navegar em 700
    And O usuario insere uma placa real
    And O usuario insere um numero de renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o campo observacoes
    And O usuario utiliza scroll para navegar em -700
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo
