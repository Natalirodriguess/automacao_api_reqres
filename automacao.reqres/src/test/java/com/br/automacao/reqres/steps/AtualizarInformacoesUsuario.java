
package com.br.automacao.reqres.steps;

import com.br.automacao.reqres.utils.Constantes;
import com.br.automacao.reqres.utils.ConstantesPath;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import org.springframework.beans.factory.annotation.Autowired;

public class AtualizarInformacoesUsuario {

    Constantes camposValores;
    Integer idUsuario;

    @Autowired
    public AtualizarInformacoesUsuario(Constantes camposValores){
        this.camposValores = camposValores;
    }
    

    @Quando("consumo o endpoint de atualizar os dados desse usuario")
    public void consumoOEndpointDeAtualizarOsDadosDesseUsuario() {
        camposValores.setResponse(RestAssured.put(ConstantesPath.baseURI + "/users/" + idUsuario ));
    }

    @E("e na response deve informar que os dados foram atualizados com sucesso")
    public void eNaResponseDeveInformarQueOsDadosForamAtualizadosComSucesso() {
    }
}
