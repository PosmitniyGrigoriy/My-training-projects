package ru.site.dictionary.rest.api.exception;

public class PeopleNotFoundException extends Exception {
   private long people_id;
   
   public PeopleNotFoundException(long peopleId) {
       super(String.format("People is not found with id : '%s'", peopleId));
   }
}