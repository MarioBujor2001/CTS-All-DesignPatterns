package simpleFactory;

import simpleFactory.CheesePizza;
import simpleFactory.PeperoniPizza;
import simpleFactory.Pizza;
import simpleFactory.PizzaType;

public class PizzaFactory {
    public static Pizza createPizza(PizzaType type){
        switch (type){
            case Cheese -> new CheesePizza();
            case Peperoni -> new PeperoniPizza();
            case Quatro_Stagioni -> new QuatroStagioniPizza();
        }
        return null;
    }
}
