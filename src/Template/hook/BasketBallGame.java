package Template.hook;

public class BasketBallGame extends Game {
    @Override
    void init() {
        System.out.println("篮球游戏初始化成功");
    }

    @Override
    void start() {
        System.out.println("开始打篮球啦！！");
    }

    @Override
    void end() {
        System.out.println("篮球游戏结束");
    }

    @Override
    void cheat() {
        System.out.println("我开外挂啦。。。。。。。。。等下秒赢");
    }
}
