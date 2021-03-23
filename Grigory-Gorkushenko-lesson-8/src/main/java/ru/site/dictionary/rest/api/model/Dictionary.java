package ru.site.dictionary.rest.api.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "dictionary")
public class Dictionary {

   @Id
   @GeneratedValue
   private Long id;
   
   @NotBlank
   private String words;

   private int repetitions;

   @NotBlank
   private String transcriptions;
   
   @NotBlank
   private String translations;

   public Dictionary(){
       super();
   }

   public Dictionary(Long id, String words, int repetitions, String transcriptions, String translations) {
       super();
       this.id = id;
       this.words = words;
       this.repetitions = repetitions;
       this.transcriptions = transcriptions;
       this.translations = translations;
   }
   
   public Long getId() {
       return id;
   }
   
   public void setId(Long id) {
       this.id = id;
   }

   public String getWords() {
       return words;
   }
   
   public void setWords(String words) {
       this.words = words;
   }

   public int getRepetitions() {
       return repetitions;
   }

   public void setRepetitions(int repetitions) {
       this.repetitions = repetitions;
   }

   public String getTranscriptions() {
       return transcriptions;
   }

   public void setTranscriptions(String transcriptions) {
       this.transcriptions = transcriptions;
   }
   
   public String getTranslations() {
       return translations;
   }

   public void setTranslations(String translations) {
       this.translations = translations;
   }
   
}