package Animal.Shelter0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class AnimalShelterTest {

    @Test
    public void shelterTest(){
var shelterDog = new AnimalShelter();
      var  shelterCat=new AnimalShelter ();

        Dog dog1 = new Dog("dog1");
        Dog dog2 = new Dog("dog2");
        Dog dog3 = new Dog("dog3");

        Cat cat1 = new Cat("cat1");
        Cat cat2 = new Cat("cat2");
        Cat cat3 = new Cat("cat3");

        shelterDog.enqueue(dog1);
        shelterCat.enqueue(cat1);
        shelterDog.enqueue(dog2);
        shelterCat.enqueue(cat2);
        shelterDog.enqueue(dog3);
        shelterCat.enqueue(cat3);

        Assertions.assertEquals("Dog{name='dog1'} --> Dog{name='dog2'} --> Dog{name='dog3'} --> Null",shelterDog.toString());
        Assertions.assertEquals("Cat{name='cat1'} --> Cat{name='cat2'} --> Cat{name='cat3'} --> Null",shelterCat.toString());

        Assertions.assertEquals("Dog{name='dog3'} --> Dog{name='dog2'} --> Dog{name='dog1'} --> Null",shelterDog.toString());
        Assertions.assertEquals("Cat{name='cat3'} --> Cat{name='cat2'} --> Cat{name='cat1'} --> Null",shelterCat.toString());
    }
}
