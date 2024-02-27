package com.br.automacao.reqres.utils;

import io.restassured.response.Response;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("cucumber-glue")
public class Constantes {

    private Integer id;
    private String idInvalido;
    private Response response;
}
