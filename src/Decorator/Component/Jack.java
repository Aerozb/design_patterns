package Decorator.Component;

/**
 * 具体的对象，该对象将被附加一些额外的操作
 */
public class Jack extends People {
    @Override
    public void wear() {
        System.out.println("该穿什么衣服呢");
    }
}
