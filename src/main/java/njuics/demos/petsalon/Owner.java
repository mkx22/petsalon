package njuics.demos.petsalon;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity // This tells Hibernate to make a table out of this class
public class Owner {
    private @Id @GeneratedValue int id;
    private String name;

    Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
