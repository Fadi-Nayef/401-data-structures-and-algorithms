package Animal.Shelter0;

public class Dog implements Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }


    public String stryngifying() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
