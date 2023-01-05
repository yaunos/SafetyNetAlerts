package com.SafetyNetAlerts.repository.Impl;

import com.SafetyNetAlerts.model.Firestation;
import com.SafetyNetAlerts.repository.FirestationRepository;
import com.SafetyNetAlerts.repository.GlobalDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FirestationRepositoryImpl implements FirestationRepository {

    @Autowired
    private GlobalDataRepository globalDataRepository;



    @Override
    public List<Firestation> getFirestationsFromGlobalData() {
        List<Firestation> firestations = globalDataRepository.read().getFirestations();
        return firestations;
    }

    @Override
    public List<Firestation> getFirestationsByAddressLocation(List<Firestation> firestations, String address) {
       //Firestation firestationAtThisAddress = null;
       // If (list.firestationAtThisAddress = null; new LinkedList<>();
        //return firestationAtThisAddress;
        return null;
    }

    @Override
    public List<Firestation> getFirestationsByStation(int station) {
        return null;
    }

    @Override
    public void addFirestationsInDataSource(Firestation firestation) {
        globalDataRepository.addFirestation(firestation);
    }

    @Override
    public void updateFirestationInDataSource(Firestation firestation) {
        globalDataRepository.updateFirestation(firestation);
    }

    @Override
    public void deleteFirestationInDataSource(String address) {
        globalDataRepository.deleteFirestation(address);
    }
}

//