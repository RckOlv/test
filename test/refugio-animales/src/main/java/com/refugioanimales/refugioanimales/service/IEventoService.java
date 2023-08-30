package com.grupo13.refugioAnimales.service;

import com.grupo13.refugioAnimales.model.Evento;
import java.util.List;


public interface IEventoService {
    
    public List<Evento> getEventos();

    public void saveEvento(Evento evento);

    public void deleteEvento(Long id);

    public void editEvento(Evento evento);

    public Evento getEvento(Long id);
    
}
