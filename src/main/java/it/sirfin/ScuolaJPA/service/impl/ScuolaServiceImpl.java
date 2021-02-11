/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.ScuolaJPA.service.impl;

import it.sirfin.ScuolaJPA.model.Docente;
import it.sirfin.ScuolaJPA.repository.DocenteRepository;
import it.sirfin.ScuolaJPA.service.ScuolaService;
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

}
