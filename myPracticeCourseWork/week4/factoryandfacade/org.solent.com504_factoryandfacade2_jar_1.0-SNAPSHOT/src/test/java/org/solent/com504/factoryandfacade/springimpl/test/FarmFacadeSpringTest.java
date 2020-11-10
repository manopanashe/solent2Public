package org.solent.com504.factoryandfacade.springimpl.test;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.springimpl.AnimalObjectFactory;
import org.solent.com504.factoryandfacade.model.FarmFacade;

/**
 *
 * @author cgallen
 */
public class FarmFacadeSpringTest {

     FarmFacade farmFacade = null;

    List<String> animals = null;

    @Test
    public void FarmFacadeTest() {
        FarmFacade farmFacade = AnimalObjectFactory.getFarmFacade();
        assertNotNull(farmFacade);
         List<Animal> animals = farmFacade.getAllAnimals();
        assertTrue(animals.isEmpty());
        //testDog
        String dogName = "Max";
        farmFacade.addDog(dogName);
        animals = farmFacade.getAllAnimals();
        assertEquals(1, animals.size());
        assertEquals(dogName, animals.get(0).getName());
        
        
   
        System.out.println("name of dog" + dogName);
        System.out.println("size of map:" + animals.size());

    }
    
    @Test
    public void addCatTest(){
    FarmFacade farmFacade = AnimalObjectFactory.getFarmFacade();
        assertNotNull(farmFacade);
         List<Animal> animals = farmFacade.getAllAnimals();
        assertTrue(animals.isEmpty());
        
        String catName = "felix";
        farmFacade.addCat(catName);
        animals = farmFacade.getAllAnimals();
        assertEquals(1,animals.size());
        assertEquals(catName, animals.get(0).getName());
        
         System.out.println("name of dog" + catName);
        System.out.println("size of map:" + animals.size());
    }

}
