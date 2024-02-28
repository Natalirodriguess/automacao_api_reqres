
package com.br.automacao.reqres.steps;

import com.br.automacao.reqres.utils.Constantes;
import com.br.automacao.reqres.utils.ConstantesPath;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import org.springframework.beans.factory.annotation.Autowired;

public class AtualizarDadosUsuario {

    Constantes camposValores;
    Integer idUsuario;

    @Autowired
    public AtualizarDadosUsuario(Constantes camposValores){
        this.camposValores = camposValores;
    }

    @Quando("consumo o endpoint de atualizar os dados completos desse usuario")
    public void consumoOEndpointDeAtualizarOsDadosCompletosDesseUsuario() {
        camposValores.setResponse(RestAssured.patch(ConstantesPath.baseURI + "/users/" + idUsuario ));
    }

    @E("a atualizacao dos dados deve ter sifo realizada com sucesso")
    public void aAtualizacaoDosDadosDeveTerSifoRealizadaComSucesso() {
    }
}
