package ru.site.dictionary.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.site.dictionary.rest.api.onetoone.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}