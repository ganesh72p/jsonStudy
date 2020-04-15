
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JSONToJavaExample
{
	private Integer id;
    private String name;
    private Integer age;
    private String location;
     
    public JSONToJavaExample(Integer id, String name, Integer age, String location) {
    	
    	
        this.id = id;
        this.name =name;
        this.age = age;
        this.location = location;
    }
 
	
   public static void main(String[] args)
   {
      Employee employee = null;
      ObjectMapper mapper = new ObjectMapper();
     // mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
      try
      {
         employee =  mapper.readValue(new File("D://JsonStudy/employee.json"), Employee.class);
         //emp=mapper.readValue(src, valueType),Employee.class
         //Reader reader1 = new FileReader("D:\\JsonStudy\\file1.json"),Employee.class);
      } catch (JsonGenerationException e)
      {
         e.printStackTrace();
      } catch (JsonMappingException e)
      {
         e.printStackTrace();
      } catch (IOException e)
      {
         e.printStackTrace();
      }
      System.out.println(employee);
   }
}
//D:\JsonStudy