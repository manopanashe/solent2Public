package org.solent.com504.factoryandfacade.impl;

import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.model.Cat;
import org.solent.com504.factoryandfacade.model.Cow;
import org.solent.com504.factoryandfacade.model.Dog;
import org.solent.com504.factoryandfacade.model.FarmFacade;

public class AnimalObjectFactory{
 
    public static Animal createCat() {
        Cat cat = (Cat) new Cat();
        return cat;
    }

    public static Animal createDog() {
        Dog dog = (Dog) new Dog();
        return dog;
    }

    public static Animal createCow() {
        Cow cow = (Cow) new Cow();
        return cow;
    }
    

    public static FarmFacade getFarmFacade() {
        FarmFacade farmFacade = (FarmFacade) new FarmFacadeImpl();
        return farmFacade;
    }
}
