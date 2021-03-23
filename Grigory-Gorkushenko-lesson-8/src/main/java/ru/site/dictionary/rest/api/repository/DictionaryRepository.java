package ru.site.dictionary.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.site.dictionary.rest.api.model.Dictionary;

@Repository
public interface DictionaryRepository extends JpaRepository<Dictionary, Long> {

}