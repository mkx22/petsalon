//人
package njuics.demos.petsalon.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity // This tells Hibernate to make a table out of this class
public class Owner {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    //owner - n pets
    @OneToMany(targetEntity = Pet.class,cascade = CascadeType.ALL)
    @JoinColumn(name="owner_pet",referencedColumnName = "id")
    private List<Pet> pets;

//    Owner(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
