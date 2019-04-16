//宠物享受的服务
package njuics.demos.petsalon.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

enum ServiceCategory {
    a("大波浪"),
    b("公主切"),
    c("锡纸烫"),
    d("美甲"),
    e("染毛"),
    f("洗牙");

    private String category;

    ServiceCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

@Data
@Entity // This tells Hibernate to make a table out of this class
public class Service {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private Date date;
    private double fee;
    private ServiceCategory category;

}
