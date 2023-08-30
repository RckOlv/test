package com.grupo13.refugioAnimales.service;

import com.grupo13.refugioAnimales.model.Tipo;
import com.grupo13.refugioAnimales.repository.ITipoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoService implements ITipoService{
    
    @Autowired
    private ITipoRepository tipoRepo;

    @Override
    public List<Tipo> getTipos() {
        List<Tipo> listaTipo = tipoRepo.findAll();
        return listaTipo;
    }

    @Override
    public void saveTipo(Tipo tipo) {
        tipoRepo.save(tipo);
    }

    @Override
    public void deleteTipo(Long id) {
        tipoRepo.deleteById(id);
    }

    @Override
    public void editTipo(Tipo tipo) {
        this.saveTipo(tipo);
    }

    @Override
    public Tipo getTipo(Long id) {
        Tipo tipo = tipoRepo.findById(id).orElse(null);
        return tipo;
    }

}
