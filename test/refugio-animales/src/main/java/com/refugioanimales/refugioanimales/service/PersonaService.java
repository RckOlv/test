package com.grupo13.refugioAnimales.service;

import com.grupo13.refugioAnimales.model.Persona;
import com.grupo13.refugioAnimales.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private IPersonaRepository personaRepo;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersona = personaRepo.findAll();
        return listaPersona;
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepo.deleteById(id);
    }

    @Override
    public void editPersona(Persona persona) {
        this.savePersona(persona);
    }

    @Override
    public Persona getPersona(Long id) {
        Persona persona =  personaRepo.findById(id).orElse(null);
        return persona;
    }

}
