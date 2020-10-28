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
import org.solent.com504.factoryandfacade.model.Dog;
import org.solent.com504.factoryandfacade.model.FarmFacade;

/**
 *
 * @author cgallen
 */
public class FarmFacadeTest {

    FarmFacade farmFacade = null;

    @Test
    public void FarmFacadeTest() {
      FarmFacade farmFacade = AnimalObjectFactory.getFarmFacade();
      assertNotNull(farmFacade);  

    }
     @Test
     public void testAddDog(){
     FarmFacade farmFacade = AnimalObjectFactory.getFarmFacade();
     farmFacade.addDog("Felio");
     
      
      
     }

}
