package com.example.demo.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public Employee createEmployee(Employee employee){
        return employeeDao.save(employee);
    }
    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeDao.findById(id);
    }

    public void deleteEmployee(Long id) {
        employeeDao.deleteById(id);
    }
}
