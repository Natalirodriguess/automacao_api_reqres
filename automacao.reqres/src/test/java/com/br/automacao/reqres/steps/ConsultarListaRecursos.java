package com.br.automacao.reqres.steps;

import com.br.automacao.reqres.utils.Constantes;
import com.br.automacao.reqres.utils.ConstantesPath;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsultarListaRecursos {
    Response response;
    Integer idUsuario;

    Constantes camposValores;

    @Autowired
    public ConsultarListaRecursos(Constantes camposValores){
        this.camposValores = camposValores;
    }

    @Dado("que eu possua um id de usuario existente")
    public void queEuPossuaUmIdDeUsuarioExistente() {
        idUsuario = 2;

    }

    @Quando("consulto os dados desse usuario")
    public void consultoOsDadosDesseUsuario() {
     camposValores.setResponse(RestAssured.get(ConstantesPath.baseURI + "/users/" + idUsuario));

    }

    @Entao("devo receber http status code {int}")
    public void devo_receber_http_status_code(Integer status) {
        camposValores.getResponse().then().statusCode(status).log().all();

    }

    @E("devo receber corretamente os dados do usuario consultado")
    public void devoReceberCorretamenteOsDadosDoUsuarioConsultado() {

    }

    @Dado("que eu possua os {string}")
    public void queEuPossuaOsIds(String id) {

        if(id.equals("st")){
            camposValores.setIdInvalido(id);
        } else {
            camposValores.setId(Integer.getInteger(id));
        }
    }

    @E("uma mensagem de excecao deve ser apresentada")
    public void umaMensagemDeExcecaoDeveSerApresentada() {

    }

    @Quando("consulto os dados do usuario")
    public void consultoOsDadosDoUsuario() {
        if (camposValores.getIdInvalido() == null) {
            camposValores.setResponse(RestAssured.get(ConstantesPath.baseURI + "/users/" + camposValores.getId()));
        } else{
            camposValores.setResponse(RestAssured.get(ConstantesPath.baseURI + "/users/" + camposValores.getIdInvalido()));
        }
    }

}
