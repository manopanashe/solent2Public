/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.factoryandfacade.springimpl;

import java.util.ArrayList;
import java.util.List;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.model.FarmFacade;

/**
 *
 * @author cgallen
 */
public class FarmFacadeImpl implements FarmFacade {

    private List<Animal> animals = new ArrayList<Animal>();
    

    @Override
    public List<Animal> getAllAnimals() {
         return new ArrayList<Animal>(animals);
    }

    @Override
    public void addDog(String name) {  
      Animal animal = AnimalObjectFactory.createDog();
      animal.setName("Max");
      animals.add(animal);
    }

    @Override
    public void addCat(String name) {
 Animal animal = AnimalObjectFactory.createDog();          
 animal.setName("felix");
 animals.add(animal);
    }

    @Override
    public void addCow(String name) {
         Animal animal = AnimalObjectFactory.createDog();
        animal.setName("Mary");
        animals.add(animal);
    }
}
