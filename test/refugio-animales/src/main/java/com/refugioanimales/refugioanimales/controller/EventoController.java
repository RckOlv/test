/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo13.refugioAnimales.controller;

import com.grupo13.refugioAnimales.model.Evento;
import com.grupo13.refugioAnimales.service.IEventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventoController {
    
    @Autowired
    private IEventoService eventoService;
    
    @GetMapping("/eventos/traer")
    public List<Evento> getEventos(){
        List<Evento> listaEventos = eventoService.getEventos();
        return listaEventos;
    }
    
    @GetMapping("/evento/traer/{id}")
    public Evento getEvento(@PathVariable Long id){
        Evento evento = eventoService.getEvento(id);
        return evento;
    }
    
    @PostMapping("/evento/crear")
    public void saveEvento(@RequestBody Evento evento){
        eventoService.saveEvento(evento);
    }
    
    @PutMapping("/evento/editar")
    public void editEvento(@RequestBody Evento evento){
        eventoService.editEvento(evento);
    }
    
    @DeleteMapping("/evento/borrar/{id}")
    public void deleteEvento(@PathVariable Long id){
        eventoService.deleteEvento(id);
    }
    
}
