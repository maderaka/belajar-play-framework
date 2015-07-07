package models.repository;

import com.google.inject.ImplementedBy;
import models.entity.Employee;
import models.repository.impl.EmployeeRepositoryImpl;

import java.util.List;

/**
 * Created by rakateja on 6/27/15.
 *
 * EmployeeRepository interface
 * @author Raka Teja
 */

@ImplementedBy(EmployeeRepositoryImpl.class)
public interface EmployeeRepository {

    public List<Employee> findAll();

    public Employee findById(Long id);

    public Employee create(Employee employee);

    public Employee update(Long identifier, Employee employee);

    public boolean delete(Long id);
}
