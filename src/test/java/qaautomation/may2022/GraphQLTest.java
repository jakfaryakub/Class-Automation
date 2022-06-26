package qaautomation.may2022;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.GraphQLRequestBuilder;
import static io.restassured.RestAssured.given;

public class GraphQLTest {
	
	@Test
	public void checkCEO() {
		GraphQLRequestBuilder gql = new GraphQLRequestBuilder();
		String query = "{\r\n" + "  company {\r\n" + "    ceo\r\n" + "    cto\r\n" + "  }\r\n" + "  }\r\n" + "";
		gql.setQuery(query);
		String jsonStringQuery = gql.getJSONString();
		
		Response responseCEO = given().contentType(ContentType.JSON).body(jsonStringQuery).when().post("https://api.spacex.land/graphql/");
		
		//System.out.println(responseCEO.jsonPath().get("data.company.ceo"));
		
		String expectedCEO = "Elon Musk";
		String expectedCTO = "Elon Musk";
		String ceoName = responseCEO.jsonPath().get("data.company.ceo");
		String ctoName = responseCEO.jsonPath().get("data.company.cto");
		
		Assert.assertEquals (expectedCEO, ceoName);
		Assert.assertEquals (expectedCTO, ctoName);
	}
}
