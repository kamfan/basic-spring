package conectis.service;

import conectis.model.Person;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {
//todo tu powinno byc repository

    //to jest mock mojej bazy
    private List<Person> people = new ArrayList<>();
    public PersonService() {
        System.out.println("PersonService run");
    }

    public List<Person> getPeople() {

        return people;
    }

    public Person getPerson(int id) {
     return people.get(id -1);
    }

    public Person addPerson(Person person) {
        people.add(person);
        return people.get(people.size()-1);
    }
    public List<Person> addPeople(List<Person> people) {
        this.people.addAll(people);
        return this.people;
    }

    public Person patchPersonEmail(int id, String email) {
        this.people.get(id-1).setEmail(email);
        return this.people.get(id-1);
    }
}
