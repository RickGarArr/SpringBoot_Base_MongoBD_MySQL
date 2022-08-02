package com.rga.mx.demo.repositories;

import com.rga.mx.demo.entities.PersonaEntity;
import org.springframework.data.repository.CrudRepository;
public interface PersonaRepository extends CrudRepository<PersonaEntity, Integer> {
}
