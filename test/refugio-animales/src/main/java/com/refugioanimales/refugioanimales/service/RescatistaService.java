package com.grupo13.refugioAnimales.service;

import com.grupo13.refugioAnimales.model.Rescatista;
import com.grupo13.refugioAnimales.repository.IRescatistaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RescatistaService implements IRescatistaService{
    
    @Autowired
    private IRescatistaRepository rescatistaRepo;

    @Override
    public List<Rescatista> getRescatistas() {
        List<Rescatista> listaRescatista = rescatistaRepo.findAll();
        return listaRescatista;
    }

    @Override
    public void saveRescatista(Rescatista rescatista) {
        rescatistaRepo.save(rescatista);
    }

    @Override
    public void deleteRescatista(Long id) {
        rescatistaRepo.deleteById(id);
    }

    @Override
    public void editRescatista(Rescatista rescatista) {
        this.saveRescatista(rescatista);
    }

    @Override
    public Rescatista getRescatista(Long id) {
        Rescatista rescatista =  rescatistaRepo.findById(id).orElse(null);
        return rescatista;
    }

}
