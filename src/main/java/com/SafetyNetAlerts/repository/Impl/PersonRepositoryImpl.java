package com.SafetyNetAlerts.repository.Impl;

import com.SafetyNetAlerts.model.Person;
import com.SafetyNetAlerts.repository.GlobalDataRepository;
import com.SafetyNetAlerts.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;
import java.util.List;

public class PersonRepositoryImpl implements PersonRepository {

    @Autowired
    private GlobalDataRepository globalDataRepository;

    public Person getPersonsByFirstNameAndLastName(List<Person> persons, String firstName, String lastName) {
        List<Person> matchingPerson = new LinkedList<>();
        for (Person p: persons){
            if (p.getFirstName().equals(firstName) && p.getLastName().equals(lastName)) {
                matchingPerson.add(p);
            }

        }
        return null;
    }

    public List<Person> getPersonsByAddress(List<Person> persons, String address) {

        List<Person> listOfPersonsByAddress = new LinkedList<>();
        for (Person p: persons) {
            if (p.getAddress().equals(address)) {
                listOfPersonsByAddress.add(p);
            }
        }
        //return null;
        return listOfPersonsByAddress;
    }

    public Person getPersonsByCity(List<Person> persons, String firstName, String lastName) {
        return null;
    }

    @Override
    public List<Person> getPersonsFromGlobalData() {
        return null;
    }

    @Override
    public void addPersonInDataSource(Person person) {
        globalDataRepository.addPerson(person);
    }

    @Override
    public void updatePersonInDataSource(Person person) {
        globalDataRepository.updatePerson(person);
    }

    @Override
    public void deletePersonInDataSource(String firstName, String LastName) {
        globalDataRepository.deletePerson(firstName, LastName);
    }
}

