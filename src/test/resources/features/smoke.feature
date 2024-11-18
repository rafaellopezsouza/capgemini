#language: pt


  Funcionalidade: Realizar Login ao SauceDemo com sucesso

    @smoke
    Cenário: Login com credenciais válidas
      Dado que o utilizador está no ecrã de login do SauceDemo
      Quando o utilizador insere as credenciais válidas
      Então ele deve ver ecrã inicial com a lista de produtos
