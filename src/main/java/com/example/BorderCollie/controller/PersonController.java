package com.example.BorderCollie.controller;

import com.example.BorderCollie.model.Person;
import com.example.BorderCollie.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonController {
    @Autowired
    private final PersonService personService;
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @RequestMapping(value = "/")
    public String home(Model model){
        model.addAttribute("person", new Person());
        return "makePerson";
    }
    @RequestMapping(value = "/person")
    public String getPagePerson(Model model) {
        model.addAttribute("persons", personService.getAllPerson()); // 5
        return "result";
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST) // 6
    public String addPagePerson(@ModelAttribute Person person, Model model) { // 7
        personService.createPerson(person);
        model.addAttribute("persons", personService.getAllPerson());
        return "result";
    }

    @RequestMapping(value = "/person/delete/{id}")
    public String deletePagePerson(@PathVariable Long id) { // 8
        personService.deletePerson(id);
        return "redirect:/person"; // 9
    }
}
