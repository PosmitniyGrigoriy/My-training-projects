//import org.springframework.stereotype.Repository;
//
//package ru.kirillch.springdata.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import ru.kirillch.springdata.entity.Person2;
//
//import java.util.List;
//
//@Repository
//public interface PersonRepository extends JpaRepository<Person2, Integer> {
//
//    List<Person2> findByFirstName(String firstName);
//
//    @Query("select p from Person p order by firstName")
//    List<Person2> findAllOrderedByFirstName();
//
//}