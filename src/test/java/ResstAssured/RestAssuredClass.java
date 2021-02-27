package ResstAssured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static com.jayway.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;

public class RestAssuredClass {

    static ValidatableResponse validatableResponse;

    public static void main(String[] args) throws FileNotFoundException {
        RestAssured.baseURI = "https://reqres.in/api";
        String path = "/users?page=2";

        validatableResponse = given().contentType(ContentType.JSON).when().get(path).then().statusCode(200);
        validatableResponse.extract().response().body().prettyPeek();

        ReqRes reqRes;
        reqRes = validatableResponse.extract().response().as(ReqRes.class);

        for (ReqResData data : reqRes.getData())
         {
            System.out.println(data.getEmail());
        }

        String contractFileToCompare = System.getProperty("user.dir") + "/src/test/java/ResstAssured/ReqResSchema.json";
        Scanner scannerForContract;
        scannerForContract = new Scanner(new File(contractFileToCompare));
        String jsonObject = scannerForContract.useDelimiter("\\Z").next();
        String response = validatableResponse.extract().response().asString();
        assertThat(response, matchesJsonSchema(jsonObject));
    }
}
