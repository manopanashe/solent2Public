/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.solent.com504.factoryandfacade.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.model.FarmFacade;

/**
 *
 * @author manop
 */
public class FarmFacadeImpl implements FarmFacade {
    List<Animal> animals = new ArrayList<Animal>();
    

    @Override
    public List<Animal> getAllAnimals() {
     
         return animals;
    }

    @Override
    public void addDog(String name) {
        
        Animal dog = null;
        
       animals.add(dog);
       dog.setName("felio");
    }

    @Override
    public void addCat(String name) {
        Animal cat = null;
              animals.add(cat);

    }

    @Override
    public void addCow(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
