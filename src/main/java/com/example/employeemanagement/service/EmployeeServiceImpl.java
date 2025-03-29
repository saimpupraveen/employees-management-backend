package com.example.employeemanagement.service;

import com.example.employeemanagement.exception.ResourceNotFoundException;
import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
import com.example.employeemanagement.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		Employee existingEmployee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found with ID: " + id));
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		return employeeRepository.save(existingEmployee);
	}

	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found with ID: " + id));
	}

	@Override
	public void deleteEmployee(Long id) {
		if (!employeeRepository.existsById(id)) {
			throw new ResourceNotFoundException("Employee not found with ID: " + id);
		}

		employeeRepository.deleteById(id);

	}
}
