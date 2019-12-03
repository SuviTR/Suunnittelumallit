package command;

public class Main {

    public static void main(String[] args) {
        Screen silverScreen = new Screen();
        Command switchUp = new FlipUpCommand(silverScreen);
        Command switchDown = new FlipDownCommand(silverScreen);
        WallButton button1 = new WallButton(switchUp);
        WallButton button2 = new WallButton(switchDown);
        button1.push();
        button2.push();
    }

}
