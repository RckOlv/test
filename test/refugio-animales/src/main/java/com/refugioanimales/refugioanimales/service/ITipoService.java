package com.grupo13.refugioAnimales.service;

import com.grupo13.refugioAnimales.model.Tipo;
import java.util.List;


public interface ITipoService {
    
    public List<Tipo> getTipos();

    public void saveTipo(Tipo tipo);

    public void deleteTipo(Long id);

    public void editTipo(Tipo tipo);

    public Tipo getTipo(Long id);
    
}
