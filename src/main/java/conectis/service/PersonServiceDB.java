package conectis.service;

import conectis.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceDB {
    private PersonRepository personRepository;

    public PersonServiceDB(PersonRepository personRepository){
        this.personRepository
    }
}
