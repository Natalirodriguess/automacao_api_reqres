#language: pt
  Funcionalidade: Obter Lista de Usuarios

    Cenario: Obter lista de usuarios com sucesso
      Quando que eu consulto o endpoint de listar usuarios
      Entao devo receber http status code 200
      E a listagem dos usuarios deve ser realizada com sucesso


