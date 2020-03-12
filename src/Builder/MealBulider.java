package Builder;

/**
 * 创建一个Product对象的各个部件指定的抽象接口。
 */

public abstract class MealBulider {

    /**
     * 由子类设置Meal里的值，通过以下两个build方法，最后再返回getMeal
     */
    protected Meal meal=new Meal();

    public abstract void buildFood();
    public abstract void buildDrink();

    public Meal getMeal(){
        return meal;
    }
}
