package com.br.automacao.reqres;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/br/automacao/reqres/steps",
        plugin = {"pretty", "html:target/cucumber-reports"}

    )
public class Runner{

}


