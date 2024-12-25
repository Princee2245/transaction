package com.projects.transaction.Service;

import com.projects.transaction.Entity.Address;
import com.projects.transaction.Entity.Employee;
import com.projects.transaction.Repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AddressService addressService;

    @Transactional
    public Employee saveEmployee(Employee employee){
        Employee saved=employeeRepository.save(employee);

        Address address=new Address();

        address.setAddress("Hello");
        address.setEmployee(employee);
        addressService.saveAddress(address);
        return saved;
    }
}
