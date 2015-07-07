package models.repository;

import com.avaje.ebean.Ebean;
import models.entity.User;

import java.util.List;

/**
 * Created by rakateja on 6/30/15.
 *
 * User Repository interface
 * @author Raka Teja
 */
public interface UserRepository {

    public User create(User user);

    public User update(Integer id, User user);

    public boolean delete(Integer id);

    public User findById(Integer id);

    public List<User> findAll();
}
