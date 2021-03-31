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
   private String word;

   private int repetition;

   @NotBlank
   private String transcription;
   
   @NotBlank
   private String translation;

   public Dictionary(){
       super();
   }

   public Dictionary(Long id, String word, int repetition, String transcription, String translation) {
       super();
       this.id = id;
       this.word = word;
       this.repetition = repetition;
       this.transcription = transcription;
       this.translation = translation;
   }
   
   public Long getId() {
       return id;
   }
   
   public void setId(Long id) {
       this.id = id;
   }

   public String getWord() {
       return word;
   }
   
   public void setWord(String word) {
       this.word = word;
   }

   public int getRepetition() {
       return repetition;
   }

   public void setRepetition(int repetition) {
       this.repetition = repetition;
   }

   public String getTranscription() {
       return transcription;
   }

   public void setTranscription(String transcription) {
       this.transcription = transcription;
   }
   
   public String getTranslation() {
       return translation;
   }

   public void setTranslation(String translation) {
       this.translation = translation;
   }
   
}