package com.rga.mx.demo.controllers;

import com.rga.mx.demo.domain.dao.ResponseDTO;
import com.rga.mx.demo.entities.PersonaEntity;
import com.rga.mx.demo.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("")
    public ResponseDTO<List<PersonaEntity>> findAll() {
        return this.personaService.findAllPersons();
    }

    @PostMapping("")
    public ResponseDTO<List<PersonaEntity>> savePersons(
            @RequestBody() List<PersonaEntity> personsToSave
    ) {
        return this.personaService.savePersons(personsToSave);
    }
}
