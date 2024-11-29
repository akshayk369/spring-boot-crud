package com.ak.crudDemo.service;

import com.ak.crudDemo.entity.Employee;

import java.util.List;

public interface EmployeeServiceInterface {

    public List<Employee> getAllEmployee();

    public Employee saveEmployee(Employee employee);

    public Employee getEmployeeById(Long id);

    public void deleteEpById(Long id);

    public Employee updateEmpData(Employee employee);
}
