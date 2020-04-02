package Observer;

public class Client {
    public static void main(String[] args) {
        System.out.println("新浪");
        Observer sina = new Sina();
        Subject weatherAPI = new WeatherAPI();
        weatherAPI.registerObserver(sina);
        weatherAPI.setData(16,51,999);

        System.out.println("===============");
        //移除新浪
        weatherAPI.removeObserver(sina);
        System.out.println("百度");
        Observer baiDu = new BaiDu();
        weatherAPI.registerObserver(baiDu);
        weatherAPI.setData(22,66,666);
    }
}
