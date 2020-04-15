import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public class jsonCompareExample {

@Test
public void myTest() throws FileNotFoundException, JSONException {
	
	Gson gson = new GsonBuilder().setPrettyPrinting().create();

	Reader reader1 = new FileReader("src/main/resources/file1.json");
	
    JsonElement json1 = gson.fromJson(reader1, JsonElement.class);

    String jsonInString1 = gson.toJson(json1);
    
    Reader reader2 = new FileReader("src/main/resources/file2.json");
	
    JsonElement json2 = gson.fromJson(reader2, JsonElement.class);

    String jsonInString2 = gson.toJson(json2);
    
    JSONAssert.assertEquals(jsonInString1, jsonInString2, JSONCompareMode.STRICT);
    
    if(jsonInString1==jsonInString2)
    {
    	System.out.println("Json File Matched");
    	
    }else {
    	
    	System.out.println("Json File Matched");
    }	
    
    System.out.println(jsonInString1);
    System.out.println(jsonInString2);
}
}