package com.ak.crudDemo.controller;

import com.ak.crudDemo.entity.Employee;
import com.ak.crudDemo.service.EmployeeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/crud")
public class EmployeeController {


    @Autowired
    private EmployeeServiceInterface employeeService;


    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        Employee savedEmployee = employeeService.saveEmployee(employee);
        return new ResponseEntity<Employee>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping(value = "/getAllEmployees")
    public List<Employee> getAllEmployee(){
        System.out.println("Enter getAllEmployees..");
        return employeeService.getAllEmployee();
    }


   @GetMapping(value = "/getEmpById/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
        Employee employee = employeeService.getEmployeeById(id);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteEmp/{id}")
    public ResponseEntity<Void> deleteEmpById(@PathVariable("id") Long id){
        employeeService.deleteEpById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee savedEmployee = employeeService.updateEmpData(employee);
        return new ResponseEntity<Employee>(savedEmployee, HttpStatus.CREATED);
    }

}
