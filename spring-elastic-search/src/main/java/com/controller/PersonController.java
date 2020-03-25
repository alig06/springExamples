package com.controller;

import java.util.Calendar;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Person;
import lombok.RequiredArgsConstructor;
import com.repository.PeopleRepository;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {
    private final PeopleRepository peopleRepository;

    @PostConstruct
    public void init(){
        Person person = new Person();
        person.setId("K0001");
        person.setName("alig");
        person.setSurname("göktaş");
        person.setAddress("istanbul");
        person.setBornyear(Calendar.getInstance().getTime());
        peopleRepository.save(person);
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<Person>> getPerson(@PathVariable String search){
        List<Person> persons = peopleRepository.findByNameLikeOrSurnameLike(search,search);
        return ResponseEntity.ok(persons);
    }
}
