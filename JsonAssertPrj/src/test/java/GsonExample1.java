
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;

public class GsonExample1 {

    public static void main(String[] args) throws FileNotFoundException, JSONException 
    {

		// JSON Pretty Print helps Pretty JSON data and Print JSON data
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        // FileReader to Read a json file from a specified PATH

        Reader reader = new FileReader("D:\\JsonStudy\\file1.json");
		
        JsonElement json = gson.fromJson(reader, JsonElement.class);

        String jsonInString = gson.toJson(json);
			
        System.out.println(jsonInString);

        JSONAssert.assertEquals("{fruit:\"Apple\"}", jsonInString, false);
        


    }
    
}