package models.repository.impl;

import models.entity.Employee;
import models.repository.EmployeeRepository;

import java.util.List;

/**
 * Created by rakateja on 6/27/15.
 */
public class EmployeeRepositoryImpl implements EmployeeRepository{

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee findById(Long id) {
        return null;
    }

    @Override
    public Employee create(Employee employee) {
        return null;
    }

    @Override
    public Employee update(Long identifier, Employee employee) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
