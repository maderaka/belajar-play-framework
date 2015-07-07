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
 * Role entity class
 * @author Raka Teja
 */

@Entity
@Table(name = "roles")
public class Role extends Model{

    public static Finder<Integer, Role> find = new Finder<Integer, Role>(Integer.class, Role.class);

    @Id
    private Integer id;

    @Column(name = "title", length = 50)
    private String title;

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns=@JoinColumn(name="user_id")
    )
    private List<User> users;

    @Column(name = "created_at")
    @CreatedTimestamp
    private DateTime createdAt;

    @Column(name = "updated_at")
    @UpdatedTimestamp
    private DateTime updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
