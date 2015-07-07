package models.repository.impl;

import com.avaje.ebean.Ebean;
import models.entity.User;
import models.repository.UserRepository;

import java.util.List;

/**
 * Created by rakateja on 6/30/15.
 *
 * User Repository class
 * @author Raka Teja
 */
public class UserRepositoryImpl implements UserRepository{

    @Override
    public User create(User user) {
        Ebean.save(user);
        return user;
    }

    @Override
    public User update(Integer id, User user) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
