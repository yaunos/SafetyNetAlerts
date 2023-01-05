package com.SafetyNetAlerts.repository;

import com.SafetyNetAlerts.model.Person;

import java.util.List;

public interface PersonRepository {

    List<Person> getPersonsFromGlobalData();

    void addPersonInDataSource(Person person);

    void updatePersonInDataSource(Person person);

    void deletePersonInDataSource(String firstName, String LastName);
}
