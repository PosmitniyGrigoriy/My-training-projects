package ru.site.dictionary.rest.api.exception;

public class WorkStationNotFoundException extends Exception {
   private long workStation_id;
   
   public WorkStationNotFoundException(long workStationId) {
       super(String.format("Workstation is not found with id : '%s'", workStationId));
   }
}