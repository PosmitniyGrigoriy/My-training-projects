package ru.site.dictionary.rest.api.controller;

import ru.site.dictionary.rest.api.exception.AddressNotFoundException;
import ru.site.dictionary.rest.api.onetoone.Address;
import ru.site.dictionary.rest.api.repository.AddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

@RestController
public class AddressController {

   @Autowired
   AddressRepository addressRepository;
   
   @GetMapping("/address")
   public List getAllNotes() {
       return addressRepository.findAll();
   }
   
   @PostMapping("/address")
   public Address createNote(@Valid @RequestBody Address address) {
       return addressRepository.save(address);
   }
   
   @GetMapping("/address/{id}")
   public Address getNoteById(@PathVariable(value = "id") Long addressId) throws AddressNotFoundException {
       return addressRepository.findById(addressId)
               .orElseThrow(() -> new AddressNotFoundException(addressId));
   }
   
   @PutMapping("/address/{id}")
   public Address updateNote(@PathVariable(value = "id") Long addressId,
                          @Valid @RequestBody Address addressDetails) throws AddressNotFoundException {
       
	   Address address = addressRepository.findById(addressId)
               .orElseThrow(() -> new AddressNotFoundException(addressId));
       
//       address.setWords(addressDetails.getWords());
//       address.setRepetitions(addressDetails.getRepetitions());
//       address.setTranscriptions(addressDetails.getTranscriptions());
//       address.setTranslations(addressDetails.getTranslations());
       
	   Address updatedAddress = addressRepository.save(address);
       return updatedAddress;
   }
   
   @DeleteMapping("/address/{id}")
   public ResponseEntity deleteDictionary(@PathVariable(value = "id") Long addressId) throws AddressNotFoundException {
	   Address address = addressRepository.findById(addressId)
               .orElseThrow(() -> new AddressNotFoundException(addressId));
       
	   addressRepository.delete(address);
       return ResponseEntity.ok().build();
   }
}