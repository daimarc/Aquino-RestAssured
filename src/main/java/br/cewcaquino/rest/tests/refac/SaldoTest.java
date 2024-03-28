package br.cewcaquino.rest.tests.refac;

import br.cewcaquino.rest.core.BaseTest;
import br.cewcaquino.rest.utils.BarrigaUtils;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class SaldoTest extends BaseTest {


    @Test
    public void deveCalcularSaldoContas(){
        Integer CONTA_ID = BarrigaUtils.getIdContaPeloNome("Conta para saldo");

         given()
         .when()
            .get("/saldo")
         .then()
            .statusCode(200)
            .body("find{it.conta_id == "+CONTA_ID+"}.saldo", is("534.00")) //pesquisa pela conta e pelo saldo especificamente
        ;
    }


}
