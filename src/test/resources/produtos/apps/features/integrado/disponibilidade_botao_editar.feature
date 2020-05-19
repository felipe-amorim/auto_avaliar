Feature: Disponibilidade botao editar para usuarios sem acesso


  ## GRUPO ABRAO ##
  @abrao @vendedor @botaoEditarAbrao @botaoEditarAbraovendedor @Sucesso @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Vendedor abrao, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "abrao"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario seleciona o avaliador responsavel 1
    And O usuario insere um nome do cliente
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo


  @abrao @avaliador @botaoEditarAbrao @botaoEditarAbraoAvaliador @Sucesso @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Avaliador abrao, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "abrao"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario seleciona o avaliador responsavel 1
    And O usuario insere um nome do cliente
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  @abrao @gerente @botaoEditarAbrao @botaoEditarAbraoGerente @Sucesso @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Gerente abrao, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "abrao"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario seleciona o avaliador responsavel 1
    And O usuario insere um nome do cliente
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


#####################################################################################################################################
#####################################################################################################################################


  ## GRUPO ANDRETA ##
  @andreta @vendedor @botaoEditarAndreta @botaoEditarAndretavendedor @Sucesso @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Vendedor andreta, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "andreta"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo


  @andreta @avaliador @botaoEditarAndreta @botaoEditarAndretaAvaliador @Sucesso @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Avaliador andreta, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "andreta"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  @andreta @gerente @botaoEditarAndreta @botaoEditarAndretaGerente @Sucesso @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Gerente andreta, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "andreta"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


#####################################################################################################################################
#####################################################################################################################################


  ## GRUPO CAOA ##
  @caoa @vendedor @botaoEditarCacoa @botaoEditarCaoaVendedor @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Vendedor caoa, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "caoa"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo


  @caoa @vendedor @botaoEditarCacoa @botaoEditarCaoaAvaliador @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Avaliador caoa, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "caoa"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  @caoa @vendedor @botaoEditarCacoa @botaoEditarCaoaGerente @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Gerente caoa, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "caoa"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


#####################################################################################################################################
#####################################################################################################################################


  ## GRUPO CARHOUSE ##
  @carhouse @vendedor @botaoEditarCarhouse @botaoEditarCarHouseVendedor @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Vendedor CarHouse, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "carhouse"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o combobox possui manual para solicitar avaliacao com "Sim"
    And O usuario preenche o combobox o veiculo possui garantia com "Sim"
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 600
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo


  @carhouse @avaliador @botaoEditarCarhouse @botaoEditarCarHouseAvaliador @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Avaliador CarHouse, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "carhouse"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o combobox possui manual para solicitar avaliacao com "Sim"
    And O usuario preenche o combobox o veiculo possui garantia com "Sim"
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 600
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  @carhouse @gerente @botaoEditarCarhouse @botaoEditarCarHouseGerente @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Gerente CarHouse, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "carhouse"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o combobox possui manual para solicitar avaliacao com "Sim"
    And O usuario preenche o combobox o veiculo possui garantia com "Sim"
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 600
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


#####################################################################################################################################
#####################################################################################################################################


  ## GRUPO GNC ##
  @gnc @vendedor @botaoEditarGnc @botaoEditarGncVendedor @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Vendedor Gnc, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "gnc"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo


  @gnc @avaliador @botaoEditarGnc @botaoEditarGncAvaliador @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Avaliador Gnc, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "gnc"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  @gnc @gerente @botaoEditarGnc @botaoEditarGncGerente @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Gerente Gnc, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "gnc"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


#####################################################################################################################################
#####################################################################################################################################


  ## GRUPO JORLAN ##
  @jorlan @vendedor @botaoEditarJorlan @botaoEditarJorlanVendedor @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Vendedor Jorlan, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "jorlan"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o combobox possui manual do proprietario para solicitar avaliacao com "Sim"
    And O usuario preenche o combobox todas as revisoes feitas em concessionarias com "Sim"
    And O usuario preenche o combobox o veiculo possui garantia com "Sim"
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 800
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo


  @jorlan @avaliador @botaoEditarJorlan @botaoEditarJorlanAvaliador @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Avaliador Jorlan, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "jorlan"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o combobox possui manual do proprietario para solicitar avaliacao com "Sim"
    And O usuario preenche o combobox todas as revisoes feitas em concessionarias com "Sim"
    And O usuario preenche o combobox o veiculo possui garantia com "Sim"
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 800
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  @jorlan @gerente @botaoEditarJorlan @botaoEditarJorlanGerente @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Gerente Jorlan, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "jorlan"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o combobox possui manual do proprietario para solicitar avaliacao com "Sim"
    And O usuario preenche o combobox todas as revisoes feitas em concessionarias com "Sim"
    And O usuario preenche o combobox o veiculo possui garantia com "Sim"
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 800
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


#####################################################################################################################################
#####################################################################################################################################


  ## GRUPO NEWLAND ##
  @newland @vendedor @botaoEditarNewland @botaoEditarNewlandVendedor @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Vendedor New Land, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "newland"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o combobox possui manual para solicitar avaliacao com "Sim"
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 800
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo


  @newland @avaliador @botaoEditarNewland @botaoEditarNewlandAvaliador @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Avaliador New Land, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "newland"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o combobox possui manual para solicitar avaliacao com "Sim"
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 800
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  @newland @gerente @botaoEditarNewland @botaoEditarNewlandGerente @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Gerente New Land, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "newland"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o combobox possui manual para solicitar avaliacao com "Sim"
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 800
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


#####################################################################################################################################
#####################################################################################################################################


## GRUPO PARVI ##
  @parvi @vendedor @botaoEditarParvi @botaoEditarParviVendedor @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Vendedor Parvi, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "parvi"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o combobox livrete para solicitar avaliacao com "Sim"
    And O usuario preenche o combobox foram efetuadas revisoes com "Sim"
    And O usuario preenche o combobox de o veiculo esta em garantia de fabrica com "Sim"
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo


  @parvi @avaliador @botaoEditarParvi @botaoEditarParviAvaliador @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Avaliador Parvi, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "parvi"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o combobox livrete para solicitar avaliacao com "Sim"
    And O usuario preenche o combobox foram efetuadas revisoes com "Sim"
    And O usuario preenche o combobox de o veiculo esta em garantia de fabrica com "Sim"
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  @parvi @gerente @botaoEditarParvi @botaoEditarParviGerente @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Gerente Parvi, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "parvi"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o combobox livrete para solicitar avaliacao com "Sim"
    And O usuario preenche o combobox foram efetuadas revisoes com "Sim"
    And O usuario preenche o combobox de o veiculo esta em garantia de fabrica com "Sim"
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


#####################################################################################################################################
#####################################################################################################################################

## GRUPO SAGA ##
  @saga @vendedor @botaoEditarSaga @botaoEditarSagaVendedor @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Vendedor Saga, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "saga"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo


  ##TODO ESTE USUARIO, DIFERENTE DE TODOS OS OUTROS AVALIADORES, NAO TEM ACESSO A FUNCAO DE EDITAR DADOS DO VEICULO AVALIADO
  @saga @avaliador @botaoEditarSaga @botaoEditarSagaAvaliador @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Avaliador Saga, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "saga"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  @saga @gerente @botaoEditarSaga @botaoEditarSagaGerente @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Gerente Saga, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "saga"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


#####################################################################################################################################
#####################################################################################################################################


## GRUPO SERVOPA ##
  @servopa @vendedor @botaoEditarServopa @botaoEditarServopaVendedor @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Vendedor Servopa, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "servopa"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o combobox possui manual para solicitar avaliacao com "Sim"
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo


  @servopa @avaliador @botaoEditarServopa @botaoEditarServopaAvaliador @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Avaliador Servopa, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "servopa"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o combobox possui manual para solicitar avaliacao com "Sim"
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  ##TODO ESTE USUARIO DIFERENTE DE TODOS OS OUTROS USUARIOS QUANDO ABRE UMA AVALIACAO ELE JA VEM COM OS DADOS DA AVALIACAO
  ##TODO ABERTOS PARA EDICAO DIFERENTE DE TODOS OS OUTROS USUARIOS QUE PRECISA ABRIR PARA EDICAO
  @servopa @gerente @botaoEditarServopa @botaoEditarServopaGerente @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Gerente Servopa, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "Gerente" do grupo "servopa"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o combobox possui manual para solicitar avaliacao com "Sim"
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


#####################################################################################################################################
#####################################################################################################################################


## GRUPO TIMEQA ##
  @timeqa @vendedor @botaoEditarTimeQA @botaoEditarTimeQAVendedor @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Vendedor TimeQA, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "servopa"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o combobox possui manual para solicitar avaliacao com "Sim"
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo


  @timeqa @avaliador @botaoEditarTimeQA @botaoEditarTimeQAAvaliador @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Avaliador TimeQA, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "servopa"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o combobox possui manual para solicitar avaliacao com "Sim"
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  ##TODO ESTE USUARIO DIFERENTE DE TODOS OS OUTROS USUARIOS QUANDO ABRE UMA AVALIACAO ELE JA VEM COM OS DADOS DA AVALIACAO
  ##TODO ABERTOS PARA EDICAO DIFERENTE DE TODOS OS OUTROS USUARIOS QUE PRECISA ABRIR PARA EDICAO
  @timeqa @gerente @botaoEditarTimeQA @botaoEditarTimeQAGerente @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Gerente TimeQA, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "servopa"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um cpf valido para solicitar avaliacao
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o combobox possui manual para solicitar avaliacao com "Sim"
    And O usuario seleciona sim para chave reserva
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


#####################################################################################################################################
#####################################################################################################################################

## GRUPO VIAMAR ##
  @viamar @vendedor @botaoEditarTimeViamar @botaoEditarViamarVendedor @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Vendedor Viamar, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "viamar"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o combobox foram efetuadas revisoes com "Sim"
    And O usuario preenche o combobox o veiculo possui garantia com "Sim"
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo


  ##TODO ESTE USUARIO DIFERENTE DE TODOS OS OUTROS COM PERFIL DE AVALIADOR NAO TEM ACESSO A EDITAR DADOS DE UMA AVALIACAO JA EXISTENTES
  @viamar @avaliador @botaoEditarTimeViamar @botaoEditarViamarAvaliador @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Avaliador Viamar, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "viamar"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o combobox foram efetuadas revisoes com "Sim"
    And O usuario preenche o combobox o veiculo possui garantia com "Sim"
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  @viamar @gerente @botaoEditarTimeViamar @botaoEditarViamarGerente @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Gerente Viamar, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "viamar"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario preenche o combobox foram efetuadas revisoes com "Sim"
    And O usuario preenche o combobox o veiculo possui garantia com "Sim"
    And O usuario preenche o campo observacoes para solicitar avaliacao
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


######################################################################################################################################
######################################################################################################################################


## GRUPO CARRERA ##
  @carrera @vendedor @botaoEditarTimeCarrera @botaoEditarCarreraVendedor @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Vendedor Carrera, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "vendedor" do grupo "carrera"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil nao tem acesso ao campo editar dados do veiculo


  @carrera @avaliador @botaoEditarTimeCarrera @botaoEditarCarreraAvaliador @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Avaliador Carrera, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "avaliador" do grupo "carrera"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo


  @carrera @gerente @botaoEditarTimeCarrera @botaoEditarCarreraGerente @botaoEditar
  Scenario: Disponibilidade botao ditar para usuarios sem acesso -- Gerente Carrera, Author: Denis Castro, Category: exploratory, Environment: Google Chrome
    Given O usuario acessa a url do portal apps usbi
    And O usuario preenche o campo e-mail como "gerente" do grupo "carrera"
    And O usuario preenche o campo password a senha padrao
    And O usuario clica no botao log in
    When O usuario clica no botao solicitar avaliacao
    Then O usuario valida que a tela solicitar avaliacao carregou com sucesso
    And O usuario seleciona o tipo de avaliacao "Somente compra"
    And O usuario insere um nome do cliente
    And O usuario insere um email
    And O usuario insere um telefone para solicitar avaliacao
    And O usuario insere um celular
    And O usuario utiliza scroll para descer 500
    And O usuario insere uma placa real
    And O usuario preenche o campo renavam
    And O usuario insere um valor para expectativa do cliente
    And O usuario utiliza scroll para subir 500
    And O usuario clica no botao solicitar para realizar solicitacao de avaliacao
    And O usuario insere uma placa para o campo buscar placa avaliacoes cadastradas
    And O usuario clica em buscar para filtrar avaliacoes
    And O usuario seleciona o primeiro veiculo da busca de veiculos cadastrados
    And O usuario valida que a tela de avaliacao de veiculo carregou
    And O usuario clica no botao editar dados do veiculo avaliado
    Then o usuario valida que o perfil tem acesso ao campo editar dados do veiculo