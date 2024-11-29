package com.ak.crudDemo.service;

import com.ak.crudDemo.entity.Employee;
import com.ak.crudDemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Employee getEmployeeById(Long id) {
       return employeeRepo.findById(id).get();  //get() because of Optional
    }

    @Override
    public void deleteEpById(Long id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public Employee updateEmpData(Employee employee) {
        return employeeRepo.saveAndFlush(employee);
    }
}
