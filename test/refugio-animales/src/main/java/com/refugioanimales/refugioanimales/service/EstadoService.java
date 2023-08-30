package com.grupo13.refugioAnimales.service;

import com.grupo13.refugioAnimales.model.Estado;
import com.grupo13.refugioAnimales.repository.IEstadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoService implements IEstadoService{
    
    @Autowired
    private IEstadoRepository estadoRepo;

    @Override
    public List<Estado> getEstados() {
        List<Estado> listaEstado = estadoRepo.findAll();
        return listaEstado;
    }

    @Override
    public void saveEstado(Estado estado) {
        estadoRepo.save(estado);
    }

    @Override
    public void deleteEstado(Long id) {
        estadoRepo.deleteById(id);
    }

    @Override
    public void editEstado(Estado estado) {
        this.saveEstado(estado);
    }

    @Override
    public Estado getEstado(Long id) {
        Estado estado =  estadoRepo.findById(id).orElse(null);
        return estado;
    }

}
