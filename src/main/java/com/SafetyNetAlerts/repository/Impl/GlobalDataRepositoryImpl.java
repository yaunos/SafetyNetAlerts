package com.SafetyNetAlerts.repository.Impl;

import com.SafetyNetAlerts.model.GlobalData;
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

    @Override
    public GlobalData read() {
        try {
            //create a variable globaldata

            globaldata Globaldata;

            // create Gson instance
            Gson gson = new Gson();

            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/data.json"));

            // convert JSON file to map
            globaldata = gson.fromJson(reader);

            // print map entries
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }

            // close reader
        } catch (IOException e) {
            e.printStackTrace();
        }return null;
    }

    @Override
    public void write(GlobalData data) {

    }
}
