/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.ScuolaJPA.repository;

import it.sirfin.ScuolaJPA.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Prima modalità di generazione automatica dell'accesso al DB: estendo
 * JpaRespository. Il primo parametro è l'entità, il secondo è il tipo della
 * chiave primaria
 */
/**
 * Il repository è una classe che contiene il codice per accedere al DB
 *
 * @author Palo
 */
@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {
}
