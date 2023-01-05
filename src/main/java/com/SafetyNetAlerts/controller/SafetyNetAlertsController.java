package com.SafetyNetAlerts.controller;

import com.SafetyNetAlerts.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Persons/Children")

public class SafetyNetAlertsController {

    @GetMapping
    @ResponseBody
    public String displayChildren() {
        return "Voici la liste des enfants vivant à cette adresse\n";
    }



   //GetMapping("/Persons/Children")
    /*   --- Filter âge 18 ou moins puis faire une boucle des gens à la même adresse ---
        http://localhost:8080/childAlert?address=<address>

        Cette url doit retourner une liste d'enfants (tout individu âgé de 18 ans ou moins) habitant à cette adresse.
        La liste doit comprendre le prénom et le nom de famille de chaque enfant, son âge et une liste des autres
        membres du foyer. S'il n'y a pas d'enfant, cette url peut renvoyer une chaîne vide.
    */



     //GetMapping("/PhoneNumber")
         /* filter adresse caserne */
     //PostMapping("/message d'alerte")
     /*
        http://localhost:8080/phoneAlert?firestation=<firestation_number>

        Cette url doit retourner une liste des numéros de téléphone des résidents desservis par la caserne de
        pompiers. Nous l'utiliserons pour envoyer des messages texte d'urgence à des foyers spécifiques.
    */

    /*
        http://localhost:8080/fire?address=<address>

       // GET
       //URI - /adresses/{adress}/persons
       // method

        Cette url doit retourner la liste des habitants vivant à l’adresse donnée ainsi que le numéro de la caserne
        de pompiers la desservant. La liste doit inclure le nom, le numéro de téléphone, l'âge et les antécédents
        médicaux (médicaments, posologie et allergies) de chaque personne.
    */

    /*
        http://localhost:8080/flood/stations?stations=<a list of station_numbers>
        Cette url doit retourner une liste de tous les foyers desservis par la caserne. Cette liste doit regrouper les
        personnes par adresse. Elle doit aussi inclure le nom, le numéro de téléphone et l'âge des habitants, et
        faire figurer leurs antécédents médicaux (médicaments, posologie et allergies) à côté de chaque nom.
    */

    /*
        http://localhost:8080/personInfo?firstName=<firstName>&lastName=<lastName>
        Cette url doit retourner le nom, l'adresse, l'âge, l'adresse mail et les antécédents médicaux (médicaments,
        posologie, allergies) de chaque habitant. Si plusieurs personnes portent le même nom, elles doivent
        toutes apparaître.
    */


    //GetMapping("/Community")
     //   --- filter city ---
    /*http://localhost:8080/communityEmail?city=<city>

        Cette url doit retourner les adresses mail de tous les habitants de la ville.
    */
    @GetMapping(path = "/personInfo/{city}")
    @ResponseBody
    public List<Person> displayAllEmailAddresses(@PathVariable String city) {
        //return List<Person>"Voici la liste des enfants vivant à cette adresse";
        // doit retourner une liste de personnes
        return null;
    }


}