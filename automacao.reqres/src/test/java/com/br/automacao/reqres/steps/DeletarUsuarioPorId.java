
package com.br.automacao.reqres.steps;

import com.br.automacao.reqres.utils.Constantes;
import com.br.automacao.reqres.utils.ConstantesPath;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import org.springframework.beans.factory.annotation.Autowired;

public class DeletarUsuarioPorId {

    Constantes camposValores;
    Integer idUsuario;

    @Autowired
    public DeletarUsuarioPorId(Constantes camposValores){
        this.camposValores = camposValores;
    }

    @Dado("que eu possua o id {int}")
    public void queEuPossuaOId(Integer idUsuario) {
        idUsuario = 6;
    }

    @Quando("que eu consumo o endpoint de deletar usuarios passando o id informado")
    public void queEuConsumoOEndpointDeDeletarUsuariosPassandoOIdInformado() {
        camposValores.setResponse(RestAssured.delete(ConstantesPath.baseURI + "/users/" + idUsuario ));
    }

    @E("o usuario deve ter sido deletado")
    public void oUsuarioDeveTerSidoDeletado() {
    }
}
