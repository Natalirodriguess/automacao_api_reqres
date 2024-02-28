package com.br.automacao.reqres.steps;

import com.br.automacao.reqres.utils.Constantes;
import com.br.automacao.reqres.utils.ConstantesPath;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsultarListaRecursos {

    Constantes camposValores;

    @Autowired
    public ConsultarListaRecursos(Constantes camposValores){
        this.camposValores = camposValores;
    }

    @Quando("que eu consulto o endpoint de listar recursos")
    public void queEuConsultoOEndpointDeListarRecursos() {
        camposValores.setResponse(RestAssured.get(ConstantesPath.baseURI + "/{resource}" ));
    }

    @E("a listagem dos recursos deve ser realizada com sucesso")
    public void aListagemDosRecursosDeveSerRealizadaComSucesso() {

    }
}
