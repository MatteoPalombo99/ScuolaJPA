/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.ScuolaJPA.service;

import it.sirfin.ScuolaJPA.model.Docente;
import java.util.List;

public interface ScuolaService {

    void inserisciDocente(Docente doc);

    void cancellaDocenti();

    List<Docente> ritornaLista();

    void cancellareDocentiIdDispari(Docente doc);

    //servizio cooridnatore perche coordina altri servizi
    void inizializzaione();
}
