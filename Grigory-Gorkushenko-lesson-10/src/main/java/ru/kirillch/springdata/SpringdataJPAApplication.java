package ru.kirillch.springdata;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ru.kirillch.springdata.entity.Passport;
import ru.kirillch.springdata.entity.Person;
import ru.kirillch.springdata.repository.PersonRepository;

@SpringBootApplication
public class SpringdataJPAApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringdataJPAApplication.class, args);
    }

    @Autowired
    PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {

        Person anna = new Person("Anna", "Andreeva", "Samara");
        Person olesya = new Person("Olesya", "Smirnova", "Moscow");
        Person alex = new Person("Alex", "Posik", "Omsk");

        Passport passportAnna = new Passport("A1111");
        Passport passportOlesya = new Passport("B2222");
        Passport passportAlex = new Passport("C3333");
        
        anna.setPassport(passportAnna);
        olesya.setPassport(passportOlesya);
        alex.setPassport(passportAlex);
        
        
        List<Person> people = Arrays.asList(anna, olesya, alex);

        personRepository.saveAll(people);

        System.out.println("<<<<<<<<" + personRepository.findAll());
    }
}