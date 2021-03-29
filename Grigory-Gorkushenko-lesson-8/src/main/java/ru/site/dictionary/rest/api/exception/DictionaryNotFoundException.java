package ru.site.dictionary.rest.api.exception;

public class DictionaryNotFoundException extends Exception {
   private long dictionary_id;
   
   public DictionaryNotFoundException(long dictionaryId) {
       super(String.format("Dictionary is not found with id : '%s'", dictionaryId));
   }
}