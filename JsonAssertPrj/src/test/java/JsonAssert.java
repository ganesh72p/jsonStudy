import org.json.JSONException;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.annotations.Test;

public class JsonAssert {
	
	
	@Test
	public static void hello() throws JSONException{
		
		JSONObject actualJson = new JSONObject();
		actualJson.put("id", 370);
		actualJson.put("name", "Harish");
		actualJson.put("age", 37);
		actualJson.put("email", "harish@gmail.com");
		
		System.out.println(actualJson);

		JSONAssert.assertEquals("{id:370}", actualJson, false); 					
		JSONAssert.assertEquals("{name:\"Harish\"}", actualJson, false);		
		JSONAssert.assertEquals("{name:\"Harish\", age:37}", actualJson, false);
		JSONAssert.assertEquals("{name:Harish, id:370}", actualJson, false);		
		JSONAssert.assertEquals("{id:370, age:37}", actualJson, false);	
		
	}

}
