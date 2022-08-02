package com.rga.mx.demo.services;

import com.rga.mx.demo.domain.dao.ResponseDTO;
import com.rga.mx.demo.entities.PersonaEntity;
import com.rga.mx.demo.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    public ResponseDTO<List<PersonaEntity>> findAllPersons() {
        ResponseDTO<List<PersonaEntity>> response = new ResponseDTO<>();
        List<PersonaEntity> personas = new ArrayList<>();
        try {
            this.personaRepository.findAll().forEach(personas::add);
            response.setMessage("información obtenida exitosamente");
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            response.setError(ex.getMessage());
        }
        response.setData(personas);
        return response;
    }

    public ResponseDTO<List<PersonaEntity>> savePersons(List<PersonaEntity> persons) {
        ResponseDTO<List<PersonaEntity>> response = new ResponseDTO<>();
        List<PersonaEntity> savedPersons = new ArrayList<>();
        try {
            this.personaRepository.saveAll(persons).forEach(savedPersons::add);
            response.setMessage("información guardada exitosamente");
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            response.setError(ex.getCause().getCause().getMessage());
        }
        response.setData(savedPersons);
        return response;
    }
}
