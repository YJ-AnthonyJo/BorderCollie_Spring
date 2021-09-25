package com.example.BorderCollie.service;

import com.example.BorderCollie.model.Person;

import java.util.List;


public interface PersonService {
    Person createPerson(Person person);
    void deletePerson(Long id);
    List<Person> getAllPerson();
}
