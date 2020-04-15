

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FromJavaPojoToJSON {

	
	public static void main(String[] args) 
    {
        Employee emp = new Employee(1, "Lokesh Gupta", 34, "India");
 
        ObjectMapper mapper = new ObjectMapper();
       mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
        
        try
        {
           // String json = mapper.writeValueAsString(emp);
            String json=mapper.writeValueAsString(emp);
           System.out.println(json);
 
            //Use pretty print for printing the output
            String beutifulJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
           // String beautifuljson=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(value)
            
            System.out.println(beutifulJson);
 
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

