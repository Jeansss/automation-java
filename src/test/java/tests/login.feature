Feature: Login
  Eu como usuário
  Desejo realizar login
  Para ter acesso ao site

  Scenario: Realizar Login com Sucesso
    Given acessar home do site
    When preencher os dados de login e avançar
    Then validar login com sucesso
  git remote add origin https://github.com/Jeansss/automation-java



