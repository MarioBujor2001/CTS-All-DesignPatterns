package factoryMethod;

public class Main {
    public static void main(String[] args) {
        AnimalFactory<Dog> af1;
        AnimalFactory<Cat> af2;
        af1 = new DogFactory();
        af2 = new CatFactory();

        Animal dog = af1.createAnimal();
        Animal cat = af2.createAnimal();
    }
}
