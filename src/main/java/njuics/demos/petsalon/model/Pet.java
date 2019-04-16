//宠物
package njuics.demos.petsalon.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

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
    private int id;
    private String name;
    private PetType type;

    @OneToMany(targetEntity = Pet.class,cascade = CascadeType.ALL)
    @JoinColumn(name="owner_pet",referencedColumnName = "id")
    private List<Service> services;
}
