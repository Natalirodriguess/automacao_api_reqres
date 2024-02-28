#language: pt
  Funcionalidade: Atualizar Dados Usuário
    Cenario: Atualizar dados usuário com sucesso
      Dado que eu possua um id de usuario existente
      Quando consumo o endpoint de atualizar os dados completos desse usuario
      Entao devo receber http status code 200
      E a atualizacao dos dados deve ter sifo realizada com sucesso