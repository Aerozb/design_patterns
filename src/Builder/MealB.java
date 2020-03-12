package Builder;

/**
 * 实现抽象接口，构建和装配各个部件。
 */
public class MealB extends MealBulider {
    
    @Override
    public void buildFood() {
        meal.setFood("鸡翅");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("柠檬汁");
    }
}
