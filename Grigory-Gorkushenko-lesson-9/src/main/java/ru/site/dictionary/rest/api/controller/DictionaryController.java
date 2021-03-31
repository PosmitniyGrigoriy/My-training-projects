package ru.site.dictionary.rest.api.controller;

import ru.site.dictionary.rest.api.exception.DictionaryNotFoundException;
import ru.site.dictionary.rest.api.model.Dictionary;
import ru.site.dictionary.rest.api.repository.DictionaryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

@RestController
public class DictionaryController {

   @Autowired
   DictionaryRepository dictionaryRepository;
   
   @GetMapping("/dictionary")
   public List getAllNotes() {
       return dictionaryRepository.findAll();
   }
   
   @PostMapping("/dictionary")
   public Dictionary createNote(@Valid @RequestBody Dictionary dictionary) {
       return dictionaryRepository.save(dictionary);
   }
   
   @GetMapping("/dictionary/{id}")
   public Dictionary getNoteById(@PathVariable(value = "id") Long dictionaryId) throws DictionaryNotFoundException {
       return dictionaryRepository.findById(dictionaryId)
               .orElseThrow(() -> new DictionaryNotFoundException(dictionaryId));
   }
   
   @PutMapping("/dictionary/{id}")
   public Dictionary updateNote(@PathVariable(value = "id") Long dictionaryId,
                          @Valid @RequestBody Dictionary dictionaryDetails) throws DictionaryNotFoundException {
       
       Dictionary dictionary = dictionaryRepository.findById(dictionaryId)
               .orElseThrow(() -> new DictionaryNotFoundException(dictionaryId));
       
       dictionary.setWord(dictionaryDetails.getWord());
       dictionary.setRepetition(dictionaryDetails.getRepetition());
       dictionary.setTranscription(dictionaryDetails.getTranscription());
       dictionary.setTranslation(dictionaryDetails.getTranslation());
       
       Dictionary updatedDictionary = dictionaryRepository.save(dictionary);
       return updatedDictionary;
   }
   
   @DeleteMapping("/dictionary/{id}")
   public ResponseEntity deleteDictionary(@PathVariable(value = "id") Long dictionaryId) throws DictionaryNotFoundException {
       Dictionary dictionary = dictionaryRepository.findById(dictionaryId)
               .orElseThrow(() -> new DictionaryNotFoundException(dictionaryId));
       
       dictionaryRepository.delete(dictionary);
       return ResponseEntity.ok().build();
   }
}