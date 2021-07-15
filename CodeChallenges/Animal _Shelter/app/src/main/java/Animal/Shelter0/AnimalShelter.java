package Animal.Shelter0;

import java.util.Locale;

public class AnimalShelter {
    private final Queue <Animal> dog;
    private final Queue <Animal> cat;

    public AnimalShelter() {
        dog= new Queue<>();
        cat= new Queue<>();
    }


    void enqueue(Animal animal){
        if (animal instanceof Cat){
            cat.enqueue(animal);
        }else if(animal instanceof Dog){
            dog.enqueue(animal);
        }
    }

    public String dequeue(String pref){
        if (pref.equals("cat")&& !cat.isEmpty()){
            return cat.dequeue();
        }else if (pref.equals("dog")&& !dog.isEmpty()){
            return dog.dequeue();
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        if(dog.front!=null){
            return dog.toString();
        }
        if(cat.front!=null){
            return cat.toString();
        }

        else {
            return "The queue is empty!!";
        }
    }

}