package com.example.demo.employee;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    public List<Employee> getEmployee(){
        return List.of(
                new Employee(1L,
                        "Kamo",
                        "Poopedi",
                        20,
                        "kamo@gmail.com")
        );
    }
}
