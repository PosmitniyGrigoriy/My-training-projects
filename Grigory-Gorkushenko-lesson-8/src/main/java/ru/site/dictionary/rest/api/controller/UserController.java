package ru.site.dictionary.rest.api.controller;

import ru.site.dictionary.rest.api.exception.UserNotFoundException;
import ru.site.dictionary.rest.api.onetoone.User;
import ru.site.dictionary.rest.api.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

   @Autowired
   UserRepository UserRepository;
   
   @GetMapping("/user")
   public List getAllNotes() {
       return UserRepository.findAll();
   }
   
   @PostMapping("/user")
   public User createNote(@Valid @RequestBody User user) {
       return UserRepository.save(user);
   }
   
   @GetMapping("/user/{id}")
   public User getNoteById(@PathVariable(value = "id") Long userId) throws UserNotFoundException {
       return UserRepository.findById(userId)
               .orElseThrow(() -> new UserNotFoundException(userId));
   }
   
   @PutMapping("/user/{id}")
   public User updateNote(@PathVariable(value = "id") Long userId,
                          @Valid @RequestBody User userDetails) throws UserNotFoundException {
       
	   User user = UserRepository.findById(userId)
               .orElseThrow(() -> new UserNotFoundException(userId));
       
//       user.setWords(userDetails.getWords());
//       user.setRepetitions(userDetails.getRepetitions());
//       user.setTranscriptions(userDetails.getTranscriptions());
//       user.setTranslations(userDetails.getTranslations());
       
       User updatedUser = UserRepository.save(user);
       return updatedUser;
   }
   
   @DeleteMapping("/user/{id}")
   public ResponseEntity deleteDictionary(@PathVariable(value = "id") Long userId) throws UserNotFoundException {
	   User user = UserRepository.findById(userId)
               .orElseThrow(() -> new UserNotFoundException(userId));
       
       UserRepository.delete(user);
       return ResponseEntity.ok().build();
   }
}