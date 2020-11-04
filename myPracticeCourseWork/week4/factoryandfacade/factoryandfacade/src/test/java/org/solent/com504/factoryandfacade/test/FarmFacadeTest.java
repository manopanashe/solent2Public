package org.solent.com504.factoryandfacade.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.impl.AnimalObjectFactory;
import org.solent.com504.factoryandfacade.model.Cat;
import org.solent.com504.factoryandfacade.model.Cow;
import org.solent.com504.factoryandfacade.model.Dog;
import org.solent.com504.factoryandfacade.model.FarmFacade;

/**
 *
 * @author cgallen
 */
public class FarmFacadeTest {

    FarmFacade farmFacade = null;
    
    List<String> animals = null;

    @Test
    public void FarmFacadeTest() {
      FarmFacade farmFacade = AnimalObjectFactory.getFarmFacade();
      assertNotNull(farmFacade);  
      
    }
     
    @Test 
    public void addDogTest(){
        Animal dog1 = new Dog();      
        Animal dog2 = new Dog();
        animals.add("Max");
         System.out.println("size of map:" + animals.size());
    }
    
    @Test 
    public void addCatTest(){
     Animal cat1 = new Cat();
        Animal cat2 = new Cat();
    }
    
    @Test
    public void addCowTest(){
    Animal cow1 = new Cow();
    Animal cow2 = new Cow();
    
    }

}
