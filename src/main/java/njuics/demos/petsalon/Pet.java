package njuics.demos.petsalon;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

enum PetType {
    DOG("狗"),
    CAT("猫"),
    BIRD("鸟"),
    PIG("猪");

    private String type;

    PetType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

@Data
@Entity // This tells Hibernate to make a table out of this class
public class Pet {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String name;

    private PetType type;

}
