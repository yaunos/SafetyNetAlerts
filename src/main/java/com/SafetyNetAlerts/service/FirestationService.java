package com.SafetyNetAlerts.service;

import com.SafetyNetAlerts.model.Firestation;

public interface FirestationService {

    Firestation[] getFirestations();

    Firestation getFirestationByItsLocationAddress(String Address);

    Firestation getFirestationByStation(Firestation[] firestations, int station);

    void addFirestationIntoDataSource(Firestation firestation);

    void updateFirestationIntoDataSource(Firestation firestation);

    void deleteFirestationIntoDataSource(String Address);

}
