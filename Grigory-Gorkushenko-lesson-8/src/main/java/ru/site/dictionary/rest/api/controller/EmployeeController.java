package ru.site.dictionary.rest.api.controller;

import ru.site.dictionary.rest.api.exception.EmployeeNotFoundException;
import ru.site.dictionary.rest.api.onetoone.Employee;
import ru.site.dictionary.rest.api.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {

   @Autowired
   EmployeeRepository EmployeeRepository;
   
   @GetMapping("/employee")
   public List getAllNotes() {
       return EmployeeRepository.findAll();
   }
   
   @PostMapping("/employee")
   public Employee createNote(@Valid @RequestBody Employee employee) {
       return EmployeeRepository.save(employee);
   }
   
   @GetMapping("/employee/{id}")
   public Employee getNoteById(@PathVariable(value = "id") Long employeeId) throws EmployeeNotFoundException {
       return EmployeeRepository.findById(employeeId)
               .orElseThrow(() -> new EmployeeNotFoundException(employeeId));
   }
   
   @PutMapping("/employee/{id}")
   public Employee updateNote(@PathVariable(value = "id") Long employeeId,
                          @Valid @RequestBody Employee employeeDetails) throws EmployeeNotFoundException {
       
	   Employee employee = EmployeeRepository.findById(employeeId)
               .orElseThrow(() -> new EmployeeNotFoundException(employeeId));
       
//       employee.setWords(employeeDetails.getWords());
//       employee.setRepetitions(employeeDetails.getRepetitions());
//       employee.setTranscriptions(employeeDetails.getTranscriptions());
//       employee.setTranslations(employeeDetails.getTranslations());
       
	   Employee updatedEmployee = EmployeeRepository.save(employee);
       return updatedEmployee;
   }
   
   @DeleteMapping("/employee/{id}")
   public ResponseEntity deleteDictionary(@PathVariable(value = "id") Long employeeId) throws EmployeeNotFoundException {
	   Employee employee = EmployeeRepository.findById(employeeId)
               .orElseThrow(() -> new EmployeeNotFoundException(employeeId));
       
	   EmployeeRepository.delete(employee);
       return ResponseEntity.ok().build();
   }
}