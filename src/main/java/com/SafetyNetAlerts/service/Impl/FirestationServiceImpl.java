package com.SafetyNetAlerts.service.Impl;

import com.SafetyNetAlerts.model.Firestation;
import com.SafetyNetAlerts.service.FirestationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirestationServiceImpl implements FirestationService {
    //@Autowired

    @Override
    public Firestation[] getFirestations() {
        return new Firestation[0];
    }

    @Override
    public Firestation getFirestationByItsLocationAddress(String Address) {
        return null;
    }

    @Override
    public Firestation getFirestationByStation(Firestation[] firestations, int station) {
        return null;
    }

    @Override
    public void addFirestationIntoDataSource(Firestation firestation) {

    }

    @Override
    public void updateFirestationIntoDataSource(Firestation firestation) {

    }

    @Override
    public void deleteFirestationIntoDataSource(String Address) {

    }
}



