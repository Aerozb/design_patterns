package Decorator.decorator;

import Decorator.Component.People;

/**
 * 具体的装饰者类，负责给增加附加的操作：穿衬衫
 */
public class DecoratorShirt extends Decorator {

    public DecoratorShirt(People people) {
        super(people);
    }

    public void  wear(){
        super.wear();
        System.out.println("穿衬衫");
    }
}
