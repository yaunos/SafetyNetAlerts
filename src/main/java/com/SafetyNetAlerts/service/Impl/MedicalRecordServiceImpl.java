package com.SafetyNetAlerts.service.Impl;

import com.SafetyNetAlerts.model.MedicalRecord;
import com.SafetyNetAlerts.model.Person;
import com.SafetyNetAlerts.service.MedicalRecordService;
import com.SafetyNetAlerts.service.PersonService;

import java.util.List;

public class MedicalRecordServiceImpl implements MedicalRecordService {

    @Override
    public List<MedicalRecord> getMedicalRecords() {
        return null;
    }

    @Override
    public List<MedicalRecord> getMedicalRecordsByFirstNameAndLastName(String firstName, String lastName) {
        return null;
    }

    @Override
    public List<MedicalRecord> getMedicalRecordsByAgeRange(int MinAge, int MaxAge) {
        return null;
    }

    @Override
    public void addMedicalRecordIntoDataSource(MedicalRecord medicalRecord) {

    }

    @Override
    public void updateMedicalRecordIntoDataSource(MedicalRecord medicalRecord) {

    }

    @Override
    public void deleteMedicalRecordIntoDataSource(String firstName, String lastName) {

    }
}
