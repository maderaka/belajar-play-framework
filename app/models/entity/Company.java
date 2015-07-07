package models.entity;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.List;

/**
 * Created by rakateja on 6/28/15.
 *
 * Company entity class
 * @author Raka Teja
 */

@Entity
@Table(name = "companies")
public class Company extends Model {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private List<Employee> employees;

    @ManyToOne
    private List<User> users;

    @Column(name = "created_at")
    @CreatedTimestamp
    private DateTime createdAt;

    @Column(name = "updated_at")
    @UpdatedTimestamp
    private DateTime updatedAt;
}
