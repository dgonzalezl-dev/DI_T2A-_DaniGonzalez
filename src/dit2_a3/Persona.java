package dit2_a3;
 
import javafx.beans.property.SimpleStringProperty;
 
public class Persona {
   private final SimpleStringProperty firstName = new SimpleStringProperty("");
   private final SimpleStringProperty lastName = new SimpleStringProperty("");
   private final SimpleStringProperty email = new SimpleStringProperty("");
   
   
    public Persona() {
        this("", "", "");
    }
    
    public Persona(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    public String getFirstName() {
        return firstName.get();
    }
 
    public void setFirstName(String fName) {
        firstName.set(fName);
    }
        
    public String getLastName() {
        return lastName.get();
    }
    
    public void setLastName(String fName) {
        lastName.set(fName);
    }
    
    public String getEmail() {
        return email.get();
    }
    
    public void setEmail(String fName) {
        email.set(fName);
    }
}