package models.repository.impl;

import com.avaje.ebean.Ebean;
import models.entity.Role;
import models.repository.RoleRepository;

import java.util.List;

/**
 * Created by rakateja on 7/2/15.
 *
 * @author Raka Teja
 */
public class RoleRepositoryImpl implements RoleRepository {

    protected Ebean ebean;

    protected Role role;

    @Override
    public Role create(Role role) {
        this.ebean.save(role);
        return role;
    }

    @Override
    public Role findById(Integer id) {
        return this.role.find.byId(id);
    }

    @Override
    public Role update(Integer id, Role role) {
        role.update();
        return role;
    }

    @Override
    public List<Role> findAll() {
        return this.role.find.all();
    }

    @Override
    public boolean delete(Integer id) {
        Role role = Ebean.find(Role.class, id);
        Ebean.delete(role);
        return true;
    }
}
