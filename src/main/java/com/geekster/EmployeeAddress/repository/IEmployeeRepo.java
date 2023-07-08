package com.geekster.EmployeeAddress.repository;

import com.geekster.EmployeeAddress.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee,Long> {
}
