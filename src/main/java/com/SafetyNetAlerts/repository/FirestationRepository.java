package com.SafetyNetAlerts.repository;

import com.SafetyNetAlerts.model.Firestation;


import java.util.List;

public interface FirestationRepository {

    /* Get the firestations from the Json file */

    List<Firestation> getFirestationsFromGlobalData();

    List<Firestation> getFirestationsByAddressLocation(List<Firestation> firestations, String address);

    List<Firestation> getFirestationsByStation(int station);

    void addFirestationsInDataSource(Firestation firestation);

    void updateFirestationInDataSource(Firestation firestation);

    void deleteFirestationInDataSource(String address);
}
//