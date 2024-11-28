package com.example.employeemanagement.service;

import com.example.employeemanagement.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee employee);
    public Employee getEmployeeById(Long id);
    void deleteEmployee(Long id);
}
