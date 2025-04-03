package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/persons")
    public String listPersons(Model model) {
        model.addAttribute("persons", personRepository.findAll());
        return "persons";
    }

    @GetMapping("/persons/edit/{id}")
    public String editPerson(@PathVariable Long id, Model model) {
        Person person = personRepository.findById(id).orElseThrow();
        model.addAttribute("person", person);
        return "editPerson";
    }

    @PostMapping("/persons/update")
    public String updatePerson(@ModelAttribute Person person) {
        personRepository.save(person);
        return "redirect:/persons";
    }

    @GetMapping("/persons/delete/{id}")
    public String deletePerson(@PathVariable Long id) {
        personRepository.deleteById(id);
        return "redirect:/persons";
    }

    @GetMapping("/persons/add")
    public String showAddForm(Model model) {
        model.addAttribute("person", new Person());
        return "addPerson";
    }

    @PostMapping("/persons/save")
    public String saveNewPerson(@ModelAttribute Person person) {
        personRepository.save(person);
        return "redirect:/persons";
    }
}
