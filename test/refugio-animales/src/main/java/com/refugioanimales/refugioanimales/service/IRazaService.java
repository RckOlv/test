package com.grupo13.refugioAnimales.service;

import com.grupo13.refugioAnimales.model.Raza;
import java.util.List;


public interface IRazaService {
    
    public List<Raza> getRazas();

    public void saveRaza(Raza raza);

    public void deleteRaza(Long id);

    public void editRaza(Raza raza);

    public Raza getRaza(Long id);
    
}
