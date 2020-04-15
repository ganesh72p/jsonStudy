
public class Employee extends FromJavaPojoToJSON
{
    private Integer id;
    private String name;
    private Integer age;
    private String location;
     
    public Employee(Integer id, String name, Integer age, String location) {
    	
    	super();
        this.id = 1;
        this.name =name;
        this.age = age;
        this.location = location;
    }
 
    //Setters and Getters will be added here
 
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age
                + ", location=" + location + "]";
    }
}