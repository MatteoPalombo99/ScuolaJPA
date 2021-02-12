/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.ScuolaJPA.service.impl;

import it.sirfin.ScuolaJPA.model.Docente;
import it.sirfin.ScuolaJPA.repository.DocenteRepository;
import it.sirfin.ScuolaJPA.service.ScuolaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScuolaServiceImpl implements ScuolaService {

    @Autowired
    DocenteRepository docenteRepository;

    @Override
    public void inserisciDocente(Docente doc) {
        docenteRepository.save(doc);
    }

    @Override
    public void cancellaDocenti() {
        docenteRepository.deleteAllInBatch();
    }

    @Override
    public List<Docente> ritornaLista() {
        List<Docente> lista = docenteRepository.findAll();
        return lista;
        //return docenteRepository.findAll();
    }

    @Override
    public void cancellareDocentiIdDispari(Docente doc) {
        docenteRepository.delete(doc);
    }

    @Override
    public void inizializzaione() {
        List<Docente> docenti = new ArrayList<>();
        docenti.add(new Docente("Benjamin", "Franklin"));
        docenti.add(new Docente("Elio", "Plutonio"));
        docenti.add(new Docente("Paolino", "Paperino"));
        docenti.add(new Docente("Luca", "Lezzerini"));
        docenti.add(new Docente("Marie", "Curie"));

        //cancella tutti i docenti dal DB
        cancellaDocenti();

        /**
         * Inserisci i docenti dal DB.
         */
        //for (Docente docente : docenti) {
        //  scuolaService.inserisciDocente(docente);
        //}
        docenti.forEach(r -> inserisciDocente(r));

        /**
         * Creo lista in cui mettere i docenti
         */
        List<Docente> lista = ritornaLista();

        //for (Docente docente : lista) {
        //  System.out.println(docente);
        //}
        lista.forEach(r -> {
            System.out.println(r);
        });

        //cancella docenti con id dispari
        lista.stream()
                .filter(r -> r.getId() % 2 == 1)
                .forEach(r -> cancellareDocentiIdDispari(r));

        //recuperare i dati aggiornati
        List<Docente> lista2 = ritornaLista();
        lista2.forEach(r -> System.out.println(r));
    }
}
