package com.ak.crudDemo.service;

import com.ak.crudDemo.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {

    public List<Employee> getAllEmployee();

    public Employee saveEmployee(Employee employee);

    public Optional<Employee> getEmployeeById(Long id);

}
