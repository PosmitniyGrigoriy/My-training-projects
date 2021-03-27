package ru.site.dictionary.rest.api.exception;

public class AddressNotFoundException extends Exception {
   private long address_id;
   
   public AddressNotFoundException(long addressId) {
       super(String.format("Word is not found with id : '%s'", addressId));
   }
}