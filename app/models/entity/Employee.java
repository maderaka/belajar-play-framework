package models.entity;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.CreatedTimestamp;
import com.avaje.ebean.annotation.UpdatedTimestamp;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.List;

/**
 * Created by rakateja on 6/27/15.
 *
 * Employee entity class
 * @author Raka Teja
 */

@Entity
@Table(name="employees")
public class Employee extends Model{

    @Id
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="nickname")
    private String nickname;

    @Column(name="email_address")
    private String emailAddress;

    @Column(name="mobile_phone")
    private String mobilePhone;

    @Column(name="avatar")
    private String avatar;

    @Column(name="joined_at")
    private DateTime joinedDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "employee_educations",
            joinColumns = @JoinColumn(name = "education_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id")
    )
    private List<Education> educations;

    @OneToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @CreatedTimestamp
    @Column(name="created_at")
    private DateTime createdAt;

    @UpdatedTimestamp
    @Column(name="updated_at")
    private DateTime updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public DateTime getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(DateTime joinedDate) {
        this.joinedDate = joinedDate;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
