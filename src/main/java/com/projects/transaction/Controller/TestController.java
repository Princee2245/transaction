package com.projects.transaction.Controller;

import com.projects.transaction.Entity.Employee;
import com.projects.transaction.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addUser")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) throws Exception{

        Employee saved=employeeService.saveEmployee(employee);
        return new ResponseEntity<Employee>(saved, HttpStatus.CREATED);
    }
}
