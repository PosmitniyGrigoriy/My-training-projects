package ru.site.dictionary.rest.api.exception;

public class UserNotFoundException extends Exception {
   private long user_id;
   
   public UserNotFoundException(long userId) {
       super(String.format("Word is not found with id : '%s'", userId));
   }
}