package Decorator;

import Decorator.Component.Jack;
import Decorator.Component.People;
import Decorator.decorator.DecoratorShirt;
import Decorator.decorator.DecoratorSuit;

public class Client {
    public static void main(String[] args) {
        People people =new DecoratorShirt(new DecoratorSuit(new Jack()));
        people.wear();
    }
}
