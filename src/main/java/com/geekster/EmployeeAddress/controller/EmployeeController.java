package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }
    @PostMapping("employees")
    public String addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return "Employee added";
    }
    @GetMapping("employee/{id}/id")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }
    @PutMapping("employees/{id}/id")
    public String updateEmployeeById(@PathVariable Long id,@RequestBody Employee employeeDetails){
        return employeeService.updateEmployeeById(id,employeeDetails);
    }

    @DeleteMapping("employees/{id}/id")
    public String deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }
}
//GET /employees - get all employees
//GET /employees/{id} - get an employee by id
//POST /employees - create a new employee
//PUT /employees/{id} - update an employee by id
//DELETE /employees/{id} - delete an employee by id