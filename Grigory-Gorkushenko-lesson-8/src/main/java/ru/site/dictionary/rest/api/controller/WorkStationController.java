package ru.site.dictionary.rest.api.controller;

import ru.site.dictionary.rest.api.exception.WorkStationNotFoundException;
import ru.site.dictionary.rest.api.onetoone.WorkStation;
import ru.site.dictionary.rest.api.repository.WorkStationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.List;

@RestController
public class WorkStationController {

   @Autowired
   WorkStationRepository WorkStationRepository;
   
   @GetMapping("/workStation")
   public List getAllNotes() {
       return WorkStationRepository.findAll();
   }
   
   @PostMapping("/workStation")
   public WorkStation createNote(@Valid @RequestBody WorkStation workStation) {
       return WorkStationRepository.save(workStation);
   }
   
   @GetMapping("/workStation/{id}")
   public WorkStation getNoteById(@PathVariable(value = "id") Long workStationId) throws WorkStationNotFoundException {
       return WorkStationRepository.findById(workStationId)
               .orElseThrow(() -> new WorkStationNotFoundException(workStationId));
   }
   
   @PutMapping("/workStation/{id}")
   public WorkStation updateNote(@PathVariable(value = "id") Long workStationId,
                          @Valid @RequestBody WorkStation workStationDetails) throws WorkStationNotFoundException {
       
	   WorkStation workStation = WorkStationRepository.findById(workStationId)
               .orElseThrow(() -> new WorkStationNotFoundException(workStationId));
       
//       workStation.setWords(workStationDetails.getWords());
//       workStation.setRepetitions(workStationDetails.getRepetitions());
//       workStation.setTranscriptions(workStationDetails.getTranscriptions());
//       workStation.setTranslations(workStationDetails.getTranslations());
       
	   WorkStation updatedWorkStation = WorkStationRepository.save(workStation);
       return updatedWorkStation;
   }
   
   @DeleteMapping("/workStation/{id}")
   public ResponseEntity deleteDictionary(@PathVariable(value = "id") Long workStationId) throws WorkStationNotFoundException {
	   WorkStation workStation = WorkStationRepository.findById(workStationId)
               .orElseThrow(() -> new WorkStationNotFoundException(workStationId));
       
	   WorkStationRepository.delete(workStation);
       return ResponseEntity.ok().build();
   }
}