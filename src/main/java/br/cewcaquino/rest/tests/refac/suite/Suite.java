package br.cewcaquino.rest.tests.refac.suite;

import br.cewcaquino.rest.core.BaseTest;
import br.cewcaquino.rest.tests.refac.AuthTest;
import br.cewcaquino.rest.tests.refac.ContasTest;
import br.cewcaquino.rest.tests.refac.MovimentacaoTest;
import br.cewcaquino.rest.tests.refac.SaldoTest;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

@RunWith(org.junit.runners.Suite.class)
@org.junit.runners.Suite.SuiteClasses({
        ContasTest.class,
        MovimentacaoTest.class,
        SaldoTest.class,
        AuthTest.class
})
public class Suite extends BaseTest {

    @BeforeClass
    public static void login(){
        Map<String, String> login = new HashMap<>();
        login.put("email", "daimarkc@gmail.com");
        login.put("senha", "123456");

        String TOKEN = given()
                .body(login)
                .when()
                .post("/signin")
                .then()
                .statusCode(200)
                .extract().path("token");

        RestAssured.requestSpecification.header("Authorization", "JWT " + TOKEN); //para apis mais recentes, substituir o JWT por bearer

        RestAssured.get("/reset").then().statusCode(200); // reseta a massa de dados para ela ficar preparada e independente para cada método de teste

    }

}
