package Template.hook;

public class FootBallGame extends Game {
    @Override
    void init() {
        System.out.println("足球游戏初始化成功");
    }

    @Override
    void start() {
        System.out.println("开始打足球啦！！");
    }

    @Override
    void end() {
        System.out.println("足球游戏结束");
    }

    @Override
    void cheat() {

    }
}
