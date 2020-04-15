import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
 
public class JSONToMap
{
    public static void main(String[] args) 
    {
        String json = "{\"id\":1,\"name\":\"Lokesh Gupta\",\"age\":34,\"location\":\"India\"}";
         
        HashMap<String, Object> map = new HashMap<String, Object>();
         
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
        try
        {
            //Convert Map to JSON
            map = (HashMap<String, Object>) mapper.readValue(json, new TypeReference<Map<String, Object>>(){});
             
            //Print JSON output
            System.out.println(map);
        } 
        catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
