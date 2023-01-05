package com.SafetyNetAlerts.controller;

import com.SafetyNetAlerts.model.Firestation;
import com.SafetyNetAlerts.service.FirestationService;
import com.SafetyNetAlerts.service.Impl.FirestationServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@ResponseBody
public class FireStationsController {

    private static final Logger log = LogManager.getLogger(FireStationsController.class);

    @Autowired
    FirestationServiceImpl firestationService = new FirestationServiceImpl();

    @GetMapping("/firestations")
    public Firestation[] getFirestations() {
        log.info("We use the command GET /firestations to list all firestations");
        Firestation[] firestations = firestationService.getFirestations();
        return firestations;
    }

    @PostMapping("/firestation")
    public Firestation createFirestation(@RequestBody Firestation firestation) {
        log.info("We use the command POST /firestation to add a firestation");
        firestationService.addFirestationIntoDataSource(firestation);
        return firestation;
    }

    @PutMapping("/firestation")
    public Firestation updatetFirestation(@RequestBody Firestation firestation) {
        log.info("We use the command POST /firestation to add a firestation");
        firestationService.updateFirestationIntoDataSource(firestation);
        return firestation;
    }

    @DeleteMapping("/firestation")
    public void deleteFirestation(@RequestParam(name = "address") String address) {
        log.info("We use the command DELETE /firestation with its address" + address +" to delete this firestation");
        firestationService.deleteFirestationIntoDataSource(address);
    }
}
