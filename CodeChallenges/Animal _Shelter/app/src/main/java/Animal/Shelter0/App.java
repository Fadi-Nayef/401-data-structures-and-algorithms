/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Animal.Shelter0;

public class App {


    public static void main(String[] args) {
        AnimalShelter testAnimalShelter =new AnimalShelter() ;

        Dog dogTest = new Dog("Ginger");
        Cat catTest = new Cat("Lucy");
        Dog dogTest2 = new Dog("Ginger2");
        Cat catTest2 = new Cat("Lucy2");
        Dog dogTest3 = new Dog("Ginger3");
        Cat catTest3 = new Cat("Lucy3");

        testAnimalShelter.enqueue(dogTest);
        testAnimalShelter.enqueue(catTest);
        testAnimalShelter.enqueue(dogTest2);
        testAnimalShelter.enqueue(catTest2);
        testAnimalShelter.enqueue(dogTest3);
        testAnimalShelter.enqueue(catTest3);

        System.out.println(testAnimalShelter.dequeue("DOG"));
        System.out.println(testAnimalShelter);

    }
}