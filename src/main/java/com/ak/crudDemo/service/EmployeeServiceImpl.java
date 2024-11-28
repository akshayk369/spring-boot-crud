package com.ak.crudDemo.service;

import com.ak.crudDemo.entity.Employee;
import com.ak.crudDemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {


    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        System.out.println("emter saveEmployee service");
        Employee savedEmployee = employeeRepo.saveAndFlush(employee);
        return savedEmployee;
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        Optional<Employee> employeeList = employeeRepo.findById(id);
        return employeeList;
    }
}
