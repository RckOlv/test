package com.grupo13.refugioAnimales.service;

import com.grupo13.refugioAnimales.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> getPersonas();

    public void savePersona(Persona persona);

    public void deletePersona(Long id);

    public void editPersona(Persona persona);

    public Persona getPersona(Long id);
    
}
