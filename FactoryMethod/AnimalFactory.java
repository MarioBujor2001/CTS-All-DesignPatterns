package factoryMethod;

import java.util.List;

public interface AnimalFactory<T extends Animal> {
    T createAnimal();
}
