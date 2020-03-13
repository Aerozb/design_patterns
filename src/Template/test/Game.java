package Template.test;

public abstract class Game {
    abstract void init();
    abstract void start();
    abstract void end();

    //规定算法结构
    final void paly(){
        //初始化游戏
        init();
        //开始游戏
        start();
        //结束游戏
        end();
    }
}
