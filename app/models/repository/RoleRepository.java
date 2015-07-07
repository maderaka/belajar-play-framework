package models.repository;

import com.google.inject.ImplementedBy;
import models.entity.Role;
import models.repository.impl.RoleRepositoryImpl;

import java.util.List;

/**
 * Created by rakateja on 7/2/15.
 *
 * @author Raka Teja
 */

@ImplementedBy(RoleRepositoryImpl.class)
public interface RoleRepository {

    public Role create(Role role);

    public Role findById(Integer id);

    public Role update(Integer id, Role role);

    public List<Role> findAll();

    public boolean delete(Integer id);
}
