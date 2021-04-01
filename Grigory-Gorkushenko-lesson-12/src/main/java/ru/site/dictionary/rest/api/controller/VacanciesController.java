package ru.site.dictionary.rest.api.controller;

import ru.site.dictionary.rest.api.exception.VacanciesNotFoundException;
import ru.site.dictionary.rest.api.model.Vacancies;
import ru.site.dictionary.rest.api.repository.VacanciesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

@RestController
public class VacanciesController {

   @Autowired
   VacanciesRepository vacanciesRepository;
   
   @GetMapping("/vacancies")
   public List getAllVacancies() {
       return vacanciesRepository.findAll();
   }
   
   @GetMapping("/vacancies/marked")
   public List getAllVacanciesMarked() {
       return vacanciesRepository.findAll();
   }
   
   @PostMapping("/vacancies")
   public Vacancies createVacancies(@Valid @RequestBody Vacancies vacancies) {
       return vacanciesRepository.save(vacancies);
   }
   
   @GetMapping("/vacancies/{id}")
   public Vacancies getVacanciesById(@PathVariable(value = "id") Long vacanciesId) throws VacanciesNotFoundException {
       return vacanciesRepository.findById(vacanciesId)
               .orElseThrow(() -> new VacanciesNotFoundException(vacanciesId));
   }
   
   @PutMapping("/vacancies/{id}")
   public Vacancies updateVacancies(@PathVariable(value = "id") Long vacanciesId,
                          @Valid @RequestBody Vacancies vacanciesDetails) throws VacanciesNotFoundException {
       
       Vacancies vacancies = vacanciesRepository.findById(vacanciesId)
               .orElseThrow(() -> new VacanciesNotFoundException(vacanciesId));
       
       vacancies.setTitle(vacanciesDetails.getTitle());
       vacancies.setIsMarked(vacanciesDetails.getIsMarked());
       
       Vacancies updatedVacancies = vacanciesRepository.save(vacancies);
       return updatedVacancies;
   }
   
   @PutMapping("/vacancies/{id}/marked")
   public Vacancies updateVacanciesMarked(@PathVariable(value = "id") Long vacanciesId,
                          @Valid @RequestBody Vacancies vacanciesDetails) throws VacanciesNotFoundException {
       
       Vacancies vacancies = vacanciesRepository.findById(vacanciesId)
               .orElseThrow(() -> new VacanciesNotFoundException(vacanciesId));
       
       vacancies.setIsMarked(vacanciesDetails.getIsMarked());
       Vacancies updatedVacancies = vacanciesRepository.save(vacancies);
       return updatedVacancies;
       
   }
   
   @DeleteMapping("/vacancies/{id}")
   public ResponseEntity deleteDictionary(@PathVariable(value = "id") Long vacanciesId) throws VacanciesNotFoundException {
       Vacancies vacancies = vacanciesRepository.findById(vacanciesId)
               .orElseThrow(() -> new VacanciesNotFoundException(vacanciesId));
       
       vacanciesRepository.delete(vacancies);
       return ResponseEntity.ok().build();
   }
}