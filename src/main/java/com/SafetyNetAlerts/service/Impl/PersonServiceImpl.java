package com.SafetyNetAlerts.service.Impl;

import com.SafetyNetAlerts.model.Person;
import com.SafetyNetAlerts.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public Person[] getPersons() {
        return new Person[0];
    }

    @Override
    public Person getPersonsByFirstNameAndLastName(String firstName, String lastName) {
        return null;
    }

    @Override
    public Person[] getPersonsByCity(String city) {
        return new Person[0];
    }

    @Override
    public void addPersonInDataSource(Person person) {

    }

    @Override
    public void updatePersonInDataSource(Person person) {

    }

    @Override
    public void deletePersonInDataSource(String firstName, String lastName) {

    }
}
