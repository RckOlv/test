package com.grupo13.refugioAnimales.service;

import com.grupo13.refugioAnimales.model.Rescatista;
import java.util.List;


public interface IRescatistaService {
    
    public List<Rescatista> getRescatistas();

    public void saveRescatista(Rescatista rescatista);

    public void deleteRescatista(Long id);

    public void editRescatista(Rescatista rescatista);

    public Rescatista getRescatista(Long id);
    
}
