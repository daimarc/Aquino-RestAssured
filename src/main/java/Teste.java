
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;


public class Teste {

    @Test
    public void deveValidarBody() {
        given()
                .when()
                .get("https://restapi.wcaquino.me/users/1")
                .then()
                .statusCode(200)
                .body("id", is(1));
    }
}