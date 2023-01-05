package com.SafetyNetAlerts.repository.Impl;

import com.SafetyNetAlerts.model.Firestation;
import com.SafetyNetAlerts.model.GlobalData;
import com.SafetyNetAlerts.model.MedicalRecord;
import com.SafetyNetAlerts.model.Person;
import com.SafetyNetAlerts.repository.GlobalDataRepository;
import com.google.gson.Gson;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

@Repository
public class GlobalDataRepositoryImpl implements GlobalDataRepository {
    // create Gson instance
    Gson gson = new Gson();
    public static void main(String[] args) {

        GlobalDataRepositoryImpl gdr = new GlobalDataRepositoryImpl();

        GlobalData globaldata = gdr.read();
        System.out.println(globaldata);

    }
    @Override
    public GlobalData read() {
        try {
            //create a variable globaldata
            GlobalData globaldata;




            // create a reader
            String file = "src/main/resources/data.json";
            String json = readFileToString(file);

            // convert JSON file to objects
            globaldata = gson.fromJson(json, GlobalData.class);

            return globaldata;

        } catch (Exception e) {
            e.printStackTrace();
        }return null;
    }

    private String readFileToString(String file) throws IOException {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    @Override
    public void write(GlobalData data) {

    }

    @Override
    public void addPerson(Person person) {

    }

    @Override
    public void updatePerson(Person person) {

    }

    @Override
    public void deletePerson(String firstName, String lastName) {

    }

    @Override
    public void addFirestation(Firestation firestation) {

    }

    @Override
    public void updateFirestation(Firestation firestation) {

    }

    @Override
    public void deleteFirestation(String address) {

    }

    @Override
    public void addMedicalRecord(MedicalRecord medicalRecord) {

    }

    @Override
    public void updateMedicalRecord(MedicalRecord medicalRecord) {

    }

    @Override
    public void deleteMedicalRecord(String firstName, String lastName) {

    }
}
//