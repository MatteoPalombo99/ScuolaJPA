package it.sirfin.ScuolaJPA.controller;

import it.sirfin.ScuolaJPA.service.ScuolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class ScuolaJpaController {

    @Autowired
    ScuolaService scuolaService;

    @RequestMapping("/inizializza")
    public void inizializza() {
        scuolaService.inizializzaione();
    }
}
