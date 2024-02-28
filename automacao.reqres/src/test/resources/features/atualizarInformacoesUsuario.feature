#language: pt
  Funcionalidade: Atualizar informações de Usuario
    Cenario: Atualizar informações de usuário com sucesso
      Dado que eu possua um id de usuario existente
      Quando consumo o endpoint de atualizar os dados desse usuario
      Entao devo receber http status code 200
      E e na response deve informar que os dados foram atualizados com sucesso