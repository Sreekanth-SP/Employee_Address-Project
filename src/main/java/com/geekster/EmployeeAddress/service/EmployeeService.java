package com.geekster.EmployeeAddress.service;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo iEmployeeRepo;

    public List<Employee> getAllEmployees() {
        return (List<Employee>) iEmployeeRepo.findAll();
    }
    public void addEmployee(Employee employee) {
        iEmployeeRepo.save(employee);
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return iEmployeeRepo.findById(id);
    }

    public String updateEmployeeById(Long id, Employee employeeDetails) {
        List<Employee> employeeList = getAllEmployees();
        for(Employee employee:employeeList){
            if(employee.getEmployeeId()==id){
                employee.setFirstName(employeeDetails.getFirstName());
                employee.setLastName(employeeDetails.getLastName());
                iEmployeeRepo.save(employee);
                return "Updated";
            }
        }
        return "Id not found"+id;
    }

    public String deleteEmployeeById(Long id) {
        iEmployeeRepo.deleteById(id);
        return "Employee Deleted";
    }


}
