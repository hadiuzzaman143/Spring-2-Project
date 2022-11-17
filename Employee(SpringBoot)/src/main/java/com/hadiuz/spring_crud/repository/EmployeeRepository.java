package com.hadiuz.spring_crud.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hadiuz.spring_crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee getByName(String name);

    Employee findByName(String name);
}
