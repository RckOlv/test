package com.grupo13.refugioAnimales.service;

import com.grupo13.refugioAnimales.model.Evento;
import com.grupo13.refugioAnimales.repository.IEventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService implements IEventoService{
    
    @Autowired
    private IEventoRepository eventoRepo;

    @Override
    public List<Evento> getEventos() {
        List<Evento> listaEvento = eventoRepo.findAll();
        return listaEvento;
    }

    @Override
    public void saveEvento(Evento evento) {
        eventoRepo.save(evento);
    }

    @Override
    public void deleteEvento(Long id) {
       eventoRepo.deleteById(id);
    }

    @Override
    public void editEvento(Evento evento) {
        this.saveEvento(evento);
    }

    @Override
    public Evento getEvento(Long id) {
        Evento evento =  eventoRepo.findById(id).orElse(null);
        return evento;
    }

}
