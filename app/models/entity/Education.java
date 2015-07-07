package models.entity;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import org.joda.time.DateTime;

import javax.persistence.*;

/**
 * Created by rakateja on 6/27/15.
 *
 * Education entity class
 * @author Raka Teja
 */

@Entity
@Table(name = "educations")
public class Education extends Model {

    @Id
    private Integer id;

    @Column(name = "school")
    private String school;

    @Column(name = "year_start", length = 4)
    private String yearStart;

    @Column(name = "year_until", length = 4)
    private String yearUntil;

    @Column(name = "degree")
    private int degree;

    @Column(name = "field")
    private String field;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @UpdatedTimestamp
    @Column(name = "created_at")
    private DateTime createdAt;

    @UpdatedTimestamp
    @Column(name="updated_at")
    private DateTime updatedAt;


}
