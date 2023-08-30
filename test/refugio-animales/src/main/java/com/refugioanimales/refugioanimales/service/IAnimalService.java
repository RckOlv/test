package com.grupo13.refugioAnimales.service;

import com.grupo13.refugioAnimales.model.Animal;
import java.util.List;


public interface IAnimalService {
    
    public List<Animal> getAnimales();

    public void saveAnimal(Animal animal);

    public void deleteAnimal(Long id);

    public void editAnimal(Animal animal);

    public Animal getAnimal(Long id);
    
}

