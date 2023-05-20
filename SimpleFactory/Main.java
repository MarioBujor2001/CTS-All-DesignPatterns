package simpleFactory;

import simpleFactory.Pizza;
import simpleFactory.PizzaType;
import simpleFactory.PizzaFactory;

public class Main {
    public static void main(String[] args) {
        Pizza cheesePizza = PizzaFactory.createPizza(PizzaType.Cheese);
        Pizza peperoniPizza = PizzaFactory.createPizza(PizzaType.Peperoni);
        Pizza quatroStagioniPizza = PizzaFactory.createPizza(PizzaType.Quatro_Stagioni);
    }
}