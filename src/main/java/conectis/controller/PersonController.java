package conectis.controller;

import conectis.model.Person;
import conectis.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PersonController {

    private PersonService personService;

    //@Autowired - nie jest to konieczne
    public PersonController(PersonService personService) {
        this.personService = personService;
        System.out.println("PC run");
    }

    @GetMapping("/people")
    public List<Person> getPerson() {
        return personService.getPeople();
    }

    @GetMapping("/people/{id}")
    public Person getPerson(@PathVariable(value = "id") int id) {
        return personService.getPerson(id);
    }
    @PostMapping("/people")
    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
        for (Person p : personService.getPeople()) {
            if(p.getEmail().equals(person.getEmail())) {
                return new ResponseEntity<>(HttpStatus.CONFLICT);
            }
        }
        return new ResponseEntity<>(personService.addPerson(person), HttpStatus.CREATED);
    }

    @PostMapping("/people/all")
    public List<Person> addPeople(@RequestBody List<Person> people) {
        return personService.addPeople(people);
    }

    @PatchMapping("/people")
    public Person patchPersonEmail(@RequestParam int id, @RequestParam String email) {
        return personService.patchPersonEmail(id, email);
    }
}
