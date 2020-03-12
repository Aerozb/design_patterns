package Decorator.decorator;

import Decorator.Component.People;

/**
 * 装饰者类，持有一个将要被装饰者的接口对象实例
 */
public class Decorator extends People {

    public People people;

    //记得生成带参构造，用来给被装饰者赋值
    public Decorator(People people) {
        this.people = people;
    }

    @Override
    public void wear() {
        people.wear();
    }
}
