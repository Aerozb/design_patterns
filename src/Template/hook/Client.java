package Template.hook;

public class Client {
    public static void main(String[] args) {
        Game b=new BasketBallGame();
        b.paly();
        System.out.println();
        Game f=new FootBallGame();
        f.paly();
    }
}
