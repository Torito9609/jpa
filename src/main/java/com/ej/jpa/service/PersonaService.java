package com.ej.jpa.service;

import com.ej.jpa.model.Persona;
import com.ej.jpa.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private IPersonaRepository personaRepository;

    @Override
    public List<Persona> getPersonas() {
        //.findAll retorna una lista de personas
        return personaRepository.findAll();
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id_persona) {
        personaRepository.deleteById(id_persona);
    }

    @Override
    public Persona findPersona(Long id_persona) {
        return null;
    }
}
