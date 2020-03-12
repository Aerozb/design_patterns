package Builder;

public class Client {
    public static void main(String[] args) {
        //套餐A
        MealA mealA=new MealA();
        //准备套餐A的服务员
        KFCWaiter kfcWaiter=new KFCWaiter(mealA);
        //获得套餐
        Meal construct = kfcWaiter.construct();
        System.out.println(construct);
    }
}
