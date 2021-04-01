package ru.site.dictionary.rest.api.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "vacancies")
public class Vacancies {

   @Id
   @GeneratedValue
   private Long id;
   
   @NotBlank
   private String title;

   private boolean isMarked;

   public Vacancies(){
       super();
   }

   public Vacancies(String title, boolean isMarked) {
       super();
       this.title = title;
       this.isMarked = isMarked;
   }
   
   public Long getId() {
       return id;
   }
   
   public void setId(Long id) {
       this.id = id;
   }

   public String getTitle() {
       return title;
   }
   
   public void setTitle(String title) {
       this.title = title;
   }

   public boolean getIsMarked() {
       return isMarked;
   }

   public void setIsMarked(boolean isMarked) {
       this.isMarked = isMarked;
   }
   
}