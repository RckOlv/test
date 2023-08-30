/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo13.refugioAnimales.controller;

import com.grupo13.refugioAnimales.model.Animal;
import com.grupo13.refugioAnimales.service.IAnimalService;
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
public class AnimalController {
    
    @Autowired
    private IAnimalService animalService;
    
    @GetMapping("/animales/traer")
    public List<Animal> getAnimales(){
        List<Animal> listaAnimales = animalService.getAnimales();
        return listaAnimales;
    }
    
    @GetMapping("/animal/traer/{id}")
    public Animal getAnimal(@PathVariable Long id){
        Animal animal = animalService.getAnimal(id);
        return animal;
    }
    
    @PostMapping("/animal/crear")
    public void saveAnimal(@RequestBody Animal animal){
        animalService.saveAnimal(animal);
    }
    
    @PutMapping("/animal/editar")
    public void editAnimal(@RequestBody Animal animal){
        animalService.editAnimal(animal);
    }
    
    @DeleteMapping("/animal/borrar/{id}")
    public void deleteAnimal(@PathVariable Long id){
        animalService.deleteAnimal(id);
    }
    
}
