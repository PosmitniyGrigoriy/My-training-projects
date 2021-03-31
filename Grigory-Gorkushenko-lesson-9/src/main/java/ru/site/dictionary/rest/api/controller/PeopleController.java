package ru.site.dictionary.rest.api.controller;

import ru.site.dictionary.rest.api.exception.PeopleNotFoundException;
import ru.site.dictionary.rest.api.model.Address;
import ru.site.dictionary.rest.api.model.People;
import ru.site.dictionary.rest.api.repository.PeopleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

@RestController
public class PeopleController {

   @Autowired
   PeopleRepository peopleRepository;
   
   @GetMapping("/people")
   public List getAllNotes() {
       return peopleRepository.findAll();
   }
   
   @PostMapping("/people")
   public People createNote(@Valid @RequestBody People people) {
       return peopleRepository.save(people);
   }
   
   @GetMapping("/people/{id}")
   public People getNoteById(@PathVariable(value = "id") Long peopleId) throws PeopleNotFoundException {
       return peopleRepository.findById(peopleId)
               .orElseThrow(() -> new PeopleNotFoundException(peopleId));
   }
   
   @PutMapping("/people/{id}")
   public People updateNote(@PathVariable(value = "id") Long peopleId,
                          @Valid @RequestBody People peopleDetails) throws PeopleNotFoundException {
       
	   People people = peopleRepository.findById(peopleId)
               .orElseThrow(() -> new PeopleNotFoundException(peopleId));
       
	   people.setId(peopleDetails.getId());
	   people.setFirstName(peopleDetails.getFirstName());
	   people.setAddress(peopleDetails.getAddress());
//	   people.setCountry(peopleDetails.getCountry());
//	   people.setCity(peopleDetails.getCity());
//	   people.setStreet(peopleDetails.getStreet());
//	   people.setHouse(peopleDetails.getHouse());
//	   people.setApartment(peopleDetails.getApartment());
	   
       People updatedPeople = peopleRepository.save(people);
       return updatedPeople;
   }
   
   @DeleteMapping("/people/{id}")
   public ResponseEntity deletePeople(@PathVariable(value = "id") Long peopleId) throws PeopleNotFoundException {
	   People people = peopleRepository.findById(peopleId)
               .orElseThrow(() -> new PeopleNotFoundException(peopleId));
       
       peopleRepository.delete(people);
       return ResponseEntity.ok().build();
   }
}