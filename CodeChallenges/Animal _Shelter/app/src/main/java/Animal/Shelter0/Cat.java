package Animal.Shelter0;


public class Cat implements Animal{
    private String name;

    public Cat(String name){
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}