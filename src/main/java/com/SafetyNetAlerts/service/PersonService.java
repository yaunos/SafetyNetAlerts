package com.SafetyNetAlerts.service;

import com.SafetyNetAlerts.model.Person;

public interface PersonService {
    Person[] getPersons();

    Person getPersonsByFirstNameAndLastName(String firstName, String lastName);

    Person[] getPersonsByCity(String city);

    void addPersonInDataSource(Person person);

    void updatePersonInDataSource(Person person);

    void deletePersonInDataSource(String firstName, String lastName);
}
