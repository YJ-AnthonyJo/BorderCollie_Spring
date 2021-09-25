package com.example.BorderCollie.service;

import com.example.BorderCollie.model.Person;
import com.example.BorderCollie.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServicelmp implements PersonService {
    @Autowired //https://life-with-coding.tistory.com/433
    //DI : 클래스간 의존관계를 스프링 컨테이너가 자동으로 연결해주는 것
    //빈(Bean) : 자바 객체
    //스프링 컨테이너 : 객체관리를 주로 수행하는 그릇, 빈의 생명주기 관리, 생성된 빈에 추가적인 기능 제공
    //Autowired : 해당 객체의 인스턴스를 만들고 주입.(맞는 개념인지는 불확실)
    // 여기서는 personRepository.
    private PersonRepository personRepository;

    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }
    //블로그 저자는 여기 lmp를 붙였다. 무슨의미일까..

}
