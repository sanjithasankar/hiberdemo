import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdb")
public class Students {
	@Id
	private int id;
    private String Name;
    private  String Email;
    private String Course;
    
    
	public Students(int id, String name, String email, String course) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		Course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
    
  
	

}
