//package ru.kirillch.springdata;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import ru.kirillch.springdata.entity.Person2;
//import ru.kirillch.springdata.repository.PersonRepository;
//
//@SpringBootApplication
//public class SpringdataJPAApplication implements CommandLineRunner {
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringdataJPAApplication.class, args);
//    }
//
//    @Autowired
//    PersonRepository personRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        Person2 anna = new Person2("Anna", "Andreeva", "Samara");
//        Person2 olesya = new Person2("Olesya", "Andreeva", "Moscow");
//        Person2 alex = new Person2("Alex", "Andreev", "Omsk");
//
//        List<Person2> people = Arrays.asList(anna, olesya, alex);
//
//        personRepository.saveAll(people);
//
//        System.out.println("<<<<<<<<" + personRepository.findAll());
//    }
//}