package Template.hook;

public abstract class Game {
    abstract void init();
    abstract void start();
    abstract void end();

    //开挂
    abstract void cheat();

    //规定算法结构
    final void paly(){
        //初始化游戏
        init();
        //子类有实现，则开挂
        cheat();
        //开始游戏
        start();
        //结束游戏
        end();
    }
}
