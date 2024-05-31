package Assured;
import org.testng.annotation.Test;
import io.restassured.Restassured;
public class TestGet01 {
	@Test
	void testget01() {
		RestAssured.get();
		
	}

}
