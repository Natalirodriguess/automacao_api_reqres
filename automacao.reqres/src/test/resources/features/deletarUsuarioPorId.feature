#language: pt
  Funcionalidade: Deletar Usuário Por Id
    Cenario: Deletar usuário por id com sucesso
      Dado que eu possua o id 6
      Quando que eu consumo o endpoint de deletar usuarios passando o id informado
      Entao devo receber http status code 204
      E o usuario deve ter sido deletado