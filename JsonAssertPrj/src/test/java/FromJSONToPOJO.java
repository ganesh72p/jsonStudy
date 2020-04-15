import java.io.IOException;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

 
public class FromJSONToPOJO {
     
    public static void main(String[] args) {
        String json = "{\"id\":1,\"name\":\"Lokesh Gupta\",\"age\":34,\"location\":\"India\"}";
         
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
        try
        {
            Employee emp = mapper.readValue(json, Employee.class);
             
            System.out.println(emp);
        } 
        catch (JsonGenerationException e) 
        {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}