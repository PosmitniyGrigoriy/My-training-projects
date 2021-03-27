package ru.site.dictionary.rest.api.exception;

public class EmployeeNotFoundException extends Exception {
   private long employee_id;
   
   public EmployeeNotFoundException(long employeeId) {
       super(String.format("Word is not found with id : '%s'", employeeId));
   }
}