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
import java.util.Map;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.model.Cat;
import org.solent.com504.factoryandfacade.model.Cow;
import org.solent.com504.factoryandfacade.model.Dog;
import org.solent.com504.factoryandfacade.model.FarmFacade;

/**
 *
 * @author manop
 */
public class FarmFacadeImpl implements FarmFacade {
    Map<String, Animal> animals = new HashMap<String, Animal>();
    

    @Override
    public List<Animal> getAllAnimals() {
         List<Animal> animalList = new ArrayList<Animal>();
         for(Animal a : animalList){
            //do something with animal here
          animalList.add(a);
         }
     
         return animalList;
    }

    @Override
    public void addDog(String name) {  
       animals.put("Max",new Dog());
      
    }

    @Override
    public void addCat(String name) {
              animals.put("Felix",new Cat());

    }

    @Override
    public void addCow(String name) {
        animals.put("Mary",new Cow());
    }
}
