package br.cewcaquino.rest.tests.refac;

import br.cewcaquino.rest.core.BaseTest;
import io.restassured.RestAssured;
import io.restassured.specification.FilterableRequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class AuthTest extends BaseTest {


    @Test
    public void naoDeveAcessarAPISemToken(){
        FilterableRequestSpecification req = (FilterableRequestSpecification) RestAssured.requestSpecification; //Filtra a requisição
        req.removeHeader("Authorization"); // Remove o token/authorization do header

        given()
                .when()
                .get("/contas")
                .then()
                .statusCode(401)
        ;
    }

    public Integer getIdContaPeloNome(String nome){
        return RestAssured.get("/contas?nome="+nome).then().extract().path("id[0]");
    }

}
