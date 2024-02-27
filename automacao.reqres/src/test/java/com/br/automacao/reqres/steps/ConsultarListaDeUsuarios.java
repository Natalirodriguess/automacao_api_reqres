package com.br.automacao.reqres.steps;

import com.br.automacao.reqres.utils.Constantes;
import com.br.automacao.reqres.utils.ConstantesPath;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsultarListaDeUsuarios {

    Constantes camposValores;

    @Autowired
    public ConsultarListaDeUsuarios(Constantes camposValores){
        this.camposValores = camposValores;
    }
    @Before
    public void setUp() {
        // Configura a base URL da API
        RestAssured.baseURI = "https://reqres.in/";
    }


    @Quando("que eu consulto o endpoint de listar usuarios")
    public void que_eu_consulto_o_endpoint_de_listar_usuarios() {
        camposValores.setResponse(RestAssured.get(ConstantesPath.baseURI+ "/users"));

    }

    @Entao("a listagem dos usuarios deve ser realizada com sucesso")
    public void a_listagem_dos_usuarios_deve_ser_realizada_com_sucesso() {


    }
}
