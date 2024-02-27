#language: pt
  Funcionalidade: Consultar Dados de Usuario

    Cenario: Consultar dados de usuario com sucesso
      Dado que eu possua um id de usuario existente
      Quando consulto os dados desse usuario
      Entao devo receber http status code 200
      E devo receber corretamente os dados do usuario consultado

      Esquema do Cenário: Consultar dados de usuario inexistente e invalido
        Dado que eu possua os <ids>
        Quando consulto os dados do usuario
        Entao devo receber http status code <status>
        E uma mensagem de excecao deve ser apresentada
        Exemplos:
          | ids  |status|
          | "24" |  404 |
          | "st" |  400 |


