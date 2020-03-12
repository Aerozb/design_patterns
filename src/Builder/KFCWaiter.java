package Builder;

public class KFCWaiter {
    private MealBulider mealBulider;

    public KFCWaiter(MealBulider mealBulider) {
        this.mealBulider = mealBulider;
    }

    public Meal construct(){
        mealBulider.buildFood();
        mealBulider.buildDrink();
        return mealBulider.getMeal();
    }

}
