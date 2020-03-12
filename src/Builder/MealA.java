package Builder;

/**
 * 实现抽象接口，构建和装配各个部件。
 */
public class MealA extends MealBulider {

    @Override
    public void buildFood() {
        meal.setFood("汉堡");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }
}
